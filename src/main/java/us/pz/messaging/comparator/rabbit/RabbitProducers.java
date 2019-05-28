package us.pz.messaging.comparator.rabbit;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import us.pz.messaging.comparator.messages.MessagesFacade;

import static us.pz.messaging.comparator.rabbit.RabbitConfiguration.TOPIC_EXCHANGE_NAME;

@Service
@AllArgsConstructor
@Slf4j
class RabbitProducers {
    private RabbitTemplate rabbitTemplate;
    private MessagesFacade messagesFacade;

    public void send1KbMessage() {
        log.info("sending 1kb message");
        rabbitTemplate.convertAndSend(TOPIC_EXCHANGE_NAME, "rabbit.topic.1kb", messagesFacade.getMessage1Kb());
    }

    public void send1MbMessage() {
        log.info("sending 1mb message");
        rabbitTemplate.convertAndSend(TOPIC_EXCHANGE_NAME, "rabbit.topic.1Mb", messagesFacade.getMessage1Mb());
    }

    public void send10MbMessage() {
        log.info("sending 10mb message");
        rabbitTemplate.convertAndSend(TOPIC_EXCHANGE_NAME, "rabbit.topic.10Mb", messagesFacade.getMessage10Mb());
    }

    public void send100MbMessage() {
        log.info("sending 100mb message");
        rabbitTemplate.convertAndSend(TOPIC_EXCHANGE_NAME, "rabbit.topic.100Mb", messagesFacade.getMessage100Mb());
    }

    public void send1GbMessage() {
        log.info("sending 1gb message");
        rabbitTemplate.convertAndSend(TOPIC_EXCHANGE_NAME, "rabbit.topic.1Gb", messagesFacade.getMessage1Gb());
    }
}
