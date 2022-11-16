package kr.kwangan2.test.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class LoggingRunner implements ApplicationRunner {
	
	private Logger logger = LoggerFactory.getLogger(LoggingRunner.class);

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.trace("trace log!!!");
		logger.debug("debug log!!!");
		logger.info("info log!!!");
		logger.warn("warn log!!!");
		logger.error("warn log!!!");
	}

}
