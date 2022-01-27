import java.util.Scanner;
public class GCD {
    static void findGCD(int a, int b){
        int gcd=0;
        for(int i=1;i<=a && i<=b;i++)
            if(a%i==0 && b%i == 0)
                gcd=i;
        System.out.println(gcd);
    }
    public static void main(String[] args) {
        System.out.println("Enter two number");
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        findGCD(a,b);


    }

}
