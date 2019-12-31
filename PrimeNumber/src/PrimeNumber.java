public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 2; i < 100; i++){
            if(isPrime(i) == true){
                count ++;
                System.out.println( " number " + i + " is prime number");
            }
            if(count == 10){
                break;
            }
        }

    }
    public static boolean isPrime(int n){
        int count = 0;
        if(n == 1){
            return false;
        }
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count ++;
            }
        }
        if(count == 2){
            return true;
        }
        return false;

    }
}
