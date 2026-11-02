import java.io.*;
import java.util.Scanner;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
@SuppressWarnings("All")
/*
// QUESTION 6:


class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
/*
    public static String findDay(int month, int day, int year) {
        Calendar cal = new GregorianCalendar(year, month-1 , day);
        DateFormat df = new SimpleDateFormat("EEEE");
        return df.format(cal.getTime()).toUpperCase();
    }
}

 */


// QUESTION 8 ANSWER

interface PerformOperation {
    boolean check(int a);
}
class MyMethods{
    PerformOperation isOdd()
    {
        PerformOperation po = (int a)-> a % 2 != 0;
        return po;
    }
    PerformOperation isPrime()
    {
        PerformOperation po = (int a)->
        {
            if(a == 1) {
                return true;
            } else
            {
                for (int i =  2; i < Math.sqrt(a); i++)
                    if(a%i == 0) return false;
                return true;
            }
        };
        return po;
    }
    PerformOperation isPalindrome()
    {
        ArrayList<Integer> aa = new ArrayList<>();
        PerformOperation po = (int a)->
        {
            String str = Integer.toString(a);
            String reverse = "";
            for(int i = str.length()-1; i >= 0; i--)
            {
                reverse = reverse + str.charAt(i);
            }
            if(reverse.equals(str)) return true;
            return false;
        };
        return po;
    }
}
public class Strings {
//    QUESTION 5 PART:

    static int B, H;
    static boolean flag = true;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
//        System.out.println("enter a number");
//        int i = scan.nextInt();
//        System.out.println("Enter a decimal number");
//        double d= scan.nextDouble();
// String str = scan.nextLine(); --> Computer will skip this line because:-
// To take input of an integer we use nextInt() function, that does not read the new line character of your input.
//So, when we command nextLine() it will take it as new line and give you as a new line. That’s why the nextLine() command after the nextInt() command gets skipped.
//        String s=scan.nextLine();;
//        System.out.println("String: " +s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);

//        QUESTION 2-
       /*
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int value=a;
            for(int j=0;j<n;j++){
                value+=(int)(Math.pow(2,j)*b);
                System.out.print(value+" ");
            }
            System.out.println();
        }

        */


//      QUESTION 3-


/*
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                if (x > Long.MAX_VALUE || x < Long.MIN_VALUE) {
                    System.out.println(x + " can't be fitted anywhere.");
                } else {
                    System.out.println(x + " can be fitted in:");
                    if (x >= -128 && x <= 127) System.out.println("* byte");
                }
                if (x >= -32768 && x <= 32767) {
                    System.out.println("* short");
                }
                if (x >= -2147483648 && x <= 2147483647) {
                    System.out.println("* int");
                }
                if (x >= Long.MIN_VALUE && (x <= Long.MAX_VALUE)) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
 */


// QUESTION 4

/*
        int i=1;
        while (in.hasNext()) {
            String s=in.nextLine();
            System.out.println(i +" "+ s);
            i++;
        }

 */

//      QUESTION 5:

        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

//            QUESTION 6:

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

//        Question 7:

//        Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
//        scanner.close();
//        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
//        String us = n.format(payment);
//        NumberFormat n1 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
//        String india = n1.format(payment);
//        NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
//        String china = n2.format(payment);
//        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
//        String france = n3.format(payment);
//        System.out.println("US: " + us);
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);

//        QUESTION 8 ANSWER
//        MyMethods ob = new MyMethods();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int T = Integer.parseInt(br.readLine());
//        PerformOperation op;
//        boolean ret = false;
//        String ans = null;
//        while (T--> 0) {
//            String s = br.readLine().trim();
//            StringTokenizer st = new StringTokenizer(s);
//            int ch = Integer.parseInt(st.nextToken());
//            int num = Integer.parseInt(st.nextToken());
//            if (ch == 1) {
//                op = MyMethods.isOdd();
//                ret = MyMethods.checker(op, num);
//                ans = (ret) ? "ODD" : "EVEN";
//            } else if (ch == 2) {
//                op = MyMethods.isPrime();
//                ret = MyMethods.checker(op, num);
//                ans = (ret) ? "PRIME" : "COMPOSITE";
//            } else if (ch == 3) {
//                op = MyMethods.isPalindrome();
//                ret = MyMethods.checker(op, num);
//                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
//            }
//            System.out.println(ans);
//        }
//    }
//}
//
