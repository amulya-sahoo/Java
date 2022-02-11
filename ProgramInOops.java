import java.util.Scanner;

public class ProgramInOops {
    int a, b ,i;
    Scanner sc=new Scanner(System.in);
    void myFirstJavaProgram(){
        System.out.println("Hello ! i'm writting some java programs. Hope u understand...");
    }
    void arithmaticOp(){
        a=10;
        b=20;
        System.out.println("a+b= "+ (a+b));
        System.out.println("a-b=  "+ (a-b));
        System.out.println("a*b= "+ (a*b));
        System.out.println("a/b= "+ (a/b));
        System.out.println("a%b= "+ (a%b));
    }
    void logicalOp(){
        if(a==b && a<=b){
            System.out.println("a is equal to b");
        }
        if(a==b || a<b);{
        System.out.println("b is greater");
        }
        if(a!=b){
            System.out.println(" both having another value");
        }
    }
    void conditionOp(){
        int c =(a==1)?20:30;
        System.out.println("The valeu of c is  "+ c);
    }
    void controlStatementIf(){
        System.out.println("Enter The number to Check");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2==0)
            System.out.println("Entered Number Is Even");
        else System.out.println("Entered Number is  odd");
    }
    void oneDArray(){
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("After adding the elements of the input array ");
        int sum=0;
        for (i=0;i<n;i++){
            sum=sum+a[i];
        }
        System.out.print(sum);
    }
    void twoDArray(){
        System.out.println("Enter the size of colomn");
        int colomn= sc.nextInt();
        System.out.println("Enter the size of row");
        int row= sc.nextInt();
        int [] [] x= new int[colomn][row];
        for(int i = 0;i<colomn;i++) {
            for (int j = 0; j < row; j++) {
                x[i][j] = sc.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        ProgramInOops obb=new ProgramInOops();
        obb.myFirstJavaProgram();
        obb.arithmaticOp();
        obb.logicalOp();
        obb.conditionOp();
        obb.controlStatementIf();
        obb.oneDArray();
        obb.twoDArray();
    }
}
