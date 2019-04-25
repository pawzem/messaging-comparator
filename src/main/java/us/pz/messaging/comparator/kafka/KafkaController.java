package us.pz.messaging.comparator.kafka;

import lombok.AllArgsConstructor;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import static org.springframework.http.HttpStatus.OK;

@RestController
@AllArgsConstructor
class KafkaController {
    private final KafkaFacade kafkaFacade;


    @GetMapping("/kafka")
    Resource getResources() {
        return new Resource<>("Kafka links",
                linkTo(methodOn(KafkaController.class).send1KbMessage()).withSelfRel(),
                linkTo(methodOn(KafkaController.class).send1MbMessage()).withSelfRel(),
                linkTo(methodOn(KafkaController.class).send10MbMessage()).withSelfRel(),
                linkTo(methodOn(KafkaController.class).send100MbMessage()).withSelfRel(),
                linkTo(methodOn(KafkaController.class).send1GbMessage()).withSelfRel()
        );
    }

    @PostMapping("/kafka/1kb")
    ResponseEntity send1KbMessage() {
        kafkaFacade.send1KbMessage();
        return new ResponseEntity(OK);
    }

    @PostMapping("/kafka/1mb")
    ResponseEntity send1MbMessage() {
        kafkaFacade.send1MbMessage();
        return new ResponseEntity(OK);
    }


    @PostMapping("/kafka/10mb")
    ResponseEntity send10MbMessage() {
        kafkaFacade.send10MbMessage();
        return new ResponseEntity(OK);
    }


    @PostMapping("/kafka/100mb")
    ResponseEntity send100MbMessage() {
        kafkaFacade.send100MbMessage();
        return new ResponseEntity(OK);
    }


    @PostMapping("/kafka/1gb")
    ResponseEntity send1GbMessage() {
        kafkaFacade.send1GbMessage();
        return new ResponseEntity(OK);
    }

}
