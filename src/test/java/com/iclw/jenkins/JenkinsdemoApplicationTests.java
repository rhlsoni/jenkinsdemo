package com.iclw.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsdemoApplicationTests
{
	public static Logger logger = (Logger) LoggerFactory.getLogger(JenkinsdemoApplicationTests.class);
	@Test
	void contextLoads()
	{
		logger.info("Test case Exicuteing....");
		assertEquals(true,true);
	}

}
/*
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/rhlsoni/jenkinsdemo.git
git push -u origin main
 */