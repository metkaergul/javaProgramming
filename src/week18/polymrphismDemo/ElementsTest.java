package week18.polymrphismDemo;

public class ElementsTest {

    public static void main(String[] args) {

        Links links = new Links();

        links.click();
        System.out.println(links.getText());
        links.sendKeys("EU9");
        links.getLinkHref();

        WebElementUtilities.clickElement(links); // Clicking the Link

        InputFields inputFieldOne = new InputFields();
        WebElementUtilities.clickElement(inputFieldOne); // Clicking the input field


        WebElement linksPoly = new Links();

        //  In order to reach a method which is NOT in the object reference type class/interface, you have to CAST your reference to child class type
        ((Links)linksPoly).getLinkHref();





    }

}
