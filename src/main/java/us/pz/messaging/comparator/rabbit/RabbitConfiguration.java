package us.pz.messaging.comparator.rabbit;

import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Declarable;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
class RabbitConfiguration {

    static final String topicExchangeName = "topic-exchange";

    static final String topic1kbQueueName = "topic1kbQueueName";
    static final String topic1MbQueueName = "topic1MbQueueName";
    static final String topic10MbQueueName = "topic10MbQueueName";
    static final String topic100MbQueueName = "topic100MbQueueName";
    static final String topic1GbQueueName = "topic1GbQueueName";


    @Bean
    public List<Declarable> topicBindings() {
        Queue topic1kbQueue = new Queue(topic1kbQueueName, true);
        Queue topic1MbQueue = new Queue(topic1MbQueueName, true);
        Queue topic10MbQueue = new Queue(topic10MbQueueName, true);
        Queue topic100MbQueue = new Queue(topic100MbQueueName, true);
        Queue topic1GbQueue = new Queue(topic1GbQueueName, true);


        TopicExchange topicExchange = new TopicExchange(topicExchangeName);

        return Arrays.asList(
                topic1kbQueue,
                topic1MbQueue,
                topic10MbQueue,
                topic100MbQueue,
                topic1GbQueue,
                topicExchange,
                BindingBuilder
                        .bind(topic1kbQueue)
                        .to(topicExchange).with("rabbit.topic.1kb"),
                BindingBuilder
                        .bind(topic1MbQueue)
                        .to(topicExchange).with("rabbit.topic.1Mb"),
                BindingBuilder
                        .bind(topic10MbQueue)
                        .to(topicExchange).with("rabbit.topic.10Mb"),
                BindingBuilder
                        .bind(topic100MbQueue)
                        .to(topicExchange).with("rabbit.topic.100Mb"),
                BindingBuilder
                        .bind(topic1GbQueue)
                        .to(topicExchange).with("rabbit.topic.1Gb"));
    }
}
