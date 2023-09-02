package ocp.model;

public class Developer {
    private String language;

    protected Developer() {}

    public void setLanguage(String language) {
        this.language = language;
    }

    public void writeCode() {
        System.out.printf("coding %s code...\n", language);
    }
}
