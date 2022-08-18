import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class XYZ_Bank {
    WebDriver driver ;

    public void setPerp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elad\\OneDrive\\שולחן העבודה\\Chorm Folder\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    public String openSite(String url) {
        this.driver.get(url);
        return this.driver.getCurrentUrl();

    }

    public void login_Customer() throws InterruptedException {
        WebElement customerLog = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(1) > button"));
        customerLog.click();
        Thread.sleep(3000);
        WebElement choseAccount = this.driver.findElement(By.cssSelector("#userSelect"));
        choseAccount.click();
        Thread.sleep(3000);
        WebElement choseUser = this.driver.findElement(By.cssSelector("#userSelect > option:nth-child(3)"));
        choseUser.click();
        Thread.sleep(3000);
        WebElement loginBtn =this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > form > button"));
        loginBtn.click();
        Thread.sleep(3000);

    }

    public void loginCusHermoine() throws InterruptedException {
        WebElement customerLog = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(1) > button"));
        customerLog.click();
        Thread.sleep(3000);
        WebElement choseAccount = this.driver.findElement(By.cssSelector("#userSelect"));
        choseAccount.click();
        Thread.sleep(3000);
        WebElement choseUser = this.driver.findElement(By.cssSelector("#userSelect > option:nth-child(2)"));
        choseUser.click();
        Thread.sleep(3000);
        WebElement loginBtn =this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > form > button"));
        loginBtn.click();
        Thread.sleep(3000);

    }

    public void login_Manger(){
        WebElement bank_MangerBtn = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(3) > button"));
        bank_MangerBtn.click();
    }

    public String add_Customer() throws InterruptedException {
        WebElement addCusBtn = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.center > button:nth-child(1)"));
        addCusBtn.click();
        Thread.sleep(2000);
        WebElement firstNameInput = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > div:nth-child(1) > input"));
        firstNameInput.click();
        firstNameInput.sendKeys("enjcni");
        Thread.sleep(2000);
        WebElement lastNameInput = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > div:nth-child(2) > input"));
        lastNameInput.click();
        lastNameInput.sendKeys("snnjce");
        Thread.sleep(2000);
        WebElement postCodeInput = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > div:nth-child(3) > input"));
        postCodeInput.sendKeys("725486");
        Thread.sleep(2000);
        WebElement submitAddCustomer = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > button"));
        submitAddCustomer.click();
        driver.switchTo().alert().accept();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement customersListBtn = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.center > button:nth-child(3)"));
        customersListBtn.click();
        WebElement newCustmerName = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > table > tbody > tr:nth-child(6) > td:nth-child(1)"));

        return  newCustmerName.getText();
    }

    public String add_Customer_Url() throws InterruptedException {
            WebElement addCusBtn = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.center > button:nth-child(1)"));
            addCusBtn.click();
            Thread.sleep(2000);
            return this.driver.getCurrentUrl();

    }


    public void deleteUser () throws InterruptedException {
        WebElement customersBtn = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.center > button:nth-child(3)"));
        customersBtn.click();
        Thread.sleep(3000);
        WebElement nevileUserDeleteBtn = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > table > tbody > tr:nth-child(5) > td:nth-child(5) > button"));
        nevileUserDeleteBtn.click();
        Thread.sleep(3000);


    }

    public int checkCodeResponse() throws IOException {
        this.driver.getCurrentUrl();
        HttpURLConnection currentURL = (HttpURLConnection) new URL("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/list").openConnection();
        currentURL.setRequestMethod("HEAD");
        currentURL.connect();
        return currentURL.getResponseCode();


    }



    public void deposit200() throws InterruptedException {
        WebElement deposit = this.driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]"));
        deposit.click();
        Thread.sleep(3000);
        WebElement inputToDeposit = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input"));
        inputToDeposit.click();
        inputToDeposit.sendKeys("250");
        Thread.sleep(3000);
        WebElement depositBtn = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > button"));
        depositBtn.click();
        Thread.sleep(3000);
    }

    public void deposit1000() throws InterruptedException {
        WebElement deposit = this.driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]"));
        deposit.click();
        Thread.sleep(3000);
        WebElement inputToDeposit = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input"));
        inputToDeposit.click();
        inputToDeposit.sendKeys("1000");
        Thread.sleep(3000);
        WebElement depositBtn = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > button"));
        depositBtn.click();
        Thread.sleep(3000);
    }

    public void withdrawal250() throws InterruptedException {
        WebElement withdrawalBtn = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(3)"));
        withdrawalBtn.click();
        Thread.sleep(2000);
        WebElement inputToWithdrawal = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input"));
        inputToWithdrawal.click();
        inputToWithdrawal.sendKeys("250");
        Thread.sleep(2000);
        WebElement withBtn = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > button"));
        withBtn.click();
        Thread.sleep(2000);
    }

    public void withdrawal_1500() throws InterruptedException {
        WebElement withdrawalBtn = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(3)"));
        withdrawalBtn.click();
        Thread.sleep(2000);
        WebElement inputToWithdrawal = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input"));
        inputToWithdrawal.click();
        inputToWithdrawal.sendKeys("1500");
        Thread.sleep(2000);
        WebElement withBtn = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > button"));
        withBtn.click();
        Thread.sleep(2000);

    }


    public String balanceChecked (){
        WebElement balanceAccount = this.driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]"));
        balanceAccount.click();
        return balanceAccount.getText();
    }

    public String transaction () throws InterruptedException {
        WebElement transactionBtn = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(1)"));
        transactionBtn.click();
        Thread.sleep(3000);
        WebElement amountTran = this.driver.findElement(By.cssSelector("#anchor0 > td:nth-child(2)"));
        Thread.sleep(3000);
        return amountTran.getText();

    }




    public void closeSite(){
        this.driver.quit();
    }





    }

