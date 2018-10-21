package com.example.order.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;


public interface StreamClient {

    String INPUT = "intput";
    String OUTPUT = "output";

    @Input(StreamClient.INPUT)
    SubscribableChannel input();


    @Output(StreamClient.OUTPUT)
    MessageChannel output();
}