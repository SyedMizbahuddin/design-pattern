package facade;

public class MainApplication {

	public static void main(String[] args) {

		Light light = new Light();
		Screen screen = new Screen();
		Projector projector = new Projector();
		Amplifier amplifier = new Amplifier();
		Movie movie = new Movie();

		light.on();
		screen.on();
		projector.on();
		amplifier.on();
		movie.on();

		HomeTheaterFacade facade = new HomeTheaterFacade(light, screen, projector, amplifier, movie);

		facade.playMovie();
		facade.endMovie();
	}

}
