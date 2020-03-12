package com.log;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import junit.framework.TestCase;

public class LogTest extends TestCase {

	@Test
	public void test() {
		Logger logger = LoggerFactory.getLogger(this.getClass());
 		logger.error("error");
 		logger.warn("warn");
 		logger.info("info");
 		logger.debug("debug");
 		logger.trace("trace");
	}
}
