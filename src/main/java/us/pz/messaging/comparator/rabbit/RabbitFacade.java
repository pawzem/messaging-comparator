package us.pz.messaging.comparator.rabbit;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class RabbitFacade {

    private final RabbitProducers rabbitProducers;

    public void send1KbMessage() {
        rabbitProducers.send1KbMessage();
    }

    public void send100KbMessage() {
        rabbitProducers.send100KbMessage();
    }

    public void send1MbMessage() {
        rabbitProducers.send1MbMessage();

    }

    public void send10MbMessage() {
        rabbitProducers.send10MbMessage();
    }

    public void send100MbMessage() {
        rabbitProducers.send100MbMessage();

    }

    public void send1GbMessage() {
        rabbitProducers.send1GbMessage();
    }
}
