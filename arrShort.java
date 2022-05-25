import java.util.Arrays;
public class ArrShort{
    public static void main(String[] args) {
        int a[]= new int[]{23,45,2,5,7,4};
        Arrays.sort(a);
        for(int i=0;i< a.length;i++){
//        for(int j=a.length;i<1;j--){  -----for desending order
            System.out.println(a[i]);
        }
    }
}
