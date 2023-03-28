import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestRunner extends Setup {
    @Test(priority = 1,description = "Sum between 2 Number")
    public void doSum() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        String sum= calcScreen.doSum();
        Assert.assertEquals(sum, "14");
        calcScreen.btnClear.click();
    }
    @Test(priority = 2, description = "Sub between 2 Number")
    public void doSub() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        String sub= calcScreen.doSub();
        Assert.assertEquals(sub, "5");
    }
    @Test(priority = 3,description = "Multiply the result of sum and subtraction")
    public void doMul() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        String mul=calcScreen.doMul();
        Assert.assertEquals(mul,"70");
    }
    @Test(priority = 4,description = "Divide the result of multiplication with 10")
    public void doDiv() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        String div=calcScreen.doDiv();
        Assert.assertEquals(div,"7");
    }
    @Test(priority = 5,description = "Calculate the Series equation")
    public void doSeries() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        String div=calcScreen.doSeries();
        Assert.assertEquals(div,"260");
    }
   // @AfterMethod
    public void clearScreen(){
        CalcScreen calcScreen=new CalcScreen(driver);
        calcScreen.btnClear.click();
    }
}
