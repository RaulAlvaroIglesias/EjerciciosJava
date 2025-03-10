package gestionEmpleadosSQL;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerUtil {
	private static final Logger logger = Logger.getLogger(LoggerUtil.class.getName());
	
	public static void logInfo(String message) {
		logger.log(Level.INFO, message);	
	}

	public static void logError(String message, Throwable e) {
		logger.log(Level.SEVERE, message, e);
	}
	
	

}
