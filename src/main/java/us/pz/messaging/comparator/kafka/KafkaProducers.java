package us.pz.messaging.comparator.kafka;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import us.pz.messaging.comparator.messages.MessagesFacade;

@Service
@AllArgsConstructor
@Log4j2
class KafkaProducers {
    private KafkaTemplate<String, String> template;
    private MessagesFacade messagesFacade;

    public void send1KbMessage() {
        log.info("sending 1kb message");
        template.send("single-partition-1kb", messagesFacade.getMessage1Kb());
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

}
