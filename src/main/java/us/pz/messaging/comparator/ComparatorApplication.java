package us.pz.messaging.comparator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import us.pz.messaging.comparator.kafka.KafkaFacade;
import us.pz.messaging.comparator.messages.MessagesFacade;
import us.pz.messaging.comparator.rabbit.RabbitFacade;


@SpringBootApplication(scanBasePackageClasses = {MessagesFacade.class, KafkaFacade.class, RabbitFacade.class})
public class ComparatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComparatorApplication.class, args);
    }

}
