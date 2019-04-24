package us.pz.messaging.comparator.messages;

import lombok.AllArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@AllArgsConstructor
@Service
class FileRetriever {
    private final FileProperties fileProperties;

    public File get1KbFile() {
        return getFile(fileProperties.getFile1kb());
    }

    public File get1MbFile() {
        return getFile(fileProperties.getFile1mb());
    }

    public File get10MbFile() {
        return getFile(fileProperties.getFile10mb());
    }

    public File get100MbFile() {
        return getFile(fileProperties.getFile100mb());
    }

    public File get1GbFile() {
        return getFile(fileProperties.getFile1Gb());
    }

    private File getFile(String fileName) {
        try {
            return new ClassPathResource(fileName).getFile();
        } catch (IOException e) {
            throw new RuntimeException("Could not retrieve file: " + fileName, e);
        }
    }
}
