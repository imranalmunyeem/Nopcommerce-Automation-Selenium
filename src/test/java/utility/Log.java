package utility;

import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import com.nopcommerce.frontend.ContactUs;
import com.nopcommerce.frontend.DriverSetup;

public class Log extends DriverSetup{
	private static Logger logger = (Logger) LogManager.getLogger(Log.class);
	private static Logger logger1 = (Logger) LogManager.getLogger(ContactUs.class);
	
	public void logFile() {
		logger.info("Successful");
    	logger1.info("Successful");
    }
}
