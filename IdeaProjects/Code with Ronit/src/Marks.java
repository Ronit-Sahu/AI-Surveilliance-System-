import java.util.*;
public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e;
        System.out.println("enter marks in five subject out of 100");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        int sum= a+b+c+d+e;
        float p= sum/5;
        System.out.println("Grand total= " +sum);
        System.out.println("Percentage obtained in CBSE board exam= "+p+"%");
    }
}
