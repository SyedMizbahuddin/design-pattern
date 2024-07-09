package singleton;

public enum ClassEnum {
	UNIQUE_INSTANCE;

	/*
	 * 1. JVM takes care of creating a single instance
	 * 
	 * 2. Class loader, multi threading,
	 */

	public static ClassEnum getInstance() {
		return UNIQUE_INSTANCE;
	}

	public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
}
