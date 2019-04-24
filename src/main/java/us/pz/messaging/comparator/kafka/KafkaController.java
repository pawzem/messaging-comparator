package us.pz.messaging.comparator.kafka;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@AllArgsConstructor
class KafkaController {
    private final KafkaFacade kafkaFacade;

    @PostMapping("kafka/1kb")
    public ResponseEntity send1KbMessage() {
        kafkaFacade.send1KbMessage();
        return new ResponseEntity(OK);
    }

    @PostMapping("kafka/1mb")
    public ResponseEntity send1MbMessage() {
        kafkaFacade.send1MbMessage();
        return new ResponseEntity(OK);
    }


    @PostMapping("kafka/10mb")
    public ResponseEntity send10MbMessage() {
        kafkaFacade.send10MbMessage();
        return new ResponseEntity(OK);
    }


    @PostMapping("kafka/100mb")
    public ResponseEntity send100MbMessage() {
        kafkaFacade.send100MbMessage();
        return new ResponseEntity(OK);
    }


    @PostMapping("kafka/1gb")
    public ResponseEntity send1GbMessage() {
        kafkaFacade.send1GbMessage();
        return new ResponseEntity(OK);
    }

}
