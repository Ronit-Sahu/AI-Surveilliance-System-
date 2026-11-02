import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 * This class is to demonstrate what javadoc is and how it is used in the java industry
 * This is <i>italic</i> word<p>this is a new paragraph</p>
 * @author Ronit (CodeWithRonit)
 * @version 2.0
 * @since 2005
 * @see <a href="https://docs.oracle.com/en/java/javase/20/docs/api/index.html" target="_blank">Java Docs</a>
 */

// QUESTION 2:-

@SuppressWarnings("ALL")
class MyDeprecate {
    @Deprecated
    public int multiply(int x,int y){
        return x*y;
    }
    @Deprecated
    public void DatePrint(){
        Date D= new Date();
        System.out.println(D.getHours()+":"+D.getMinutes()+":"+D.getSeconds());
    }
}

// Question 2 II part answer - This will deprecate the function or the references which we are using.All calling function will be deprecated.

// QUESTION 3- By adding the @SuppressWarning annotation we can suppress all the warnings

// QUESTION 4:-

interface Instance{
    void methodPrint();
}
public class AdvancedJava2 {
//    QUESTION 1:-
    @SuppressWarnings("All")
/**
 *
 * @param a This is the first Number to add
 * @param b This is the second number to add
 * @throws Exception if a=0
 * @return Sum of the Number as an Integer
 * @deprecated This method is deprecated.Please use the + operator
 */

//  QUESTION 1

//    public int adder(int a, int b) throws Exception {
//        if (a == 0) {
//            throw new Exception();
//        }
//        int c;
//        c = a + b;
//        return c;
//    }
    public static void main(String[] args) throws Exception {

/*
        QUESTION 1:-
        System.out.println("I am Main Method");
        AdvancedJava2 adj = new AdvancedJava2();
        adj.adder(2,3);

        QUESTION 2:-

        MyDeprecate phone=new MyDeprecate();
            @SuppressWarnings("Deprecation")
        int z= phone.multiply(2,9);
        System.out.println("Multiplied Value is="+z);
        phone.DatePrint();

     // QUESTION 2 II part answer - This will deprecate the function or the references which we are using.All calling function will be deprecated.

     // QUESTION 3- By adding the @SuppressWarning annotation we can suppress all the warnings

//      QUESTION 4:-

        Instance ab=()->{
            System.out.println("I am Printing the Method...");
        };
        ab.methodPrint();

//      QUESTION 5:

       int i=17;
       String table="";
       for (int j=0;j<12;j++){
           table += i+"x"+(j+1)+"=" +(i*(j+1));
           table += "\n";
       }
        try {
                 FileWriter fileWriter=new FileWriter("MultiplicationTable.txt");
                 fileWriter.write(table);
                 fileWriter.close();
             } catch (IOException e) {
                 throw new RuntimeException(e);
             }
             */

//        QUESTION 6:-

        int j=2;
        String table1="";
        while(j<=9){
            table1+= "Multiplication Table of: " + j + "\n";
            for (int i=1;i<=12;i++){
                table1 += j+"X"+i+"="+j*i;
                table1 +="\n";
            }
            j++;
            table1 +="\n";
        }
        File myFile = new File("multiplication_table_2to9.txt");
        try {
            FileWriter fw= new FileWriter("multiplication_table_2to9.txt");
            fw.write(table1);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}