package ocp;

import ocp.model.Developer;
import ocp.model.JSDeveloper;
import ocp.model.JavaDeveloper;

import java.util.List;

public class CodingApp {
    public static void main(String[] args) {
        Developer javaDeveloper = new JavaDeveloper();
        Developer jsDeveloper = new JSDeveloper();

        List<Developer> developers = List.of(javaDeveloper, jsDeveloper);

        developers.forEach(Developer::writeCode);
    }
}
