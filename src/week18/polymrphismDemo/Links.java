package week18.polymrphismDemo;

public class Links extends Browser implements WebElement{


    public void getLinkHref(){

        System.out.println("https://www.java.com");
    }



    @Override
    public void click() {
        System.out.println("clicking the link");
    }

    @Override
    public void sendKeys(String input) {
        System.out.println("unsupported action");
    }

    @Override
    public String getText() {

        System.out.println("Getting link text");
        return "oracle java";
    }

    @Override
    public Links locateElement(String locator) {
        return new Links();
    }
}
