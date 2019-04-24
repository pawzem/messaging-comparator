package us.pz.messaging.comparator.messages;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = FileProperties.class)
public class MessagesConfiguration {
}
