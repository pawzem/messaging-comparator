package us.pz.messaging.comparator.kafka;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
class KafkaListeners {

    @KafkaListener(id = "1kb", topics = "${topics.topic1kb}")
    public void listen1kb(String message) {
        log.info("received 1kb message");
    }

    @KafkaListener(id = "100kb", topics = "${topics.topic100kb}")
    public void listen100kb(String message) {
        log.info("received 100kb message");
    }

    @KafkaListener(id = "1Mb", topics = "${topics.topic1Mb}")
    public void listen1Mb(String message) {
        log.info("received 1Mb message");
    }

    @KafkaListener(id = "10Mb", topics = "${topics.topic10Mb}")
    public void listen10Mb(String message) {
        log.info("received 10Mb message");
    }

    @KafkaListener(id = "100Mb", topics = "${topics.topic100Mb}")
    public void listen100Mb(String message) {
        log.info("received 100Mb message");
    }

    @KafkaListener(id = "1Gb", topics = "${topics.topic1Gb}")
    public void listen1Gb(String message) {
        log.info("received 1Gb message");
    }

    @KafkaListener(id = "growing", topics = "${topics.topicGrowing}")
    public void listenGrowing(String message) {
        log.info("received growing message");
    }


}
