package com.demo;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void shouldReturnHelloWorld() {
        Assert.assertEquals(HelloWorld.getMessage(), "Hello World!");
    }
}
