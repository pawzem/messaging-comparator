package us.pz.messaging.comparator.rabbit;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "exchange")
class ExchangeProperties {
    private String name;
    private String queue1kb;
    private String queue100kb;
    private String queue1mb;
    private String queue10mb;
    private String queue100mb;
    private String queue1gb;
    private String queueGrowing;
    private String routing1kb;
    private String routing100kb;
    private String routing1mb;
    private String routing10mb;
    private String routing100mb;
    private String routing1gb;
    private String routingGrowing;
}
