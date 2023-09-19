package com.udemy.parimparjob.step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class ParImparBatchStepConfig {
    @Bean
    public Step imprimeParImparStep(JobRepository jobRepository,
                                    PlatformTransactionManager transactionManager,
                                    ItemReader<Integer> itemReader,
                                    ItemProcessor<Integer, String> itemProcessor,
                                    ItemWriter<String> itemWriter) {
        //TODO: Implementar o step baseado em chunk
        return new StepBuilder("imprimeParImparStep", jobRepository)
                .<Integer,String>chunk(1,transactionManager)
                .reader(itemReader)
                .processor(itemProcessor)
                .writer(itemWriter)
                .build();
    }

}
