package com.udemy.parimparjob.reader;


import org.springframework.batch.item.support.IteratorItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class ParImparBatchReader {
    @Bean
    public IteratorItemReader<Integer> contaAteDezReader(){
        List<Integer> numerosDeUmAteDez = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        return new IteratorItemReader<Integer>(numerosDeUmAteDez.iterator());

    }
}
