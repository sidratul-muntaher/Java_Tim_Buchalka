import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = scanner.nextLine();
        System.out.println("Enter your birth year : ");
        int birthyear = scanner.nextInt();
        int age = 2020 - birthyear;
        System.out.println("Hi " + name + " and you are " + age + " years old");
        scanner.close();
    }
}
