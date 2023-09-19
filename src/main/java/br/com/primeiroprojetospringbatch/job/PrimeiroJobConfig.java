package br.com.primeiroprojetospringbatch.job;

import br.com.primeiroprojetospringbatch.step.ImprimeOlaStepConfig;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrimeiroJobConfig {

  private JobBuilder jobBuilder;

    @Bean
    Job imprimeOlaJob(JobRepository jobRepository, Step imprimeOlaStep) {
        return new JobBuilder("imprimeOlaJob", jobRepository)
            .start(imprimeOlaStep)
            .incrementer(new RunIdIncrementer())
            .build();
  }

}
