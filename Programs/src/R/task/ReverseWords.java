package R.task;

public class ReverseWords {

    public static void main(String[] args) {

        String s = "the sky is blue";

        System.out.println(reverse(s));

    }

    public static String reverse(String s) {

        s = s.trim();

        String[] arr = s.split(" ");

        String ans = "";

        for (int i = arr.length-1; i>=0; i--) {
            if(!arr[i].isEmpty()) {
                ans = ans + arr[i] + " ";
            }
        }

        return ans.trim();

    }
}
