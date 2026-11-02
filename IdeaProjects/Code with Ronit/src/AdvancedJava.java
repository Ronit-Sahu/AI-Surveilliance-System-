import java.util.*;
//import java.time.LocalDate;
import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
public class AdvancedJava {
    public static void main(String[] args) {
/*
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();
        l2.add(4);
        l2.add(14);
        l2.add(24);
        l2.add(34);
        l2.add(44);
        l2.clear();
        l1.add(3);
        l1.add(13);
        l1.add(23);
        l1.add(33);
        l1.add(43);
        l1.add(33);
        l1.addAll(l2);
      System.out.println(l1.indexOf(33));
      System.out.println(l1.lastIndexOf(33));
        System.out.println(l2.contains(54));
        System.out.println(l1.contains(33));
        System.out.println(l1.remove(5));
        System.out.println(l2.remove(0));
*/
/*
        l2.set(0,26);
        System.out.println(l1.subList(2,4));
        for (Integer integer : l1) {
            System.out.print(integer);
            System.out.print(",");
        }
        System.out.println();
        for (Integer integer : l2) {
            System.out.print(integer);
            System.out.print(",");
        }
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer>l2=new LinkedList<>();
        l2.add(34);
        l2.add(44);
//        l2.clear();
        l1.add(3);
        l1.add(13);
        l1.add(23);
        l1.add(33);
        l1.add(43);
        l1.add(33);
        l2.addFirst(26);
        l1.addLast(21);
//        l1.addAll(l2);
//      System.out.println(l1.indexOf(33));
//      System.out.println(l1.lastIndexOf(33));
//        System.out.println(l2.contains(54));
//        System.out.println(l1.contains(33));
//        System.out.println(l1.remove(5));
//        System.out.println(l2.remove(0));
//        l2.set(0,26);
//        System.out.println(l1.subList(2,4));
//        System.out.println(l1.getLast());
//        System.out.println(l2.getFirst());
//        System.out.println(l1.peekFirst());
//        System.out.println(l1.pollFirst());
//        System.out.println(l2.pollLast());
        System.out.println(l1.removeLast());
        System.out.println(l2.removeFirst());
        for (Integer integer : l1) {
            System.out.print(integer);
            System.out.print(",");
        }
        System.out.println();
        for (Integer integer : l2) {
            System.out.print(integer);
            System.out.print(",");
        }
        ArrayDeque<Integer> d1=new ArrayDeque<>();
        ArrayDeque<Integer> d2=new ArrayDeque<>();
        d2.add(34);
        d2.add(44);
//        l2.clear();
        d1.add(3);
        d1.add(13);
        d1.add(23);
        d1.add(33);
        d1.add(43);
        d1.add(33);
        d2.addFirst(26);
        d1.addLast(21);
//        l1.addAll(l2);
//      System.out.println(l1.indexOf(33));
//      System.out.println(l1.lastIndexOf(33));
//        System.out.println(l2.contains(54));
//        System.out.println(l1.contains(33));
//        System.out.println(l1.remove(5));
//        System.out.println(l2.remove(0));
//        l2.set(0,26);
//        System.out.println(l1.subList(2,4));
//        System.out.println(l1.getLast());
//        System.out.println(l2.getFirst());
//        System.out.println(l1.peekFirst());
//        System.out.println(l1.pollFirst());
//        System.out.println(l2.pollLast());
        System.out.println(d1.removeLast());
        System.out.println(d2.removeFirst());
        for (Integer integer : d1) {
            System.out.print(integer);
            System.out.print(",");
        }
        System.out.println();
        for (Integer integer : d2) {
            System.out.print(integer);
            System.out.print(",");
        }
* /
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();
        h2.add(34);
        h2.add(44);
        h2.add(54);
//        l2.clear();
        h1.add(3);
        h1.add(13);
        h1.add(23);
        h1.add(53);
        h1.add(43);
        h1.add(33);
        System.out.println(h1.contains(54));
        System.out.println(h2.contains(33));
//       h1.remove(53);
//        h2.remove(54);
        System.out.println(h1);
        System.out.println(h2);
*/


// ----->  DATE AND TIME IN JAVA(NEW TOPIC)

 /*
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        Date d=new Date();
        System.out.println(d);
        System.out.print(d.getDate()+" "+ d.getMonth()+" "+ (1900+d.getYear()));
        Calendar c= Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.getTime());
        System.out.println(c);
        GregorianCalendar cd= new GregorianCalendar();
        System.out.println(cd.isLeapYear(2020));
        System.out.println(cd.isLeapYear(2023));
        System.out.println(cd.getWeekYear());
        System.out.println(cd.getWeeksInWeekYear());
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getTimeZone("Asia/Calcutta"));
        for (int i=0;i<=600;i++){
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }
        System.out.println(TimeZone.getDefault());
        LocalDate ld=LocalDate.now();
        System.out.println(ld);
        LocalTime lt=LocalTime.now();
        System.out.println(lt);
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy E H:m a");
        DateTimeFormatter dtf2= DateTimeFormatter.ISO_LOCAL_TIME;
        DateTimeFormatter dtf3=DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String NewDatePattern=ldt.format(dtf);
        String NewDatePattern1=ldt.format(dtf2);
        String NewDatePattern3=ldt.format(dtf3);
        System.out.println(NewDatePattern);
        System.out.println(NewDatePattern1);
        System.out.println(NewDatePattern3);
*/

/*
 ADVANCED JAVA PRACTICE SET
 QUESTION 1:-
        ArrayList<String> name=new ArrayList<>();
       name.add("Rishi");
       name.add("Ronit");
       name.add("DasBabu");
       name.add("Srinjay");
       name.add("Hi");
       name.add("Hello");
       name.add("Tata");
       name.add("Bye-Bye");
       name.add("Ayush");
       name.add("TRP");
        for (Object o:name){
            System.out.println(o);
        }

*/


//   QUESTION 2:-

        Date D= new Date();
        //noinspection deprecation
        System.out.println(D.getHours()+":"+D.getMinutes()+":"+D.getSeconds());



//   QUESTION 3:-

        Calendar cr=Calendar.getInstance();
        System.out.println(cr.get(Calendar.HOUR_OF_DAY) +":"+cr.get(Calendar.MINUTE)+":"+cr.get(Calendar.SECOND));


//   QUESTION 4:-

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);


//    QUESTION 5:-

        HashSet<Integer>set=new HashSet<>();
        set.add(6);
        set.add(26);
        set.add(76);
        set.add(76);
        set.add(26);
        set.add(6);
        System.out.println(set);
    }
}
