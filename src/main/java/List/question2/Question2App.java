package List.question2;

import java.util.ArrayList;
import java.util.List;

public class Question2App {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");

        for (String stringElements : colors) {
            System.out.println(stringElements);
        }

    }
}
