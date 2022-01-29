import java.util.Scanner;
class LeapYear{
    int year;
    void isLeapYear(){
        if(year%400 == 0){
            System.out.println("This is a leap year");
        }
        if(year%100==0){
            System.out.println("This is a leap year");
        }
        if( year %4 ==0){
            System.out.println("This is a leap year");
        }
        else{
            System.out.println("This is not a leap year");
        }
    }
}
public class FindLeapYear{
    public static void main(String[] args) {
        LeapYear a = new LeapYear();
        System.out.println("Enter a year to check");
        Scanner sc = new Scanner(System.in);
         a.year = sc.nextInt();
         a.isLeapYear();
    }
}
