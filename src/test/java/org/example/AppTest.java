package org.example;

import static org.junit.Assert.assertTrue;

import com.beust.ah.A;
import org.junit.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */


    @Test
    public void testcase1_login(){

        App a = new App();
        Assert.assertEquals(true,a.login_test("user","user123"));

    }


    @Test
    public void testcase2_login(){
        App a = new App();
        Assert.assertEquals(false,a.login_test("sakshi","sakshi123"));
    }
}
