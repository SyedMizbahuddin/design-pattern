package singleton;

public class ClassSynchronised {

	/*
	 * 1. Lazy Initialization
	 * 
	 * 2. But synchronised everytime we call the getInstance() but actually we need
	 * to syn it only once
	 */

	private static ClassSynchronised uniqueInstance;

	private ClassSynchronised() {

	}

	public static synchronized ClassSynchronised getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new ClassSynchronised();
		}
		return uniqueInstance;
	}
}
