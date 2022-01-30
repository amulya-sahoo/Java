import java.util.Locale;
import java.util.Scanner;

public class StringReverse2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        String string= sc.nextLine();
        boolean flag= true;
        string= string.toLowerCase();
        for(int i=0; i<string.length()/2;i++){
            if(string.charAt(i)!= string.charAt(string.length()-1-i));
            flag=false;
            break;
        }
        if(flag)
        System.out.println("String is palindrome");
        else
        System.out.println("String is not palindrome");
    }
}
