package R.self;

import java.util.HashMap;
import java.util.Map;

public class CountCharacter {

    public static void main(String[] args) {

        String name = "Raja Vimal";
        count(name);
    }

    public static void count(String name) {

        String toCheck = "";

        for(int i = 0; i<name.length(); i++) {

            char ch = name.charAt(i);

            if(toCheck.indexOf(ch) == -1) {
                toCheck = toCheck + ch;
            }
            else {
                continue;
            }

            if(ch == ' ') {

                continue;
            }

            int count = 0;

            for (int j = 0; j<name.length(); j++) {

                if(name.charAt(j) == ch) {

                    count++;
                }
            }

            System.out.println(name.charAt(i) + "->" + count );

        }
    }
}
