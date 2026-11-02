//import com.sun.source.tree.SynchronizedTree;

/*
class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("Thread1 for cooking......");
            System.out.println("I am Sad");
            i++;
        }
    }
}
    class MyThread2 extends Thread {
        public void run() {
            int j = 0;
            while (j < 40000) {
                System.out.println("Thread2 for chatting......");
                System.out.println("I am Happy");
                j++;
            }
        }
    }
class MyRunnableTthread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 20000; i++) {
            System.out.println("I am a thread 1 not a threat 1");
        }
    }
}class MyRunnablethread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 20000; i++) {
            System.out.println("I am a thread 2 not a threat 2");
        }
    }
}
*/
/*
class ThreadRunnable implements Runnable {
    public void run() {
            System.out.println("Thank You");
        }
    }
class TthreadRunnable extends Thread {
    public TthreadRunnable(Runnable r, String name) {
        super(name);
    }    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            System.out.println("Thank You " + this.getName());
        }
    }
}
*/
/*
class TthreadRunnable1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("Thank You........");
        }
    }
}
class TthreadRunnable2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("Thanking You So Much.......");
            try {
                Thread.sleep(85);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
*/
/*
// ANSWER NO 1 AND 2-
class Message1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i >= 0; i++) {
            System.out.println("Good Morning....");
        }
    }
}class Message2 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i >= 0; i++) {
            System.out.println("Welcome....");
        }
    }
}
*/

// ANSWER NUMBER 3
class Prgset3 extends Thread{
    @Override
    public void run(){
        System.out.println("Setting the Priority");
    }
}
class Prgget3 extends Thread{
    @Override
    public void run() {
        System.out.println("Getting the Priority");
    }
}
public class Multithreading {
    public static void main(String[] args) {
/*
 MyThread1 a1=new MyThread1();
MyThread2 a2=new MyThread2();
a1.start();
a2.start();
MyRunnableTthread bullet1=new MyRunnableTthread();
Thread gun1=new Thread(bullet1);
MyRunnablethread bullet2=new MyRunnablethread();
Thread gun2=new Thread(bullet2);
gun1.start();
gun2.start();
        ThreadRunnable tr=new ThreadRunnable();
        Thread t=new Thread(tr);
        TthreadRunnable t1=new TthreadRunnable(tr,"Rishi Sahanty");
        TthreadRunnable t2=new TthreadRunnable(tr,"Rishi");
        TthreadRunnable t3=new TthreadRunnable(tr,"Rishi Sahu");
        TthreadRunnable t4=new TthreadRunnable(tr,"Rishi12");
        TthreadRunnable t5=new TthreadRunnable(tr,"Rishi45");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        System.out.println("The id of the Thread= "+t1.getId());
        System.out.println("The name of the Thread is- "+t1.getName());
*/
        /*
        TthreadRunnable1 tr=new TthreadRunnable1();
        TthreadRunnable2 r=new TthreadRunnable2();
        tr.start();
        try {
            tr.join();
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        r.start();
         */
//        PRACTICE SET :-
//        QUESTION NO 1 and 2-
//        Message1 m1=new Message1();
//        Message2 m2=new Message2();
//        m1.start();
//        m2.start();

//        QUESTION NO 3-
Prgset3 ps1=new Prgset3();
Prgget3 ps2=new Prgget3();
ps1.setPriority(4);
ps2.setPriority(1);
//        System.out.println("Priority of ps1= "+ps1.getPriority());
//        System.out.println("Priority of ps2= "+ps2.getPriority());
        System.out.println("State of ps1= "+ ps1.getState());
        ps1.start();
        ps2.start();
        System.out.println("State of ps2= "+ps2.getState());
        System.out.println("Printing the reference of thread= "+Thread.currentThread().getState());
    }
}
