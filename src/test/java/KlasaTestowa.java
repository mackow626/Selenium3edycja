import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KlasaTestowa {

    String imie="Michal";

    @BeforeClass
    public void setUp(){
        imie="Jan";
    }

    @Test
    public void PierwszyTest(){
        System.out.println("To jest moj pierwszy test");
        Assert.assertEquals(1,1);
    }

    @Test
    public void CzyImieToJan(){
        Assert.assertEquals("Michal",imie);
    }

    @AfterMethod
    public void tearDown(){
        Assert.assertEquals(imie, "Jan1");

    }





}
