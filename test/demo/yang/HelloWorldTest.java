package demo.yang;

import static org.junit.Assert.*;

public class HelloWorldTest {
    @org.junit.Test
    public void say() throws Exception {
        assertEquals(HelloWorld.say(), "HelloWorld!");
    }

    @org.junit.Test
    public void fail() throws Exception {
        assertTrue(HelloWorld.fail());
    }

}