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
        if(n == 1){
            return false;
        }
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;

    }
}
