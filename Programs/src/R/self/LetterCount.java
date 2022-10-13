package S;

import java.util.HashMap;

public class LetterCount {

    public static void main(String[] args) {

        String name = "aaaaaaaaaaabbcccd";

//        count(name);
        letterCount(name);

    }

    public static void count(String name) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i<name.length(); i++) {

            if(map.containsKey(name.charAt(i))) {
                int count = map.get(name.charAt(i));
                count = count + 1;
                map.put(name.charAt(i), count);

            }
            else {
                map.put(name.charAt(i), 1);
            }
        }

        String uniqueKey = getUnique(name);

        for (int i = 0; i<uniqueKey.length(); i++) {

            System.out.print(uniqueKey.charAt(i) + "" + map.get(uniqueKey.charAt(i)));
        }

    }

    public static String getUnique(String name) {

        String ans = "";

        for (int i = 0; i<name.length(); i++) {

            if(ans.indexOf(name.charAt(i)) == -1) {

                ans = ans + name.charAt(i);
            }
        }

        return ans;
    }


    // Without Hashmap

    public static void letterCount(String name) {

        String toCheck = "";
        int count = 0;

        for (int i = 0; i<name.length(); i++) {

            char ch = name.charAt(i);

            if(toCheck.indexOf(ch) == -1) {

                if(i!=0) {

                    System.out.print(name.charAt(i-1) + "" + count);
                }

                toCheck = toCheck + ch;
                count = 1;
            }
            else {
                count++;
            }
        }

        System.out.print(name.charAt(name.length() - 1) + "" + count);
    }
}
