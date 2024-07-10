package singleton.demo;

public class MainApplication {

	public static void main(String[] args) throws InterruptedException {

		VolatileExample example = new VolatileExample();
		example.start();

		// Sleep for 1 second
		Thread.sleep(1);

		example.stopRunning();
	}

}
