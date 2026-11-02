// CLASS NAME IS SAME AS THE CHAPTER NAME
/*
class Animal{
     Animal(){
         System.out.println("Class consists of all the animals");
    }
    public void place(){
        System.out.println("We live in the jungle");
    }
}
class Dog extends Animal{
    public Dog(){
        System.out.println("Bhaw Bhaw");
    }
}
*/
// class EkClass{
//    int x,y;
//    public EkClass() {
//        System.out.println("I am a default constructor");
//    }
//    public int getX() {
//        return x;
//    }
//    public int getY() {
//        return y;
//    }
//   EkClass(int a,int e) {
//        this.x = a;
//        this.y=e;
//    }
//    public int return_one(){
//        return 1;
//    }
//}
//class DoClass extends EkClass{
//    DoClass(int b,int f){
//        super(b,f);
//        System.out.println("Main ek derived constructor hoon Bhaiyo");
//    }
//}
//class A{
//    public int a;
//    public int ronit(){
//        return 26;
//    }
//    public void meth2(){
//        System.out.println("I am method 2 of class A");
//    }
//}
//class B extends A{
//public void meth2(){
//    System.out.println("I am method 2 of class B");
//}
//public void meth3(){
//    System.out.println("I am method 3 of class B");
//}
//}
//class Phone{
//    public void ShowTime(){
//        System.out.println("Get ready it's 8pm now......");
//    }
//    public void on(){
//        System.out.println("Turning on the phone......");
//    }
//    public void music(){
//        System.out.println("Playing the music......");
//    }
//}
//class Smartphone extends Phone{
//    public void on(){
//        System.out.println("Turning on the Smartphone");
//    }
//    public void Gaming(){
//        System.out.println("Playing BGMI for chicken dinner");
//    }
//}
//class circle{
//    public int radius;
//    circle(){
//        System.out.println("This is the class of circle");
//    }
//    circle(int r){
//        this.radius=r;
//    }
//    public double area(){
//        return (Math.PI*this.radius*this.radius);
//    }
//}
//class CYLINDER_1 extends circle{
//    public int height;
//    public CYLINDER_1(int r,int h){
//        super(r);
//        this.height=h;
//    }
//    public double volume(){
//        return (Math.PI*this.radius*this.radius*this.height);
//    }
//    public double csa(){
//        return (2*Math.PI*this.radius*this.height);
//    }
//}
class RECTANGLE{
    public float length,breadth;
RECTANGLE(){
    System.out.println("The shape is rectangle");
}
RECTANGLE(float l,float b){
    this.length=l;
    this.breadth=b;
}

    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public float getBreadth() {
        return breadth;
    }
    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }
    public float area_cal(){
    return(this.length*this.breadth);
}
}
class Cuboid extends RECTANGLE {
    public float height;

    public Cuboid(float lh, float bh, float ht) {
        super(lh, bh);
        this.height = ht;
    }

    public float volume_cal() {
        return (this.length * this.breadth * this.height);
    }
}
public class Inheritance {
    public static void main(String[] args) {
//        Dog obj=new Dog();
//        obj.place();
//        EkClass ec = new EkClass(69,25);
//        DoClass dc=new DoClass(29,67);
//        System.out.println(ec.getX());
//        System.out.println(ec.getY());
//        A a=new A();
//        a.meth2();
//        B b=new B();
//         b.meth2();
//        Phone ph=new Smartphone();
//        ph.on();
//        ph.music();
//        ph.ShowTime();
//        PRACTICE SET PROBLEM 1 and 4:
//        CYLINDER_1 obj = new CYLINDER_1(12,4);
//        System.out.println("The Area of circle is= "+obj.area());
//        System.out.println("The volume of cylinder is= "+obj.volume());
//        System.out.println("The Curved Surface Area of circle is= "+obj.csa());
        //        PRACTICE SET PROBLEM 2 and 4:
//        Cuboid cd=new Cuboid(15.2f,12.7f,13.6f);
//        System.out.println("The area of Rectangle is= "+cd.area_cal());
//        System.out.println("The volume of cuboid is= "+cd.volume_cal());
    }
}
