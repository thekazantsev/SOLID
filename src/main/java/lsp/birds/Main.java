package lsp.birds;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void letBirdsFly(List<Bird> birds) {
        for(Bird bird: birds) {
            if(!(bird instanceof Penguin)) { // bad practice of solving "penguin" problem; better to extract flying birds fo different class
                bird.fly();
            }
        }
    }
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<Bird>();
        birds.add(new Bird());
        birds.add(new Swan());
        birds.add(new Penguin()); // !
        letBirdsFly(birds);
    }
}