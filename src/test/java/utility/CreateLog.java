package utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CreateLog {
	Logger log;
	public Logger createlog() {
		log=LogManager.getLogger(getClass());
		return log;
	}

}
