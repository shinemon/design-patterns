package com.mailshine.singleton;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void singletonTest(){
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();

        Assert.assertSame(object1, object2);
    }



}
