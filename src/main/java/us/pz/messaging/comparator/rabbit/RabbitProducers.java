package us.pz.messaging.comparator.rabbit;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import us.pz.messaging.comparator.messages.MessagesFacade;

@Service
@RequiredArgsConstructor
@Slf4j
class RabbitProducers {
    private final RabbitTemplate rabbitTemplate;
    private final MessagesFacade messagesFacade;
    private final ExchangeProperties exchangeProperties;
    private String message = "";

    public void send1KbMessage() {
        log.info("sending 1kb message");
        rabbitTemplate.convertAndSend(exchangeProperties.getName(), exchangeProperties.getRouting1kb(), messagesFacade.getMessage1Kb());
    }

    public void send100KbMessage() {
        log.info("sending 100kb message");
        rabbitTemplate.convertAndSend(exchangeProperties.getName(), exchangeProperties.getRouting100kb(), messagesFacade.getMessage1Kb());
    }

    public void send1MbMessage() {
        log.info("sending 1mb message");
        rabbitTemplate.convertAndSend(exchangeProperties.getName(), exchangeProperties.getRouting1mb(), messagesFacade.getMessage1Mb());
    }

    public void send10MbMessage() {
        log.info("sending 10mb message");
        rabbitTemplate.convertAndSend(exchangeProperties.getName(), exchangeProperties.getRouting10mb(), messagesFacade.getMessage10Mb());
    }

    public void send100MbMessage() {
        log.info("sending 100mb message");
        rabbitTemplate.convertAndSend(exchangeProperties.getName(), exchangeProperties.getRouting100mb(), messagesFacade.getMessage100Mb());
    }

    public void send1GbMessage() {
        log.info("sending 1gb message");
        rabbitTemplate.convertAndSend(exchangeProperties.getName(), exchangeProperties.getRouting1gb(), messagesFacade.getMessage1Gb());
    }

    public void sendGrowingMessage() {
        message += messagesFacade.getMessage1Kb();
        log.info("sending growing message with length {}", message.length());
        rabbitTemplate.convertAndSend(exchangeProperties.getName(), exchangeProperties.getRoutingGrowing(), message);
    }
}
