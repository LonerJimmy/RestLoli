package io.loli.restloli.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest extends JerseyBaseTest {
    @Test
    public void testHello(){
        this.connect("/hello");
        assertEquals("hello",output);
    }
}
