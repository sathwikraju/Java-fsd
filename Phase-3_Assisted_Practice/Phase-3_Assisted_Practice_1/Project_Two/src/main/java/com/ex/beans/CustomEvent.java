package com.ex.beans;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {
	
	private static final long serialVersionUID = 1L;
	public CustomEvent(Object source) {
		super(source);
	}
	
	@Override
	public String toString() {
		return "This is a custom event";
	}
}
