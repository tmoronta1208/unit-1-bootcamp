import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

    public static void main(String args[]) {
        prettyInteger(10);
    }


    public static int calculateSquare(int a) {

        return a * a;
    }


    public static double calculateSquareRoot(double b) {


        return Math.sqrt(b);
    }

    public static String toLowerCase(String c) {

        return c.toLowerCase();
    }

    public static boolean isMultiple(int a, int b) {

        return b % a == 0;
    }

    public static void prettyInteger(int a) {

        String star = "*";
        int b = a * 2;
        List<String> starArray = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            starArray.add(star);

            if (starArray.size() == a) {
                starArray.add(a,a+"");
            }
        }
        System.out.println(starArray);
    }
}
