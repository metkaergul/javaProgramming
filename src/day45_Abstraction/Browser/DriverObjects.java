package day45_Abstraction.Browser;

import day36_Inheritance.employeeTask.Driver;

public class DriverObjects {

    public static void main(String[] args) {

        SafariDriver safaridriver=new SafariDriver("safari");
        System.out.println("safaridriver = " + safaridriver);
        safaridriver.close();
        safaridriver.executeScript("this is executing script");
        safaridriver.findElement("tagName");
        safaridriver.get("https://www.Cydeo.com");
        safaridriver.getBrowserName();
        safaridriver.takeScreenShot();



        RemoteWebDriver driver1= new ChromeDriver("chrome");
        driver1.getTitle();
        driver1.close();
        driver1.findElement("cssSelector");
        System.out.println("driver1 = " + driver1);

        RemoteWebDriver driver2= new SafariDriver("safari");
        driver2.findElement("xpath");
        driver2.quit();
        driver2.close();

        RemoteWebDriver driver3= new FirefoxDriver("firefox");
        driver3.close();
        System.out.println("driver3 = " + driver3);
        driver3.getTitle();




    }
}
