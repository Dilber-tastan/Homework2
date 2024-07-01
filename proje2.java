package PROJELER;

import java.util.Enumeration;

public class proje2 {
    public static void main(String[] args) {
        int grade = 0;
        if (SumOfNumbersBetweenTwoNumbers(50, 100) == 3825)
            grade += 5;
        if (SumOfEvenNumbersBetweenTwoNumbers(100, 200) == 7650)
            grade += 5;
        if (AvarageOfFiveNumbers(20, 25, 30, 40, 60) == 35.0)
            grade += 5;
        if (MaximumOfThreeNumbers(5, 8, 7) == 8)
            grade += 5;
        if (isPerfect(28))
            grade += 10;
        if (NumberOfUpperCase("Ardahan G�zel bir Sehirdir") == 3)
            grade += 10;
        if (isTriangle(4, 5, 6))
            grade += 10;
        if (ReverseOfString("HELLO").equals("OLLEH"))
            grade += 15;
        if (NumberOfPrimeBetweenTwoNumbers(1, 100) == 25)
            grade += 15;
        if (checkPassword("ABCD1234"))
            grade += 20;

        System.out.print("Bu projeden ald���n not ->" + grade);
    }


    public static int SumOfNumbersBetweenTwoNumbers(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }


        return sum;
    }


    public static int SumOfEvenNumbersBetweenTwoNumbers(int a, int b) {

        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }


        return sum;


    }

    public static double AvarageOfFiveNumbers(int a, int b, int c, int d, int e) {
        double sum= a + b + c + d + e;
        double ort = sum / 5;


        return ort;
    }

    public static int MaximumOfThreeNumbers(int a, int b, int c) {
        int max = c;
        if (a > max) {
            max = a;
        }
        if (b > max) {
            max = b;
        }
        return max;

    }

    public static Boolean isPerfect(int a) {
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }

        }
        return sum == a;

    }


    public static int NumberOfUpperCase(String s) {
        int sayı = 0;


        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                sayı++;
            }
        }

        return sayı;


    }

    public static boolean isTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && a + b+c>a) {
            return true;
        } else {
            return false;
        }
    }

    public static String ReverseOfString(String s) {

        String tersi = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            tersi += s.charAt(i);
        }

        return tersi;


    }

    public static int NumberOfPrimeBetweenTwoNumbers(int a, int b) {
        int  sayı=0;
        for (int number = a; number < b; number++) {
            boolean asalmı = true;
            if (number <= 1) {
                asalmı = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        asalmı = false;
                        break;
                    }
                }
            }
            if (asalmı) {
                sayı++;
            }
        }
        return sayı;

    }

    public static Boolean checkPassword(String s) {
        if (s.length() < 8) {
            return false;
        }

        int sayı = 0;

        for (char i: s.toCharArray()) {
            if (!Character.isLetterOrDigit(i)) {
                return false;
            }
            sayı++;
            if (!Character.isDigit(i)) {

            }
        }

        return sayı >= 2;
    }


}





