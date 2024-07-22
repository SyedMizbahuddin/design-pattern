package adapter;

public class MainApplication {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		print(duck);

		Turkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		print(turkeyAdapter);

		/*
		 * This is object adapter which uses composition
		 * 
		 * There is other class adapter but for that we require multiple inheritance, in
		 * this case still fly is in both may not work in any multiple inheritance
		 * supporting language
		 */
	}

	public static void print(Duck duck) {
		duck.quack();
		duck.fly();
		System.out.println();
	}
}
