package demo.yang;

import static org.junit.Assert.*;

public class HelloWorldTest {
    @org.junit.Test
    public void say() throws Exception {
        assertEquals(HelloWorld.say(), "Hello World!");
    }

    @org.junit.Test
    public void fail() throws Exception {
        assertFalse(HelloWorld.fail(1));
    }

    @org.junit.Test
    public void success() throws Exception {
        assertTrue(true);
    }

}