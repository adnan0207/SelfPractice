public class Program6 {
    public static void main(String[] args){
        int a = 15;
        int b = 10;
        int c = 25;
        int d = 5;

        Program6 obj1 = new Program6();
        int p = obj1.toAdd(a, b);
        System.out.println(p);

        Program6 obj2 = new Program6();
        int q = obj2.toAdd(c, d);
        System.out.println(q);

        Program6 obj3 = new Program6();
        int r = obj3.toSub(c, b);
        System.out.println(r);

        Program6 obj4 = new Program6();
        int s = obj4.toSub(a, d);
        System.out.println(s);
    }
    int toAdd(int a, int b){
        int c = a+b;
        return c;
    }
    int toSub(int x, int y){
        int z = x-y;
        return z;
    }
}
