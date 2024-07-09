package singleton;

public class ClassDCL {

	/*
	 * 1. Lazy Initialization
	 * 
	 * 2. But we synchronise only if unique is null
	 * 
	 * 3. Double check Locking
	 * 
	 * 4. Multiple Class Loader
	 */

	private static ClassDCL uniqueInstance;

	private ClassDCL() {

	}

	public static ClassDCL getInstance() {
		if (uniqueInstance == null) {
			synchronized (ClassDCL.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new ClassDCL();
				}
			}

		}
		return uniqueInstance;
	}
}
