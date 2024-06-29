import java.util.*;
class atm{
    int balance;
    int pin=8525;
    int transactions=0;
    String transactionHistory="";
    Scanner sc=new Scanner(System.in);
    public void pinNumber(){
        System.out.print("Enter your pin: ");
        int pinNum=sc.nextInt();
        if(pin==pinNum){
            System.out.println("Hello CUstomer");
            menu();
        }
        
    }


}