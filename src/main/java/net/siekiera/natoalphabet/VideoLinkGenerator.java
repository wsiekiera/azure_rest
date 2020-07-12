package net.siekiera.natoalphabet;

import org.springframework.stereotype.Service;

@Service
public class VideoLinkGenerator {
    private static final String prefix = "https://acme.streaming.mediaservices.windows.net/";
    private static final String sufix = "/acme_wishes.ism/manifest";
    public VideoLink generate(String secretCode) {
        String publishUrl = prefix.concat(secretCode).concat(sufix);
        return new VideoLink(publishUrl);
    }
}
