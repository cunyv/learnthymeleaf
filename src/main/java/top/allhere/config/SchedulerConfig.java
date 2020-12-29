package top.allhere.config;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.allhere.job.OutJob01;

@Configuration
public class SchedulerConfig {

    @Bean
    public JobDetail sampleJobDetail(){
        return JobBuilder.newJob(OutJob01.class).withIdentity("sampleJob").usingJobData("name","World").storeDurably().build();
    }

    @Bean
    public Trigger sampleJobTrigger(){
        SimpleScheduleBuilder simpleScheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever();
        return TriggerBuilder.newTrigger().forJob(sampleJobDetail()).withIdentity("sampleTrigger").withSchedule(simpleScheduleBuilder).build();
    }

}
