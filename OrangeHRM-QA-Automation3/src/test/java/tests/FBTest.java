package tests;

import org.testng.annotations.Test;
import pages.FBpage;
import utils.TestBase;

public class FBTest extends TestBase {
    @Test(priority = 1)
    public static void testFBPage(){
        FBpage.setFname("Tharani");
        FBpage.setSname("Sripirahas");
        FBpage.setEmail("hsbcja@gmail.com");
    }
}
