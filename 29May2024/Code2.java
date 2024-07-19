public class Code2 {
    public static void main(String[] args) {
        
        Code1 obj1 = new Code1();

        obj1.wheels = 4;
        obj1.color = "Black";
        obj1.brandName = "Honda";
        obj1.make = 2015;

        obj1.run();
        obj1.describe();

        Code1 obj2 = new Code1();

        obj2.wheels = 4;
        obj2.color = "White";
        obj2.brandName = "BMW";
        obj2.make = 2020;

        obj2.run();
        obj2.describe();

        Code1 obj3 = new Code1();

        obj3.wheels = 2;
        obj3.color = "Blue";
        obj3.brandName = "Yamaha";
        obj3.make = 2023;

        obj3.run();
        obj3.describe();
    }
}