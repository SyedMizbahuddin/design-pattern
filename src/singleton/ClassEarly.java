package singleton;

public class ClassEarly {

	/*
	 * 1. Early Initialization
	 * 
	 * 2. Will be created even if not required
	 */

	private static ClassEarly uniqueInstance = new ClassEarly();

	private ClassEarly() {

	}

	public static ClassEarly getInstance() {

		return uniqueInstance;
	}
}
