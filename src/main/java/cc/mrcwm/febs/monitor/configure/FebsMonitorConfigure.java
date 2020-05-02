package cc.mrcwm.febs.monitor.configure;

import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author mrcwm
 */
@Configuration
public class FebsMonitorConfigure {

    @Bean
    public HttpTraceRepository inMemoryHttpTraceRepository(){
        return new InMemoryHttpTraceRepository();
    }
}
