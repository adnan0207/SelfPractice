public class PrimeNumber {
    public static void main(String[] args){

        int n = 10;

        PrimeNumber obj = new PrimeNumber();
        obj.checkForPrimeNumber(n);
    }

    void checkForPrimeNumber(int number){
        if(number<=1){
            System.out.println(number + " is not a prime number");
            return;
        }

        if(number == 2){
            System.out.println(number + " is a prime number");
            return;
        }

        for(int i=2; i<number; i++){
            int remainder;
            remainder = number % i;
            if(remainder == 0){
                System.out.println(number + " is not a prime number");
                return;
            }
        }

        System.out.println(number + " is a prime number");
    }
}
