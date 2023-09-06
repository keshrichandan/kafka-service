package com.deliveryBoy.config;

import com.deliveryBoy.constant.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class KafkaConfig {
    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(AppConstant.LOCATION_TOPIC_NAME)
                .build();
    }
}
