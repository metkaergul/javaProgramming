package week18.polymrphismDemo;

public class InputFields extends Browser implements WebElement{
    @Override
    public void click() {
        System.out.println("Clicking the input field");
    }

    @Override
    public void sendKeys(String input) {

    }


    @Override
    public String getText() {
        return null;
    }

    @Override
    public InputFields locateElement(String locator) {
        return new InputFields();
    }
}
