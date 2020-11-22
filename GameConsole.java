package csce247stateDesignPattern;

/**
 * This is the Game Console class
 * 
 * @author aniruthsivakumar
 *
 */

public class GameConsole {

	private State HomeState;
	private State NintendoState;
	private State XboxState;

	private State state;

	/**
	 * Constructor for the console
	 */
	public GameConsole() {
		getHomeState();
		getNintendoState();
		getXboxState();
	}

	/**
	 * The pressHomebutton function
	 */
	public void pressHomeButton() {
		state.pressHomeButton();
	}

	/**
	 * The pressNintendobutton function
	 */
	public void pressNintendoButton() {
		state.pressNintendoButton();
	}
	/**
	 * The pressXboxbutton function
	 */
	public void pressXboxButton() {
		state.pressXBoxButton();
	}
	/**
	 * The pressGamebutton function
	 */
	public void pressGameButton() {
		state.pressGameButton();
	}
	/**
	 * The setter for the state
	 */
	public void setState(State state) {
		this.state = state;
	}
	
	/**
	 * The getter for the home state
	 */

	public State getHomeState() {
		return HomeState;
	}
	/**
	 * The getter for the Nintendo state
	 */

	public State getNintendoState() {
		return NintendoState;
	}

	/**
	 * The getter for the xbox state
	 */

	public State getXboxState() {
		return XboxState;
	}

}
