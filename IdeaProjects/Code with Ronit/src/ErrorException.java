import java.util.Scanner;
class MyCustomException extends Exception{
    public static String attempt() {
        System.out.println("Error");
        return "Max Limit Reached";
    }
}
public class ErrorException {
    public static int Calculate(int a,int b){
        return a * b;
    }
    public static void MaxAttempt() throws MyCustomException{
      throw new MyCustomException();
        }
    public static void main(String[] args) throws MyCustomException {
/*
 PRACTICE SET 14
    QUESTION NO 1:-
    int a=2 --> Syntax Error
    int age =75;
  int AgeOfYearBorn =2000-age; --> Logical Error
    int var1 = 15, int var3 = 0;
    int ans2 = var1 / var3;--> RunTime Error as 15 is getting divided by 0 here
    QUESTION 2:-
    Scanner sc = new Scanner(System.in);
        try {
        System.out.println("Enter Two Numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
            int s = 12,w = 0;
            int d = Compare(u, t);l
            System.out.println(s / w);
            if (d < 0) {
                throw new IllegalArgumentException();
            }
        } catch (ArithmeticException e) {
            System.out.println("Haha");
        } catch (IllegalArgumentException e) {
            System.out.println("Hehe");
        }
    QUESTION 3:-
*/
        int[] marks = new int[3];
        marks[0] = 62;
        marks[1] = 12;
        marks[2] = 21;
        Scanner sc = new Scanner(System.in);
        boolean v= true;
        int i = 0;
        while (i < 5) {
            try {
                System.out.println("Enter the value of index");
                int ind = sc.nextInt();
                System.out.println(marks[ind]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }
        if (i >=5) {
            String abc= MyCustomException.attempt();
            System.out.println(abc);
            ErrorException.MaxAttempt();
            }
    }
}
