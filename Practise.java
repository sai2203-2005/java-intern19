import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<String> emails = new HashSet<>();

        while (true) {
            System.out.print("Enter email (or exit): ");
            String email = sc.nextLine().trim().toLowerCase();

            if (email.equals("exit")) {
                break;
            }

            if (!email.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")) {
                System.out.println("Invalid email address!");
                continue;
            }

            if (emails.add(email)) {
                System.out.println("Registration successful!");
            } else {
                System.out.println("Email already registered!");
            }

            System.out.println("Total registered users: " + emails.size());
            System.out.println();
        }

        sc.close();
    }
}
