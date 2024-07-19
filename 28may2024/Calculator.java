public class Calculator {
    public static void main(String[] args){
        
        int num1 = 30;
        int num2 = 5;

        Calculator obj1 = new Calculator();

        int add = obj1.sum(num1, num2);
        System.out.println("30 + 5 is : " + add);

        int sub = obj1.dif(num1, num2);
        System.out.println("30 - 5 is : " + sub);
        
        int mul = obj1.pro(num1, num2);
        System.out.println("30 * 5 is : " + mul);
        
        int div = obj1.div(num1, num2);
        System.out.println("30 / 5 is : " + div);

    }
    
    int sum(int a, int b){
        return a+b;
    }

    int dif(int a, int b){
        return a-b;
    }

    int pro(int a, int b){
        return a*b;
    }

    int div(int a, int b){
        return a/b;
    }
}
