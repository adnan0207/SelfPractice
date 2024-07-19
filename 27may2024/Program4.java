public class Program4 {
    public static void main(String[] args){
        int x = 15;
        int y = 10;
        int p = 25;
        int q = 5;

        Program4 obj1 = new Program4();
        
        int z = obj1.addTwoNum(x, y);
        int a = obj1.addTwoNum(p, q);
        System.out.println(z);
        System.out.println(a);
        int b = obj1.subTwoNumber(p, y);
        int c = obj1.subTwoNumber(x, q);
        System.out.println(b);
        System.out.println(c);
    }
    int addTwoNum(int a, int b){
        int c;
        c = a+b;
        return c;
    }
    int subTwoNumber(int x, int y){
        int z;
        z = x-y;
        return z;
    }
}
