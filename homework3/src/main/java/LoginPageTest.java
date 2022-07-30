public class LoginPageTest extends DriverSetup {

    public LoginPageTest() {
        //DriverSetup sınıfında oluşturulan "setDriverSetup" metodunu çağırır.
        setDriverSetup();
        loginPage = new LoginPage(driverSetupList);

    }
    //DriverSetup sınıfından "checkOpenWeb2" metodunu çağırır.
    public void checkOpenWebV() {
        checkOpenWebV2();
    }

    public void checkOpenLogin() {
        loginPage.openLoginPage();
    }
}
