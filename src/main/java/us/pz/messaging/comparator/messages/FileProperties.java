package us.pz.messaging.comparator.messages;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "messages")
class FileProperties {
    private String file1kb;
    private String file1mb;
    private String file10mb;
    private String file100mb;
    private String file1Gb;
}
