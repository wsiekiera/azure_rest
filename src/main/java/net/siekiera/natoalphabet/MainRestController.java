package net.siekiera.natoalphabet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
    private static final Logger logger = LoggerFactory.getLogger(MainRestController.class);

    @Autowired
    AlphabetRepository alphabetRepository;

    @GetMapping("/")
    public NatoAlphabet getOne(@RequestParam(name = "letter", required = true) String letter) {
        long startTime = System.nanoTime();
        NatoAlphabet natoAlphabetEntry = alphabetRepository.findByLetter(letter.charAt(0));
        long endTime = System.nanoTime();
        logger.info("Requested data for letter \"" + letter + "\". Processing time=" + (endTime-startTime)/1000000 + " ms");
        return natoAlphabetEntry;
    }
}
