//interface bicycle{
//    void applyBrake(int decrement);
//    void SpeedUP(int increment);
//}
//interface movies{
//    void HP();
//    void PHP();
//}
//class Avon implements bicycle,movies{
//    int speed=10;
//    public void applyBrake(int decrement){
//        speed=speed-decrement;
//        System.out.println("the speed of decrement is= "+speed);
//    }
//   public void SpeedUP(int increment){
//        speed=speed+increment;
//       System.out.println("the speed of increment is= "+speed);
//    }
//    public void HP(){
//        System.out.println("Hera Pheri chan chan chan.......");
//    }
//    public void PHP(){
//        System.out.println("Phir Hera Pheri dik chak dik chak.......");
//    }
//}

//interface MYCamera{
//    void takePic();
//    void RecordVideo();
//    private void greet(){
//        System.out.println("GOOD MORNING");
//    }
//    default void RecordvideoHD(){
//      greet();
//        System.out.println("Recording in HD Resolution");
//    }
//}
//interface MYWifi{
//    String [] Network();
//    void ConnectTo_network(String Network);
//}

//class CellPhone{
//void callNumber(long Number){
//    System.out.println("Calling"+Number);
//}
//void PickCall(){
//    System.out.println("Connecting.....");
//}
//}

//class Smartphone extends CellPhone implements MYCamera,MYWifi {
//    public void takePic() {
//        System.out.println("Taking a Picture");
//    }
//    public void RecordVideo() {
//        System.out.println("Recording the video");
//    }
//    public String[] Get_network() {
//        System.out.println("Getting the list of network");
//        return new String[]{"Ronit", "Srinjay", "ShubhamDas" };
//    }
//    public void connectToNetwork(String network) {
//        System.out.println("Connecting to " + network);
//    }
//    @Override
//    public String[] Network() {
//        return new String[0];
//    }
//    @Override
//    public void ConnectTo_network(String Network) {
//    }
//}
//  PRACTICE SET 11 QUESTION 1 and 2 SOLUTION
/*
 abstract class Pen {
     abstract void write();
     abstract void refill();
}
 class Fountainpen extends Pen {
     public void write(){
          System.out.println("Writing with the Pen");
      }
   public void refill(){
       System.out.println("filling refill in the pen");
   }
   public void changeNip(){
       System.out.println("Changing the Nip Of the pen");
   }
}
*/
//  QUESTION 3 SOLUTION
// interface BasicAnimal{
//    void eat();
//    void sleep();
//}
//class Monkey{
//public void Jump(){
//    System.out.println("Jumping from tree");
//}
//public void Bite(){
//    System.out.println("Biting the Person");
//}
//    public void Speak(){
//        System.out.println("Speaking... Veee...Veeee");
//    }
//
//}
//class Human extends Monkey implements BasicAnimal{
//    public void eat(){
//        System.out.println("Eating food");
//    }
//    public void sleep(){
//        System.out.println("Sleeping..zzzz....");
//    }
//}
/*
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelePhone extends Telephone{
    @Override
    void ring() {
        System.out.println("Ringing......");
    }
    @Override
    void lift() {
        System.out.println("Picking up the call");
    }
    @Override
    void disconnect() {
        System.out.println("Disconnected the call");
    }
    void PlayMusic(){
        System.out.println("Playing music....");
    }
}
 */
// PROBLEM NO 6
interface TVRemote{
    void ClickButton();
}
interface SmartTvRemote extends TVRemote{
    void VoiceAssistant();
}
class TV implements TVRemote,SmartTvRemote{
   public void ClickButton(){
        System.out.println("Changing the channel Manually");
    }
   public void VoiceAssistant(){
        System.out.println("Changing the channel through Voice Command");
    }
}
 class Abstract_interfaces {
     public static void main(String[] args) {
//         Class Question 1
//  Avon a=new Avon();
//        a.applyBrake(3);
//        a.SpeedUP(6);
//        a.HP();
//        a.PHP();

//         Class Question 2
//         Smartphone sp = new Smartphone();
//         sp.RecordvideoHD();
//         String[] ar = sp.Get_network();
//         for (String item : ar) {
//             System.out.println(item);

//   PRACTICE SET PROBLEMS

//         PROBLEM NUMBER 1 & 2-
//Fountainpen fp=new Fountainpen();
//fp.write();
//fp.refill();
//fp.changeNip();

//         PROBLEM 3 and 5-
//     Monkey hn=new Human();
//     hn.Jump();
// [hn.eat(); or hn.sleep();]-->error because it is not defined in the monkey class.(Polymorphism using interfaces)
//hn.Speak();
//         PROBLEM 4
//Telephone tp=new SmartTelePhone();
// tp.PlayMusic();--> throws an error because it is not defined in telephone class.Hence,we can only use the defined method of the class(Polymorphism)
//        tp.ring();
//        tp.lift();
//        tp.disconnect();

//        PROBLEM 6 and 7
//TV obj=new TV();
//obj.ClickButton();
//obj.VoiceAssistant();
         }
     }
