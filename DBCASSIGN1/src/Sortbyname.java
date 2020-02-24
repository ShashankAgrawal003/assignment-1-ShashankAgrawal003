import java.util.Comparator;

class Sortbyname implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.firstname.compareTo(o2.firstname);
    }
}