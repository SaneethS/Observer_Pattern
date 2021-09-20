package com.observerpattern;

public interface Observer<T> {
	public void onUpdate(T data);
}
