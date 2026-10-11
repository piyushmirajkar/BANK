import java.util.*;

class atm_mm {
    double amount = 0;

    public atm_mm() {
        System.out.println("Welcome to PM Bank");

        System.out.println("ADD money => 1");
        System.out.println("REMOVE money => 2");
        System.out.println("Check balance => 3");
        System.out.println("");
    }

    public double Add(double n) {
        amount = amount + n;
        return amount;
    }

    public double Remove(double n) {
        // if
        amount = amount - n;
        return amount;
    }

    public void printB() {
        System.out.println(amount);
    }

}

public class ATM {
    public static void main(String[] args) {

        atm_mm obj = new atm_mm();

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        double n = 0;

        switch (input) {
            case 1:
                System.out.println("Enter amount to add");
                n = sc.nextDouble();
                obj.Add(n);
                obj.printB();
                break;

            case 2:
                System.out.println("Enter amount to remove");
                n = sc.nextDouble();
                obj.Remove(n);
                obj.printB();
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }
        System.out.println("THANK YOU");
    }
}
