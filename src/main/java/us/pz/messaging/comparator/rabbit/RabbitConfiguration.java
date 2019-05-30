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
    static final String TOPIC_100_KB_QUEUE_NAME = "topic100kbQueueName";
    static final String TOPIC_1_MB_QUEUE_NAME = "topic1MbQueueName";
    static final String TOPIC_10_MB_QUEUE_NAME = "topic10MbQueueName";
    static final String TOPIC_100_MB_QUEUE_NAME = "topic100MbQueueName";
    static final String TOPIC_1_GB_QUEUE_NAME = "topic1GbQueueName";
    static final String TOPIC_GROWING_QUEUE_NAME = "topicGrowingQueueName";
    static final String ROUTING_KEY_1_KB = "rabbit.topic.1kb";
    static final String ROUTING_KEY_100_KB = "rabbit.topic.100kb";
    static final String ROUTING_KEY_1_MB = "rabbit.topic.1Mb";
    static final String ROUTING_KEY_10_MB = "rabbit.topic.10Mb";
    static final String ROUTING_KEY_100_MB = "rabbit.topic.100Mb";
    static final String ROUTING_KEY_1_GB = "rabbit.topic.1Gb";
    static final String ROUTING_KEY_GROWING = "rabbit.topic.growing";


    @Bean
    public List<Declarable> topicBindings() {
        Queue topic1kbQueue = new Queue(TOPIC_1_KB_QUEUE_NAME, true);
        Queue topic100kbQueue = new Queue(TOPIC_100_KB_QUEUE_NAME, true);
        Queue topic1MbQueue = new Queue(TOPIC_1_MB_QUEUE_NAME, true);
        Queue topic10MbQueue = new Queue(TOPIC_10_MB_QUEUE_NAME, true);
        Queue topic100MbQueue = new Queue(TOPIC_100_MB_QUEUE_NAME, true);
        Queue topic1GbQueue = new Queue(TOPIC_1_GB_QUEUE_NAME, true);
        Queue topicGrowingQueue = new Queue(TOPIC_GROWING_QUEUE_NAME, true);


        TopicExchange topicExchange = new TopicExchange(TOPIC_EXCHANGE_NAME);

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
                        .to(topicExchange).with(ROUTING_KEY_1_KB),
                BindingBuilder
                        .bind(topic1kbQueue)
                        .to(topicExchange).with(ROUTING_KEY_100_KB),
                BindingBuilder
                        .bind(topic1MbQueue)
                        .to(topicExchange).with(ROUTING_KEY_1_MB),
                BindingBuilder
                        .bind(topic10MbQueue)
                        .to(topicExchange).with(ROUTING_KEY_10_MB),
                BindingBuilder
                        .bind(topic100MbQueue)
                        .to(topicExchange).with(ROUTING_KEY_100_MB),
                BindingBuilder
                        .bind(topic1GbQueue)
                        .to(topicExchange).with(ROUTING_KEY_1_GB),
                BindingBuilder
                        .bind(topicGrowingQueue)
                        .to(topicExchange).with(ROUTING_KEY_GROWING));
    }
}
