package cn.anygloble.reflect;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
    @Before
    public void init(){
        System.out.println("开始");
    }
    @Test
    public void testAdd(){
        Calculator c = new Calculator();
        int result = c.add(1, 9);
        System.out.println("方法测试");
        Assert.assertEquals(10,result);

    }

    @After
    public void close(){
        System.out.println("结束");
    }
}
