package example.ddd;

import static com.google.common.base.Preconditions.*;

public class AbstractEvent<T> implements Event<T> {

	private static final long serialVersionUID = 1L;

	private T payload;

	public AbstractEvent(T payload) {
		this.payload = checkNotNull(payload);
	}

	@Override
	public T getPayload() {
		return payload;
	}

}
