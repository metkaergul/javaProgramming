package day45_Abstraction.Browser;

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


    }
}
