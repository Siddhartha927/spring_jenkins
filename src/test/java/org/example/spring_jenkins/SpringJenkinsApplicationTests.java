package org.example.spring_jenkins;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringJenkinsApplicationTests {

    public static Logger logger = org.slf4j.LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
    @Test
    public contextLoads() {
        logger.info("Test case Executing");
        logger.info("Test case Executing 2nd log statement.....");
        logger.info("Test case Executing 3nd log statement.....");
        assertEquals(true, true);
    }

}
