package io.streamly.logstash;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logstash {
	private static Logstash instance;
	static Logger logger = LoggerFactory.getLogger(Logstash.class);

	public static Logstash start(String[] args) {
		if (instance == null) {
			instance = new Logstash(args);
		}
		return instance;
	}

	private Logstash(String[] args) {

	}

	public void addToQueue(String log) {
		logger.info("Data added to logstash queue :{}", log);
	}
}
