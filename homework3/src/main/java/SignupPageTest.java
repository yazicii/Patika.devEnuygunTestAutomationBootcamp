public class SignupPageTest extends DriverSetup{

    public SignupPageTest() {
        //DriverSetup sınıfında oluşturulan setDriverSetup methodunu çağırır.
        setDriverSetup();
        signupPage = new SignupPage(driverSetupList);

    }
    //DriverSetup sınıfından "checkOpenWeb2" metodunu çağırır.
    public void checkOpenWebV() {
        checkOpenWebV2();
    }

    public void checkOpenSignup() {
        signupPage.openSignup();
    }
}
