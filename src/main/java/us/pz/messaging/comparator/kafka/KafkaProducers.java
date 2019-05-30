package us.pz.messaging.comparator.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import us.pz.messaging.comparator.messages.MessagesFacade;

@Service
@RequiredArgsConstructor
@Slf4j
class KafkaProducers {
    private final KafkaTemplate<String, String> template;
    private final MessagesFacade messagesFacade;
    private String message = "";

    public void send1KbMessage() {
        log.info("sending 1kb message");
        template.send("single-partition-1kb", messagesFacade.getMessage1Kb());
    }

    public void send100KbMessage() {
        log.info("sending 1kb message");
        template.send("single-partition-100kb", messagesFacade.getMessage100Kb());
    }

    public void send1MbMessage() {
        log.info("sending 1mb message");
        template.send("single-partition-1Mb", messagesFacade.getMessage1Mb());
    }

    public void send10MbMessage() {
        log.info("sending 10mb message");
        template.send("single-partition-10Mb", messagesFacade.getMessage10Mb());
    }

    public void send100MbMessage() {
        log.info("sending 100mb message");
        template.send("single-partition-100Mb", messagesFacade.getMessage100Mb());
    }

    public void send1GbMessage() {
        log.info("sending 1gb message");
        template.send("single-partition-1Gb", messagesFacade.getMessage1Gb());
    }

    public void sendGrowingMessage() {
        message += messagesFacade.getMessage1Kb();
        log.info("sending growing message with length {}", message.length());
        template.send("single-partition-growing", message);

    }

}
