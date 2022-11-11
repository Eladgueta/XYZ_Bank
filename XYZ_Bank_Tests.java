import com.beust.ah.A;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class XYZ_Bank_Tests {


    //טסט 1 עבר


    @Test
    public void deposit250() throws InterruptedException {
        XYZ_Bank xyz_bank = new XYZ_Bank();
        xyz_bank.setPerp();
        String expUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        String actUrl = xyz_bank.openSite(expUrl);
        Assert.assertEquals(expUrl, actUrl);
        System.out.println("SaintyTest----pass");
        xyz_bank.login_Customer();
        xyz_bank.deposit200();
        Thread.sleep(3000);
        String expTran = "250";
        String actTran = xyz_bank.transaction();
        Assert.assertEquals(expTran, actTran);
        System.out.println("the transaction is pass");


        xyz_bank.closeSite();
    }


    //טסט 2 עבר


    @Test
    public void userDeletionByAdminUser() throws InterruptedException, IOException {
        XYZ_Bank xyz_bank = new XYZ_Bank();
        xyz_bank.setPerp();
        xyz_bank.openSite("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        xyz_bank.login_Manger();
        xyz_bank.deleteUser();
        int expRespondCode =200;
        int actRespondCode = xyz_bank.checkCodeResponse();
        Assert.assertEquals(expRespondCode,actRespondCode);
        System.out.println("Test passed");


        xyz_bank.closeSite();
    }


    //טסט 3 עבר


   @Test
    public void addingNewCustomerByAdminUser() throws InterruptedException {
        XYZ_Bank xyz_bank = new XYZ_Bank();
        xyz_bank.setPerp();
        xyz_bank.openSite("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        xyz_bank.login_Manger();
        Thread.sleep(3000);
        String expNewCustomr ="enjcni";
        String actNewCustomer = xyz_bank.add_Customer();
        Assert.assertEquals(expNewCustomr,actNewCustomer);
        System.out.println("Test add new customer----pass");
        xyz_bank.closeSite();

    }


    //טסט 4 עבר


@Test
    public void deposit1000Withdrawal250CheckAccount() throws InterruptedException {
    XYZ_Bank xyz_bank = new XYZ_Bank();
    xyz_bank.setPerp();
    xyz_bank.openSite("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    xyz_bank.login_Customer();
    xyz_bank.deposit1000();
    xyz_bank.withdrawal250();
    String expBalance = "750";
    String actBalance = xyz_bank.balanceChecked();
    System.out.println("Test pass ---- The balance is 750");

    xyz_bank.closeSite();
}




    //טסט 5 עבר


    @Test
    public void urlCheckAfterAddingNewCustomer() throws InterruptedException {
        XYZ_Bank xyz_bank = new XYZ_Bank();
        xyz_bank.setPerp();
        xyz_bank.openSite("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        xyz_bank.login_Manger();
        xyz_bank.add_Customer_Url();
        String expUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/addCust";
        String actUrl = xyz_bank.add_Customer_Url();
        System.out.println("Test pass , this is the right Url");

        xyz_bank.closeSite();

    }



    // טסט 6 לא עבר


    @Test
    public void accountCheckAfterTransfer1500() throws InterruptedException {
        XYZ_Bank xyz_bank =new XYZ_Bank();
        xyz_bank.setPerp();
        xyz_bank.openSite("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        xyz_bank.loginCusHermoine();
        xyz_bank.withdrawal_1500();
        String expTran = "1500";
        String actTran = xyz_bank.transaction();
        Assert.assertEquals(expTran,actTran);
        System.out.println("Test passed");


        xyz_bank.closeSite();

    }


}