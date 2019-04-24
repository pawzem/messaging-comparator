package us.pz.messaging.comparator.kafka;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Log4j2
class KafkaListeners {

    @KafkaListener(id = "1kb", topics = "test")
    public void listen1kb(String message) {
        log.info("received 1kb message");
    }

    @KafkaListener(id = "1Mb", topics = "test")
    public void listen1Mb(String message) {
        log.info("received 1Mb message");
    }

    @KafkaListener(id = "10Mb", topics = "test")
    public void listen10Mb(String message) {
        log.info("received 10Mb message");
    }

    @KafkaListener(id = "100Mb", topics = "test")
    public void listen100Mb(String message) {
        log.info("received 100Mb message");
    }

    @KafkaListener(id = "1Gb", topics = "test")
    public void listen1Gb(String message) {
        log.info("received 1Gb message");
    }


}
