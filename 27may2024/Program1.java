public class Program1{
    public static void main(String[] args){
        int x = 5;
        int y = 10;
        Program1 obj1 = new Program1();
        int z = obj1.addTwoNumber(x, y);
        System.out.println(z);
    }
    int addTwoNumber(int a, int b){
        int c;
        c = a+b;
        return c;
    }
}