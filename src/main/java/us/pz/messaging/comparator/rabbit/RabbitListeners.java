package us.pz.messaging.comparator.rabbit;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
class RabbitListeners {

    @RabbitListener(queues = {RabbitConfiguration.TOPIC_1_KB_QUEUE_NAME})
    public void listen1kb(String message) {
        log.info("received 1kb message");
    }

    @RabbitListener(queues = {RabbitConfiguration.TOPIC_100_KB_QUEUE_NAME})
    public void listen100kb(String message) {
        log.info("received 100kb message");
    }

    @RabbitListener(queues = {RabbitConfiguration.TOPIC_1_MB_QUEUE_NAME})
    public void listen1Mb(String message) {
        log.info("received 1Mb message");
    }

    @RabbitListener(queues = {RabbitConfiguration.TOPIC_10_MB_QUEUE_NAME})
    public void listen10Mb(String message) {
        log.info("received 10Mb message");
    }

    @RabbitListener(queues = {RabbitConfiguration.TOPIC_100_MB_QUEUE_NAME})
    public void listen100Mb(String message) {
        log.info("received 100Mb message");
    }

    @RabbitListener(queues = {RabbitConfiguration.TOPIC_1_GB_QUEUE_NAME})
    public void listen1Gb(String message) {
        log.info("received 1Gb message");
    }


}
