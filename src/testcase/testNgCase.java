package testcase;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import unit.RandomEamilGenerate;

public class testNgCase {
    @Test()
    public void testEmailGenerate(){
        RandomEamilGenerate obj=new RandomEamilGenerate();
        String email = obj.generate();
        Assert.assertNotNull(email);
        Assert.assertEquals(email,"12345@qq.com");
    }
}
