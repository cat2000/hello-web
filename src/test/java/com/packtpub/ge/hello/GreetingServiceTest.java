package com.packtpub.ge.hello;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by liqingmin on 2017/7/25.
 */
public class GreetingServiceTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void greet_with_single_name_should_be_ok() throws Exception {
        GreetingService service = new GreetingService();
        assertEquals("Hello John",service.greet("John"));
    }

    @Test
    public void greet_with_multi_names_should_be_ok() {
        GreetingService service = new GreetingService();
        assertEquals("Hello John and Joe",service.greet("John and Joe"));
    }


}