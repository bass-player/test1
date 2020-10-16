package com.bassplayer.ai.test;

import com.bassplayer.ai.Playground;
import org.junit.Assert;
import org.junit.Test;

public class PlaygroundTest {

    /**
     *
     */
    @Test
    public void testCount() {
        Playground pg = new Playground();
        String str = "Hello world!";
        Assert.assertEquals(str.length() - 1, pg.count(str));
    }
}
