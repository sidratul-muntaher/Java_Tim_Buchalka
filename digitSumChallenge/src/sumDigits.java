public class sumDigits {
    public static void main(String[] args) {
        System.out.println("the sum of the digits in number 125 is " + sumDigit(125));
        System.out.println("the sum of the digits in number -125 is " + sumDigit(-125));
        System.out.println("the sum of the digits in number -4 is " + sumDigit(4));
        System.out.println("the sum of the digits in number 32123 is " + sumDigit(32123));
    }
    public static int sumDigit(int number){
        int sum = 0, n, r;
        if(number <= 10){
            return -1;
        }
        for(n = number; n != 0; n /= 10){
            r = n % 10;
            sum = sum + r;
        }
        return sum;
    }
}
