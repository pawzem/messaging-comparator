package us.pz.messaging.comparator.messages;

import lombok.Getter;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;

@Service
public class MessagesFacade {

    private final FileRetriever fileRetriever;

    @Getter
    private final String message1Mb;
    @Getter
    private final String message10Mb;
    @Getter
    private final String message100Mb;
    @Getter
    private final String message1Gb;
    @Getter
    private final String message1Kb;

    public MessagesFacade(FileRetriever fileRetriever) throws IOException {
        this.fileRetriever = fileRetriever;
        message1Kb = Files.readString(fileRetriever.get1KbFile().toPath());
        message1Mb = Files.readString(fileRetriever.get1MbFile().toPath());
        message10Mb = Files.readString(fileRetriever.get10MbFile().toPath());
        message100Mb = Files.readString(fileRetriever.get100MbFile().toPath());
        message1Gb = Files.readString(fileRetriever.get1GbFile().toPath());

    }

}
