package us.pz.messaging.comparator.rabbit;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Log4j2
class RabbitListeners {

    @RabbitListener(queues = {RabbitConfiguration.topic1kbQueueName})
    public void listen1kb(String message) {
        log.info("received 1kb message");
    }

    @RabbitListener(queues = {RabbitConfiguration.topic1MbQueueName})
    public void listen1Mb(String message) {
        log.info("received 1Mb message");
    }

    @RabbitListener(queues = {RabbitConfiguration.topic10MbQueueName})
    public void listen10Mb(String message) {
        log.info("received 10Mb message");
    }

    @RabbitListener(queues = {RabbitConfiguration.topic100MbQueueName})
    public void listen100Mb(String message) {
        log.info("received 100Mb message");
    }

    @RabbitListener(queues = {RabbitConfiguration.topic1GbQueueName})
    public void listen1Gb(String message) {
        log.info("received 1Gb message");
    }


}
