
package lab_3;

abstract class MobilePhone
{
    public void Calling(int x) 
    {
        System.out.println("Calling the number "+x);
    }
    public void SendSMS(int x)
    {
        System.out.println("Sending SMS to the number "+x);
    }
}

class Nokia1400 extends MobilePhone
{

    @Override
    public void Calling(int x) {
        super.Calling(x);
    }
    public void SendSms(int x)  {
        super.SendSMS(x);
    }
    public void n1400(int x) {
        System.out.println("Printing methods of Nokia1400");
        Calling(x);
        SendSms(x);
    }
}

class Nokia2700 extends MobilePhone
{
    //public void n2700(int x) {
        
    
    @Override
    public void Calling(int x) {
        super.Calling(x);
    }
    public void SendSms(int x) {
        super.SendSMS(x);
    }
    public void FMRadio()
    {
        System.out.println("Method FMRadio() of Nokia2700");
    }
    public void MP3() {
        System.out.println("Method of MP3() Nokia2700");
    }
    public void Camera() {
        System.out.println("Method of Camera() Nokia2700");
    }
    public void n2700(int x) {
        System.out.println("Printing methods of Nokia2700");
        Calling(x);
        SendSms(x);
        FMRadio();
        MP3();
        Camera();
    }
}


class BlackBerry extends MobilePhone
{
    @Override
    public void Calling(int x) {
        super.Calling(x);
    }
    public void SendSms(int x) {
        super.SendSMS(x);
    }
    public void FMRadio() {
        System.out.println("Method FMRadio() of Blackberry");
    }
    public void MP3() {
        System.out.println("Method of MP3() of Blackberry");
    }
    public void Camera() {
        System.out.println("Method of Camera() of Blackberry");
    }
    public void Recording() {
        System.out.println("Method of Recording() of Blackberry");
    }
    public void ReadAndSendEmails() {
        System.out.println("Metod of ReadAndSendEmails() of Blackberry");
    }
    public void blkbry(int x) {
        System.out.println("Printing methods of BlackBerry");
        Calling(x);
        SendSms(x);
        FMRadio();
        MP3();
        Camera();
        Recording();
        ReadAndSendEmails();
    }

}



public class Lab_3 {

     
    public static void main(String[] args) {
        System.out.println(args[0]);
        MobilePhone m;
        Nokia2700 n = new Nokia2700();
        n.n2700(111222);
        System.out.println("\n");
        Nokia1400 p = new Nokia1400();
        p.n1400(222187);
        System.out.println("\n");
        BlackBerry b = new BlackBerry();
        b.blkbry(123456);
    }
    
}
