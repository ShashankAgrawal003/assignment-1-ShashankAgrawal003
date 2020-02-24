import java.util.ArrayList;

public class Person {
    String firstname, lastname, emailaddress;
    ArrayList phoneno;

    Person(String firstname, String lastname, ArrayList phoneno, String emailaddress) {
        this.emailaddress = emailaddress;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneno = phoneno;
    }

    public static String getFirstname(Person obj) {
        return obj.firstname;
    }

    public static boolean equalsto(Person obj, String match) {
        if (obj.firstname.equals(match)) {
            return true;
        } else {
            return false;
        }

    }

    String getphones(ArrayList l) {
        String j = null;
        for (Object i : l) {
            j += i + ", ";
        }
        return j;
    }

    public String toString() {
        return "First Name:" + firstname + "\n Last Name:" + lastname + "\n Contact Number: " + phoneno + "\n Email Address: " + emailaddress;

    }
}