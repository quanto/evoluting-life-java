package main;

public class Event {
	public EventType type;
	public Object value;
	
	public Event(EventType type, Object value) {
		this.type = type;
		this.value = value;
	}
}
