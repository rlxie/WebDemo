import com.tw.webdemo.Demo;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Created by rlxie on 8/5/16.
 */
public class DemoTest {

    private Demo demo;

    @Before
    public void setUp(){
        demo = new Demo();
    }

    @Test
    @Category(com.tw.webdemo.Demo.class)
    public void TestSayHi(){
        Assert.assertEquals("Hi,ray", demo.sayHi("ray"));
    }
}
