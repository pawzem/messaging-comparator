package us.pz.messaging.comparator.kafka;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "topics")
class TopicProperties {
    private String topic1kb;
    private String topic100kb;
    private String topic1Mb;
    private String topic10Mb;
    private String topic100Mb;
    private String topic1Gb;
    private String topicGrowing;
}
