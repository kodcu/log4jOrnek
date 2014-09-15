package log4jOrnek;

import org.apache.log4j.Logger;

public class Log4jLevelTest {

	private static final Logger logger = Logger.getLogger(Log4jLevelTest.class);

	public static void main(String[] args) {

		logger.fatal("fatal log message");
		logger.error("error log message");
		logger.warn("warn log message");
		logger.info("info log message");
		logger.debug("debug log message");
		logger.trace("trace log message");

	}

}
