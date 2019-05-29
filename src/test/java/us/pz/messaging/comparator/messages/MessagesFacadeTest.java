package us.pz.messaging.comparator.messages;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@Import(MessagesFacade.class)
@ComponentScan(basePackageClasses = MessagesFacade.class)
@SpringJUnitConfig(initializers = ConfigFileApplicationContextInitializer.class)
class MessagesFacadeTest {

    @Autowired
    private MessagesFacade messagesFacade;

    @Test
    void shouldReturnMessage1Mb() {
        //given

        //when
        String message1Mb = messagesFacade.getMessage1Mb();

        //then
        assertEquals(1000000, message1Mb.getBytes().length);

    }

    @Test
    void shouldReturnMessage10Mb() {
        //given

        //when
        String message10Mb = messagesFacade.getMessage10Mb();

        //then
        assertEquals(10000000, message10Mb.getBytes().length);
    }

    @Test
    void shouldReturnMessage100Mb() {
        //given

        //when
        String message100Mb = messagesFacade.getMessage100Mb();

        //then
        assertEquals(100000000, message100Mb.getBytes().length);
    }

    @Test
    void shouldReturnMessage1Gb() {
        //given

        //when
        String message1Gb = messagesFacade.getMessage1Gb();

        //then
        assertEquals(1000000000, message1Gb.getBytes().length);
    }

    @Test
    void shouldReturnMessage1Kb() {
        //given

        //when
        String message1Kb = messagesFacade.getMessage1Kb();

        //then
        assertEquals(1000, message1Kb.getBytes().length);
    }

    @Test
    void shouldReturnMessage100Kb() {
        //given

        //when
        String message1Kb = messagesFacade.getMessage100Kb();

        //then
        assertEquals(100000, message1Kb.getBytes().length);
    }
}