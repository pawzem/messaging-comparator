package us.pz.messaging.comparator.kafka;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
class KafkaListeners {

    @KafkaListener(id = "1kb", topics = "single-partition-1kb")
    public void listen1kb(String message) {
        log.info("received 1kb message");
    }

    @KafkaListener(id = "100kb", topics = "single-partition-100kb")
    public void listen100kb(String message) {
        log.info("received 100kb message");
    }

    @KafkaListener(id = "1Mb", topics = "single-partition-1Mb")
    public void listen1Mb(String message) {
        log.info("received 1Mb message");
    }

    @KafkaListener(id = "10Mb", topics = "single-partition-10Mb")
    public void listen10Mb(String message) {
        log.info("received 10Mb message");
    }

    @KafkaListener(id = "100Mb", topics = "single-partition-100Mb")
    public void listen100Mb(String message) {
        log.info("received 100Mb message");
    }

    @KafkaListener(id = "1Gb", topics = "single-partition-1Gb")
    public void listen1Gb(String message) {
        log.info("received 1Gb message");
    }

    @KafkaListener(id = "growing", topics = "single-partition-growing")
    public void listenGrowing(String message) {
        log.info("received growing message");
    }


}
