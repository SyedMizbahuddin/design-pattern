package facade;

public class HomeTheaterFacade {
	Light light;
	Screen screen;
	Projector projector;
	Amplifier amplifier;
	Movie movie;

	public HomeTheaterFacade(Light light, Screen screen, Projector projector, Amplifier amplifier, Movie movie) {
		super();
		this.light = light;
		this.screen = screen;
		this.projector = projector;
		this.amplifier = amplifier;
		this.movie = movie;
	}

	public void playMovie() {
		light.on();
		screen.on();
		projector.on();
		amplifier.on();
		movie.on();
	}

	public void endMovie() {
		light.off();
		screen.off();
		projector.off();
		amplifier.off();
		movie.off();
	}
}
