import java.util.Scanner;

public class MENU {
    public static void main(String[] args) {


        while (true) {
            System.out.println("Welcome to DBC's Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            Contacts obj = new Contacts();

            if (n == 1) {
                obj.addcontact();
            } else if (n == 2) {
                obj.view();

            } else if (n == 3) {
                obj.search();

            } else if (n == 4) {
                obj.delete();
            } else if (n == 5) {
                break;
            }

        }
    }
}