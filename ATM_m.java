import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ATM_m {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" ------------ Welcome to PM bank ---------");

        // Create or excisting
        System.out.println("To create account => 1");
        System.out.println("To excisting account => 2");

        int account_C_E = sc.nextInt();

        // To create account
        if (account_C_E == 1) {
            // Name
            System.out.println("Enter your first name");
            String Fname = sc.next();

            System.out.println("Enter your mid name");
            String Mname = sc.next();

            System.out.println("Enter your last name");
            String Lname = sc.next();

            // ID
            System.out.println("Aadharcard no");
            int id_adar = sc.nextInt();

            sc.nextLine();
            // Address
            System.out.println("Address");
            String Address = sc.nextLine();

            // Password
            System.out.println("Strong password of four digit");
            int ps = sc.nextInt();

            // Account id
            int Account_id = ThreadLocalRandom.current().nextInt(10000, 100000);

            System.out.println("Successfully created account with id = >" + Account_id);
        }
        // To excisting account
        else if (account_C_E == 2) {
            System.out.println("hi");
        }
        // Invalid input of Create or excisting
        else {
            System.out.println("Invalid input");
        }
    }
}
