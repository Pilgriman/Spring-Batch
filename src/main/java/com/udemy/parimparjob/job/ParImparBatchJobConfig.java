package com.udemy.parimparjob.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ParImparBatchJobConfig {

	private JobBuilder jobBuilder;

	private StepBuilder stepBuilder;

	@Bean
	public Job imprimeParImparJob(JobRepository jobRepository, Step imprimeParImparStep) {
		return new JobBuilder("imprimeOlaJob", jobRepository)
				.start(imprimeParImparStep)
				.incrementer(new RunIdIncrementer())
				.build();
	}


}
