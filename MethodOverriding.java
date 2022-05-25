public class MethodOverriding {
    void add(int x,int y){
        System.out.println(x);
    }
}
class Amulya extends MethodOverriding{
    void add(int x, int y){
        System.out.println(x+" "+y);
    }
    public static void main(String[] args) {
        Amulya obb= new Amulya();
        int x=12, y=13;
        obb.add(x,y);
    }
}
