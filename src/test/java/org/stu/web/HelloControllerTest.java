package org.stu.web;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

public class HelloControllerTest {
    @Test
    public void testShowHello() {
        HelloController helloController = new HelloController();
        assertEquals("hello", helloController.showHello());
		fail();
    }
}
