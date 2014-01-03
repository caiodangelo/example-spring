package example.infrastructure.events;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.google.common.eventbus.EventBus;

@Configuration
@ComponentScan
public class EventsConfig {

	@Bean
	public EventBus eventBus() {
		return new EventBus();
	}
	
}
