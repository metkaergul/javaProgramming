package week14.task;

public class OS {
    private String OS;

    public OS() {
    }

    public OS(String OS) {
        setOS(OS);
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public String toString() {
        return "OS{" +
                "OS='" + OS + '\'' +
                '}';
    }
}