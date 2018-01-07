/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

    public static void main(String args[]) {

        System.out.println(isEvenlySpaced(4, 6, 3));
    }


    public static boolean isOdd(int a) {
        return a % 2 != 0;

    }

    public static boolean isMultipleOfThree(int a) {
        return a % 3 == 0;

    }

    public static boolean isOddAndIsMultipleOfThree(int a) {
        return a % 2 != 0 && a % 3 == 0;

    }

    public static boolean isOddAndIsMultipleOfThree2(int a) {
        if (a % 3 == 0 && a % 2 != 0) {
            return true;
        }
        return false;


    }

    public static void fizzMultipleOfThree(int a) {

        if (a % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(a);
        }
    }

    public static boolean fromLondon(Person person) {

        return person.getCity().equals("London");

    }

    public static void personNameLength(Person person) {

        if (person.getName().length() > 5) {
            System.out.println(person.getName());
        } else {
            System.out.println("Name is too short");
        }
    }


    //1. Cigar Party

    public static boolean cigarParty(boolean isWeekend, int cigars) {

        if ((cigars >= 40 && cigars <= 60) && !isWeekend) {
            return true;
        } else if (isWeekend && cigars >= 40) {
            return true;
        }
        return false;

    }

    //2. Caught Speeding
    public static int caughtSpeeding(int a, boolean isBirthday) {

        if ((a <= 60 && !isBirthday) || (a <= 65 && isBirthday)) {
            return 0;
        } else if ((a >= 81 && !isBirthday) || (a >= 86 && isBirthday)) {
            return 2;
        }
        return 1;
    }

    //3. Alarm Clock

    public static String alarmClock(int day, boolean onVacation) {

        if ((day == 0 || day == 6) && !onVacation) {
            return "10:00";
        } else if (onVacation && (day == 0 || day == 6)) {
            return "Off";
        } else if (day <= 5 && !onVacation) {
            return "7:00";
        }

        return "Please enter a number between 1 - 6 inclusive";
    }

    //4. Lottery Ticket

    public static int lotteryTicket(int a, int b, int c) {

        if (a == c && b == c) {
            return 20;

        } else if (a != b && a != c && b != c) {
            return 0;
        }
        return 10;
    }

    //5. BlackJack

    public static int blackJack(int a, int b) {

        int aDifference = 21 - a;
        int bDifference = 21 - b;

        if (a > 21 && b > 21) {
            return 0;
        } else if (aDifference < bDifference) {
            return a;
        } else if (bDifference < aDifference) {
            return b;
        }
        return 21;

    }

    //6. Evenly Spaced

    public static boolean isEvenlySpaced(int a, int b, int c) {

        return (a - b == b - c) || (a - c == c - b) || (b - a == a - c);
    }


}
