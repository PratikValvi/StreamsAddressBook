import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonDaoImplements implements PersonDao {
    //Creating ArrayList to Store AddressBook Contact
    List<Person> personList = new ArrayList<>();

    //Creating Scanner Class Object
    Scanner scan = new Scanner(System.in);

    //Function to Add new Record in Address Book
    public void addPerson() {
        System.out.println("Enter First Name: ");
        String firstName = scan.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = scan.nextLine();
        System.out.println("Enter Mobile Number: ");
        String mobileNumber = scan.nextLine();
        System.out.println("Enter Email Address: ");
        String emailAddress = scan.nextLine();
        System.out.println("Enter State: ");
        String state = scan.nextLine();
        System.out.println("Enter City: ");
        String city = scan.nextLine();
        System.out.println("Enter Address: ");
        String address = scan.nextLine();
        System.out.println("Enter Pin Code: ");
        String pinCode = scan.nextLine();

        Person person = new Person();
        person.setFirstname(firstName);
        person.setLastname(lastName);
        person.setMobileno(mobileNumber);
        person.setEmail(emailAddress);
        person.setState(state);
        person.setCity(city);
        person.setAddress(address);
        person.setPincode(pinCode);

        personList.add(person);
        System.out.println("Record Added Successfully");
    }
}
