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

    static final String TOPIC_EXCHANGE_NAME = "topic-exchange";

    static final String TOPIC_1_KB_QUEUE_NAME = "topic1kbQueueName";
    static final String TOPIC_1_MB_QUEUE_NAME = "topic1MbQueueName";
    static final String TOPIC_10_MB_QUEUE_NAME = "topic10MbQueueName";
    static final String TOPIC_100_MB_QUEUE_NAME = "topic100MbQueueName";
    static final String TOPIC_1_GB_QUEUE_NAME = "topic1GbQueueName";


    @Bean
    public List<Declarable> topicBindings() {
        Queue topic1kbQueue = new Queue(TOPIC_1_KB_QUEUE_NAME, true);
        Queue topic1MbQueue = new Queue(TOPIC_1_MB_QUEUE_NAME, true);
        Queue topic10MbQueue = new Queue(TOPIC_10_MB_QUEUE_NAME, true);
        Queue topic100MbQueue = new Queue(TOPIC_100_MB_QUEUE_NAME, true);
        Queue topic1GbQueue = new Queue(TOPIC_1_GB_QUEUE_NAME, true);


        TopicExchange topicExchange = new TopicExchange(TOPIC_EXCHANGE_NAME);

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
