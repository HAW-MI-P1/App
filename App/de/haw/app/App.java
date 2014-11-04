/**
 * 
 */
package de.haw.app;

import java.util.logging.Level;

/**
 * @author Fenja
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ILogger logger = new Logger(Level.ALL);
		logger.Log(Level.INFO, "App", "First Post!");
		
		/*
		 * Here should be the initialization of the other components.
		 * 
		 * Like this:
		 * 
		 * FacebookWrapper wrapper = new FacebookWrapper(logger);
		 * DBController dbcontrol = new DBController(logger);
		 * Parser parser = new Parser(logger);
		 * 
		 * Controller control = new Controller(logger, wrapper, dbcontrol, parser);
		 * 
		 * GUI gui = new GUI(logger, control); 
		 * 
		 * gui.run();
		 * 
		 */

	}

}
