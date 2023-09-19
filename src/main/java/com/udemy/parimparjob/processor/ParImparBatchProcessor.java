package com.udemy.parimparjob.processor;


import org.springframework.batch.item.function.FunctionItemProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ParImparBatchProcessor {
    @Bean
    public FunctionItemProcessor<Integer,String> parOuImparProcessor(){
        return new FunctionItemProcessor<Integer,String>(item -> item % 2 ==0 ? String.format("Item %s é par",item)
                :String.format("Item %s é ímpar", item));
    }
}
