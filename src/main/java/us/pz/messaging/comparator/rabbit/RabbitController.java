package us.pz.messaging.comparator.rabbit;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
class RabbitController {

    private final RabbitFacade rabbitFacade;

    @GetMapping("/rabbit")
    Resource getResources() {
        return new Resource<>("Rabbit links",
                linkTo(methodOn(RabbitController.class).send1KbMessage()).withSelfRel(),
                linkTo(methodOn(RabbitController.class).send100KbMessage()).withSelfRel(),
                linkTo(methodOn(RabbitController.class).send1MbMessage()).withSelfRel(),
                linkTo(methodOn(RabbitController.class).send10MbMessage()).withSelfRel(),
                linkTo(methodOn(RabbitController.class).send100MbMessage()).withSelfRel(),
                linkTo(methodOn(RabbitController.class).send1GbMessage()).withSelfRel(),
                linkTo(methodOn(RabbitController.class).sendGrowingMessage()).withSelfRel()
        );
    }

    @PostMapping("/rabbit/1kb")
    ResponseEntity send1KbMessage() {
        rabbitFacade.send1KbMessage();
        return new ResponseEntity(OK);
    }

    @PostMapping("/rabbit/100kb")
    ResponseEntity send100KbMessage() {
        rabbitFacade.send100KbMessage();
        return new ResponseEntity(OK);
    }

    @PostMapping("/rabbit/1mb")
    ResponseEntity send1MbMessage() {
        rabbitFacade.send1MbMessage();
        return new ResponseEntity(OK);
    }


    @PostMapping("/rabbit/10mb")
    ResponseEntity send10MbMessage() {
        rabbitFacade.send10MbMessage();
        return new ResponseEntity(OK);
    }


    @PostMapping("/rabbit/100mb")
    ResponseEntity send100MbMessage() {
        rabbitFacade.send100MbMessage();
        return new ResponseEntity(OK);
    }


    @PostMapping("/rabbit/1gb")
    ResponseEntity send1GbMessage() {
        rabbitFacade.send1GbMessage();
        return new ResponseEntity(OK);
    }


    @PostMapping("/rabbit/growing")
    ResponseEntity sendGrowingMessage() {
        rabbitFacade.sendGrowingMessages();
        return new ResponseEntity(OK);
    }

}
