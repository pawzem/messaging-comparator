package us.pz.messaging.comparator.rabbit;

import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import us.pz.messaging.comparator.messages.MessagesFacade;

@AllArgsConstructor
@Service
public class RabbitFacade {

    private final RabbitTemplate rabbitTemplate;
    private final MessagesFacade messagesFacade;

    public void send1KbMessage() {
        rabbitTemplate.convertAndSend("rabbit.topic.1kb", messagesFacade.getMessage1Kb());
    }

    public void send1MbMessage() {
        rabbitTemplate.convertAndSend("rabbit.topic.1Mb", messagesFacade.getMessage1Mb());

    }

    public void send10MbMessage() {
        rabbitTemplate.convertAndSend("rabbit.topic.10Mb", messagesFacade.getMessage10Mb());
    }

    public void send100MbMessage() {
        rabbitTemplate.convertAndSend("rabbit.topic.100Mb", messagesFacade.getMessage100Mb());

    }

    public void send1GbMessage() {
        rabbitTemplate.convertAndSend("rabbit.topic.1Gb", messagesFacade.getMessage1Gb());

    }
}
