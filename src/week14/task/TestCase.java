package week14.task;

public class TestCase {
    Browser browser;  // edge, chrome, firefox....
    OS operatingSystem; // MAC, Windows, Linux

    public TestCase() {
    }

    public TestCase(Browser browser, OS operatingSystem) {
        this.browser = browser;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "TestCase{" +
                "browser=" + browser.getBrowserType() +
                ", operatingSystem=" + operatingSystem.getOS() +
                '}';
    }
}