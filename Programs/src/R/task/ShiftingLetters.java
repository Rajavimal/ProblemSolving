package R;

public class ShiftingLetters {

    public static void main(String[] arg) {

        String ans = "z";
        int[] arr = {52};

//        System.out.println((char)(ans.charAt(0) + 25));

//        System.out.println((char) 107);
//
//        System.out.println((int) 'f');

        System.out.println(shift(ans, arr));
    }

    public static String shift(String value, int[] arr) {

        String toProcess = value;

        for (int i = 0; i<arr.length; i++) {

            for (int j = 0; j<=i; j++) {

                char ch = toProcess.charAt(j);

                int toConcat = ch + arr[i];

                while (toConcat > 122) {

                    toConcat = 96 + (toConcat - 122);
                }

                toProcess = toProcess.substring(0, j) + (char)toConcat + toProcess.substring(j + 1);
            }
        }

        return toProcess;
    }
}
