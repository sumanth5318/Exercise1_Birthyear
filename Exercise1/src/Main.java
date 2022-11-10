import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Provide your age");
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        int current_year = 2022;
        int birth_year = (current_year - age);
        System.out.println("Your birth year :"+birth_year);
    }
}