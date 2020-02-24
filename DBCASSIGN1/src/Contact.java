import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Contact {
    public static ArrayList<Person> contact = new ArrayList<>();

    public void addcontact() {
        Scanner s = new Scanner(System.in);
        System.out.println("You have chosen to add a new contact: \n" +
                "Please enter the name of the Person \n First Name:");
        String firstname = s.next();
        System.out.println("Last Name");
        String lastname = s.next();
        System.out.println("Contact Number");
        String no = s.next();
        ArrayList l = new ArrayList();
        l.add(no);
        System.out.println("Would you like to add another contact number? (y/n)");
        String n = s.next();

        while (n.equals("y")) {
            no = s.next();
            l.add(no);
            System.out.println("Would you like to add another contact number? (y/n)");
            n = s.next();
        }
        System.out.println("Would you like to add email address? (y/n): ");
        n = s.next();
        String emailaddress;
        if (n.equals("y")) {
            emailaddress = s.next();
        } else {
            emailaddress = null;
        }


        contact.add(new Person(firstname, lastname, l, emailaddress));
        System.out.println(contact);
        Collections.sort(contact, new Sortbyname());


    }

    void view() {
        for (int i = 0; i < contact.size(); i++) {
            System.out.println(contact.get(i));
        }
    }

    void search() {
        System.out.println("You could search for a contact from their first names: ");
        Scanner s = new Scanner(System.in);
        String ss = s.next();
        for (int i = 0; i < contact.size(); i++) {
            if (Person.equalsto(contact.get(i), ss)) {
                System.out.println(contact.get(i));

            }
        }
    }

    void delete() {
        System.out.println("Here are all your contacts: ");
        for (int i = 0; i < contact.size(); i++) {
            System.out.println((i + 1) + " . " + Person.getFirstname(contact.get(i)));
        }
        System.out.println("Press the number against the contact to delete it:");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        System.out.println(Person.getFirstname(contact.get(i)) + " contact deleted from list!");
        contact.remove(i);

    }


}