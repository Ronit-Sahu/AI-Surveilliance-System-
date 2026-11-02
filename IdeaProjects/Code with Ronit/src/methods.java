import java.util.Scanner;
public class methods {
/*
 Factorial of a number using recursion
    Formula- n*factorial(n-1)
 static int factorial(int n){
     if(n==0)
     {
         return 1;
     }
     else{
         return(n*factorial(n-1));
     }
 }
 public static void main(String[] args) {
     int a=5;
     System.out.println("The value of factorial of n is:"+factorial(a));
 }
 */
    /*
 Printing fibonacci series using recursion
 Formula- fibonacci(g-1) + fibonacci(g-2)
 static int fibonacci(int g) {
    if (g == 0) {
        return g;
    } else if (g == 1) {
         return g;
     } else {
         return fibonacci(g - 1)+ (fibonacci(g - 2));
     }
 }
 public static void main(String[] args) {
     Scanner sa=new Scanner(System.in);
     int num;
     System.out.println("Enter number");
     num=sa.nextInt();
     for(int i=0;i<=num;i++){
         System.out.print(fibonacci(i)+" ");
     }
     System.out.println();
}
 */
    /* Sum of factorial of a number using recursion
 static int fact(int n) {
     if (n == 0) {
         return 1;
     }
     else {
         return (n * fact(n - 1));
     }
 }
 public static void main(String[] args) {
     Scanner in = new Scanner (System.in);
     int a,sum=0;
     System.out.println("Enter the number");
     a = in.nextInt();
     for (int i = 1; i <= a; i++) {
         sum +=  fact(i);
     }
     System.out.print("The sum of the factorial of the number= "+sum);
 }
 */
/*
 Printing Fibonacci series without using recursion:-
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int i, n, a = 0, b = 1, c = 0;
            System.out.println("Enter the number till which the fibonacci series has to be printed");
            n = in.nextInt();
            System.out.print(a + " " + b+" ");
            for (i = 3; i <= n; i++) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
*/
/* PRACTICE SET 7- METHODS
QUESTION NO -1
METHOD NO 1- Java Program to print the multiplication of the number using returnable function-
         static int multiply(int a) {
             if (a == 0) {
                 return 1;
             }
             else {
                 int j=0;
                 if(j<=a)
                 {
                     j++;
                 }
                 return(a*j);
         }
         }
         public static void main(String[] args) {
             Scanner in = new Scanner(System.in);
             int i, n,n1,b=0;
             System.out.println("Enter a number");
             n = in.nextInt();
             System.out.println("Enter a limit upto which the table has to be printed");
             n1=in.nextInt();
             System.out.println("The multiplication table is:");
             for (i = 1; i <= n1; i++) {
                 b= multiply(n)*i;
                 System.out.println(n+ "x" + i + "=" +b +" ");
             }
         }
*/
/*
METHOD 2-Java Program to print the multiplication of the number using non-returnable function-

   static void multiplication(int z){
       for(int i=0;i<=12;i++){
           System.out.format("%d X %d =%d\n",z,i,z*i);
       }
   }
        public static void main(String[] args) {
            multiplication(18);
        }
 */
/*
METHOD 1- Printing pattern using non returnable function-
 QUESTION 2
        static void pattern(int l) {
            for (int i =1; i<=l; i++) {
                for (int j = 0; j <=i-1; j++) {
                    System.out.print('*' + " ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the limit of the pattern");
            int num=sc.nextInt();
            pattern(num);
        }

//Method 2- Printing pattern using returnable function-
 static void patternprinting(int p) {
     if (p > 0) {
         patternprinting(p - 1);
         for (int i = 0; i < p; i++) {
             System.out.print('*'+" ");
         }
         System.out.println();
     }
 }
 public static void main(String[]args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the limit of the pattern");
            int num=sc.nextInt();
            patternprinting(num);
            }
 */
/*
METHOD 1- Question no 3: for printing sum of first n natural numbers using returnable function

        static int sumrec(int n){
          if(n==1){
              return 1;
          }
          else{
              return n+sumrec(n-1);
          }
        }
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter a number");
            int a=in.nextInt();
            System.out.println("The sum of first n natural numbers is="+sumrec(a));
        }
*/
  /*
   METHOD 2- for printing sum of first n natural numbers using non returnable function

        static void sumrect(int s,int n) {
            for (int i = 1; i <= n; i++) {
                s = s + i;
            }
            System.out.println("The sum of first n natural numbers is=" + s);
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number");
            int b = in.nextInt();
            sumrect(0,b);
        }
        */
//        QUESTION NO 4
        /*
        METHOD 1- decrease pattern printing without recursion:
        static void decrease_pattern(int l) {
            for (int i =l; i>=0; i--) {
                for (int j = 0; j <=i-1; j++) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the limit of the pattern");
            int num=sc.nextInt();
            decrease_pattern(num);
        }
        */
        /*
        Method 2-Decrease pattern printing with recursion
        static void dec_patternprint(int p) {
            if (p > 0) {
                for (int i=p; i>=1; i--) {
                    System.out.print('*'+" ");
                }
                System.out.println();
                dec_patternprint(p - 1);
            }
        }
        public static void main(String[]args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the limit of the pattern");
            int num=sc.nextInt();
            dec_patternprint(num);
        }
         */
/*
    QUESTION NO 5
        static int nth_fibonacci(int g) {
            if (g == 0) {
                return g;
            } else if (g == 1) {
                return g;
            } else {
                return nth_fibonacci(g - 1) + (nth_fibonacci(g - 2));
            }
        }
        public static void main(String[] args) {
            Scanner sa = new Scanner(System.in);
            int num;
            System.out.println("Enter number");
            num = sa.nextInt();
            System.out.println("The nth fibonacci term is="+nth_fibonacci(num));
    }
        static void termfibonacci(int h) {
            int a = 0, b = 1,i, c=0;
            for (i = 3; i <= h; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            if(h==1) {
                System.out.println("The "+h+"th term of fibonacci series is= "+a);
            }
            else if (h==2) {
                System.out.println("The "+h+"th term of fibonacci series is= "+b);
            }
           else if (h==i-1) {
                System.out.println("The "+h+"th term of fibonacci series is=" +c);
            }
        }
            public static void main(String[]args){
                Scanner sa = new Scanner(System.in);
                int num;
                System.out.println("Enter number");
                num = sa.nextInt();
                termfibonacci(num);
            }
 */
        /* QUESTION NO 6- METHOD 1 Using returnable function
        static int average(int...a) {
            int result = 0;
            int avg = 0;
            for (int b : a) {
                result += b;
                avg=result/a.length;
            }
            return avg;
        }
        public static void main(String[] args) {
            System.out.println("The average of the set of numbers is= "+average(6,7,8,9,10));
        }
QUESTION NO 6- METHOD 1 Using non-returnable function(void)
        static void average(int...arr) {
            int result = 0;
            int avg = 0;
            for (int b : arr) {
                result += b;
                avg=result/arr.length;
            }
            System.out.println("The average of set of the numbers are= "+avg);
        }
        public static void main(String[] args) {
            average(6,7,8,9,10);
        }
 */
/*
 QUESTION NO 7- METHOD 1: Using returnable function in recursion repeat the number "4"
        static int repeatation(int r) {
            if (r == 4) {
                for (int i = 1; i<=20; i++) {
                    System.out.println(r);
                }
            }
            return r;
        }
        public static void main(String[] args) {
            System.out.println(repeatation(4));
        }
*/
/*    QUESTION NO 7- METHOD 2: Using non-returnable function in recursion repeat the number "4"
        static void Re_repeatation(int r) {
            if (r == 4) {
                for (int i = 1; i<=25; i++) {
                    System.out.println(r);
                }
            }
        }''
    public static void main(String[] args) {
        Re_repeatation(4);
    }
 */

//    QUESTION NO 8- Same logic as above only value changes to "2" in place of "4"
/*    QUESTION NO 9- METHOD 1- Using returnable function in recursion:-
    static float conversion(float c) {
        if (c == 0) {
            return 32.0F;
        } else {
            return (c *((float) 9 /5)+ 32);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float number;
        System.out.println("Enter the temperature");
        number=in.nextFloat();
        System.out.println("The temperature in fahrenheit is= "+conversion(number));
    }
 */
    /*  QUESTION NO 9- METHOD 2- Using non-returnable function in recursion:-
    static void Temperature(float c) {
        if (c ==0)
        {
            System.out.println(32.0+" "+"Fahrenheit ");
        }
        else {
            float f = (c * 9 / 5) + 32 ;
            System.out.println(f+" "+"Fahrenheit");
        }
    }
    public static void main(String[] args) {
        Temperature(0);
    }
     */
/*
QUESTION NO 1O- Repeat "3" using iterative approach:-
  public static void main(String[] args) {
  Scanner in =new Scanner(System.in);
  System.out.println("Enter how much times the number 3 has to be repeated");
   int n=in.nextInt();
    for(int i=1;i<=n;i++){
        System.out.println("3");
    }
}
*/
public static void main(String[] args) {
    System.out.println("Methods chapter ends with full solution of practice sets");
}
}