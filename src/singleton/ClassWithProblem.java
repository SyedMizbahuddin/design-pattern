package singleton;

public class ClassWithProblem {

	/*
	 * 1. Lazy Initialization
	 * 
	 * 2. If there are multiple threads then it can create multiple instances, when
	 * it is called first time
	 */

	private static ClassWithProblem uniqueInstance;

	private ClassWithProblem() {

	}

	public static ClassWithProblem getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new ClassWithProblem();
		}
		return uniqueInstance;
	}
}
