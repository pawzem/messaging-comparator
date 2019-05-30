package us.pz.messaging.comparator.rabbit;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
class RabbitListeners {

    @RabbitListener(queues = {"${exchange.queue1kb}"})
    public void listen1kb(String message) {
        log.info("received 1kb message");
    }

    @RabbitListener(queues = {"${exchange.queue100kb}"})
    public void listen100kb(String message) {
        log.info("received 100kb message");
    }

    @RabbitListener(queues = {"${exchange.queue1mb}"})
    public void listen1Mb(String message) {
        log.info("received 1Mb message");
    }

    @RabbitListener(queues = {"${exchange.queue10mb}"})
    public void listen10Mb(String message) {
        log.info("received 10Mb message");
    }

    @RabbitListener(queues = {"${exchange.queue100mb}"})
    public void listen100Mb(String message) {
        log.info("received 100Mb message");
    }

    @RabbitListener(queues = {"${exchange.queue1gb}"})
    public void listen1Gb(String message) {
        log.info("received 1Gb message");
    }

    @RabbitListener(queues = {"${exchange.queueGrowing}"})
    public void listenGrowing(String message) {
        log.info("received growing message");
    }


}
