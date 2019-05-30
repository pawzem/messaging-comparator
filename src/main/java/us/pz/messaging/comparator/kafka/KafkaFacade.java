package us.pz.messaging.comparator.kafka;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import us.pz.messaging.comparator.messages.MessagesFacade;

@Service
@AllArgsConstructor
public class KafkaFacade {
    private final KafkaProducers kafkaProducers;
    private final MessagesFacade messagesFacade;

    public void send1KbMessage() {
        kafkaProducers.send1KbMessage();
    }

    public void send100KbMessage() {
        kafkaProducers.send100KbMessage();
    }

    public void send1MbMessage() {
        kafkaProducers.send1MbMessage();
    }

    public void send10MbMessage() {
        kafkaProducers.send10MbMessage();
    }

    public void send100MbMessage() {
        kafkaProducers.send100MbMessage();
    }

    public void send1GbMessage() {
        kafkaProducers.send1GbMessage();
    }

    public void sendGrowingMessages() {
        kafkaProducers.sendGrowingMessage();
    }
}
