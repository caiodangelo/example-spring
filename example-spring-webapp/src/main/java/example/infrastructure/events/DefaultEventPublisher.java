package example.infrastructure.events;

import static com.google.common.collect.Sets.*;

import java.util.Set;

import example.ddd.Event;
import example.ddd.EventPublisher;

public class DefaultEventPublisher implements EventPublisher {

	private Set<EventHandler> eventHandlers = newHashSet();

	public void registerEventHandler(EventHandler handler) {
		eventHandlers.add(handler);
	}

	@Override
	public <T> void publish(Event<T> event) {
		for (EventHandler handler : eventHandlers) {
			if (handler.canHandle(event)) {
				handler.handle(event);
			}
		}
	}

}
