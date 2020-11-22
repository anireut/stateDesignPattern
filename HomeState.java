package csce247stateDesignPattern;

/**
 * This is the HomeState Class and it houses functions for the home state
 * 
 * @author aniruthsivakumar
 *
 */
public abstract class HomeState implements State {

	/**
	 * Create the gameConsole
	 */
	private GameConsole gameConsole;

	/**
	 * Function to press the home button
	 * 
	 * @param gameConsole
	 */
	public void pressHomeButton(GameConsole gameConsole) {

		System.out.println("Pressed Home Button.");
		gameConsole.setState(gameConsole.getHomeState());
	}

	/**
	 * Function to press the nintendo button
	 * 
	 * @param gameConsole
	 */
	public void pressNintendoButton(GameConsole gameConsole) {

		System.out.println("Pressed Nintendo Button.");
		gameConsole.setState(gameConsole.getNintendoState());
	}

	/**
	 * Function to press the xbox buttton
	 * 
	 * @param gameConsole
	 */

	public void pressXBoxButton(GameConsole gameConsole) {

		System.out.println("Pressed Xbox Button.");
		gameConsole.setState(gameConsole.getXboxState());
	}

	/**
	 * function to press the game button
	 * 
	 * @param gameConsole
	 */
	public void pressGameButton(GameConsole gameConsole) {

		System.out.println("Pressed Game Button.");
		gameConsole.pressGameButton();
	}
}
