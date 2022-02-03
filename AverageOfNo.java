import java.util.Scanner;
 class Average{
     int avg;
    void toAverage(int x, int y, int z){
        avg=(x+y+z)/3;
    }
    void show(){
        System.out.println("The Average Of Three Numbers is =" + avg);
    }
}
public class AverageOfNo {
    public static void main(String[] args) {
        Average obb=new Average();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        obb.toAverage(a,b,c);
        obb.show();
    }
}
