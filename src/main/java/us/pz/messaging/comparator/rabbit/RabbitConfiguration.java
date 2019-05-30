package us.pz.messaging.comparator.rabbit;

import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Declarable;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@EnableConfigurationProperties(ExchangeProperties.class)
class RabbitConfiguration {

    @Bean
    public List<Declarable> topicBindings(ExchangeProperties exchangeProperties) {
        Queue topic1kbQueue = new Queue(exchangeProperties.getQueue1kb(), true);
        Queue topic100kbQueue = new Queue(exchangeProperties.getQueue100kb(), true);
        Queue topic1MbQueue = new Queue(exchangeProperties.getQueue1mb(), true);
        Queue topic10MbQueue = new Queue(exchangeProperties.getQueue10mb(), true);
        Queue topic100MbQueue = new Queue(exchangeProperties.getQueue100mb(), true);
        Queue topic1GbQueue = new Queue(exchangeProperties.getQueue1gb(), true);
        Queue topicGrowingQueue = new Queue(exchangeProperties.getQueueGrowing(), true);


        TopicExchange topicExchange = new TopicExchange(exchangeProperties.getName());

        return Arrays.asList(
                topic1kbQueue,
                topic100kbQueue,
                topic1MbQueue,
                topic10MbQueue,
                topic100MbQueue,
                topic1GbQueue,
                topicGrowingQueue,
                topicExchange,
                BindingBuilder
                        .bind(topic1kbQueue)
                        .to(topicExchange).with(exchangeProperties.getRouting1kb()),
                BindingBuilder
                        .bind(topic1kbQueue)
                        .to(topicExchange).with(exchangeProperties.getRouting100kb()),
                BindingBuilder
                        .bind(topic1MbQueue)
                        .to(topicExchange).with(exchangeProperties.getRouting1mb()),
                BindingBuilder
                        .bind(topic10MbQueue)
                        .to(topicExchange).with(exchangeProperties.getRouting10mb()),
                BindingBuilder
                        .bind(topic100MbQueue)
                        .to(topicExchange).with(exchangeProperties.getRouting100mb()),
                BindingBuilder
                        .bind(topic1GbQueue)
                        .to(topicExchange).with(exchangeProperties.getRouting1gb()),
                BindingBuilder
                        .bind(topicGrowingQueue)
                        .to(topicExchange).with(exchangeProperties.getRoutingGrowing()));
    }
}
