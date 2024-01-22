import java.util.ArrayList;
import java.util.Collections;

// Led Zeppelin
public class Main {
    public static void main(String[] args) {
        Employee jimmy = new Employee("Jimmy", "Page", "Guitarist", 27045.78);
        Employee robert = new Employee("Robert", "Plant", "Singer", 42500.00);
        Student john = new Student("John", "Bonham", 2.6);
        Student johnp = new Student("John", "Paul Jones", 3.0);

        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(jimmy);
        peopleList.add(robert);
        peopleList.add(john);
        peopleList.add(johnp);

        Collections.sort(peopleList);

        printData(peopleList);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.getPosition() + ": " + person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}

