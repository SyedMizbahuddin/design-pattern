package singleton;

public class MainApplication {

	public static void main(String[] args) {

		ClassWithProblem cwp1 = ClassWithProblem.getInstance();
		ClassWithProblem cwp2 = ClassWithProblem.getInstance();

		System.out.println(cwp1 == cwp2);

		ClassEarly ce1 = ClassEarly.getInstance();
		ClassEarly ce2 = ClassEarly.getInstance();

		System.out.println(ce1 == ce2);

		ClassSynchronised cs1 = ClassSynchronised.getInstance();
		ClassSynchronised cs2 = ClassSynchronised.getInstance();

		System.out.println(cs1 == cs2);

		ClassDCL cd1 = ClassDCL.getInstance();
		ClassDCL cd2 = ClassDCL.getInstance();

		System.out.println(cd1 == cd2);

		ClassEnum cm1 = ClassEnum.getInstance();
		ClassEnum cm2 = ClassEnum.getInstance();

		System.out.println(cm1 == cm2);
	}

}
