import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchTest extends BaseTest{
    @Test
    public void test01() {

        driver.get("https://demoqa.com/");                                                 //demoqa.com sitesinin ana sayfasınır açar.
        driver.findElement(By.xpath("//div[1][@class='card mt-4 top-card']")).click();     //Elementler butonuna tıklar.
        driver.findElement(By.xpath("//*[text()='Web Tables']")).click();                  //Web tables butonuna tıklar.
        String expectedUrl = "https://demoqa.com/webtables";                               //Girilmesi beklenen website adresi
        String actualUrl = driver.getCurrentUrl();                                         //Girmiş olduğumuz wepsite
        Assert.assertEquals(expectedUrl, actualUrl);                                       //Beklenen websiteye girip girmediğini döner.

        WebElement searchBox = driver.findElement(By.id("searchBox"));                     //search butonunun lacater'ı
        searchBox.click();                                                                 //search butonuna tıklar
        Assert.assertTrue(searchBox.isDisplayed());                                        //Assert isDisplayed() search butonunun görünür olup olmadığını döner
        searchBox.sendKeys("Cierra");                                           //search butonun da cier kelimesini yazar ve arar.
        WebElement searchedWord = driver.findElement(By.className("rt-tbody"));            //aranan kelime için gelecek sonuçların bulunacağı bölümün locater'ı
        Assert.assertTrue(searchedWord.isDisplayed());                                     //aranan kelime ile bulunan kelimenin içerisinde göründüğünü test eder.

    }
}
