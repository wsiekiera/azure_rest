package net.siekiera.natoalphabet;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@RestController
public class MainRestController {
    final
    SecretCodesRepository secretCodesRepository;
    final
    VideoLinkGenerator videoLinkGenerator;

    public MainRestController(SecretCodesRepository secretCodesRepository, VideoLinkGenerator videoLinkGenerator) {
        this.secretCodesRepository = secretCodesRepository;
        this.videoLinkGenerator = videoLinkGenerator;
    }

    @GetMapping("/api/filmy/acme-wishes")
    public ResponseEntity getOne(@RequestParam(name = "name", required = true) String name, HttpServletResponse httpServletResponse) {
        Optional<SecretCode> secretCode = secretCodesRepository.findByName(name);
        if (secretCode.isPresent()) {
            VideoLink videoLink = videoLinkGenerator.generate(secretCode.get().getTopSecretCode());
            return new ResponseEntity(videoLink, HttpStatus.OK);
        } else {
            return new ResponseEntity("Error 400: Bad request.", HttpStatus.BAD_REQUEST);
        }
    }
}
