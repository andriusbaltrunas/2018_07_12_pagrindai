package days.fifth;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andriusbaltrunas on 7/18/2018.
 */
public class FistTask {

    public static void main(String[] args) {
        Person person = new Person("Andrius", "Baltrunas", 30, "Kaunas");
        /*person.setName("Andrius");
        person.setSurname("Baltrunas");
        person.setAge(30);
        person.setCity("Kaunas");*/

        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(new Person("Jonas", "Jonaitis", 54, "Pabrades"));
        print(persons);
    }

    private static void print(List<Person> persons){
        for (Person p : persons) {
            System.out.println(p.getCity());
        }
    }
}
