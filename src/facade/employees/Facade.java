package facade.employees;

import facade.utilities.FileUtilities;
import facade.utilities.RecordsUtilities;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * This class is designed to make working with the Employee class easier by streamlining the use of
 * the FileUtilities and RecordsUtilities classes
 * @author Jake Donaldson
 * @version 5/3/22
 */
public class Facade
{
    private RecordsUtilities utilities;

    /**
     * This method constructs a Facade
     */
    public Facade()
    {
        //do nothing
    }

    /**
     * This method reads in Employee data and converts the data into Objects
     * JUSTIFICATION: This method takes care of initialization of necessary objects as well as locating
     * the serialized data file, converting each String contained to an object, and returning those objects in a List.
     * @return List containing all Employee objects created from deserialization process
     * @throws FileNotFoundException if the necessary data file is not found
     */
    public List<Employee> deserializeAll() throws FileNotFoundException
    {
        Scanner read = new FileUtilities().getFileReader("files/records.csv");
        List<Employee> deserializedList = new ArrayList<>();
        utilities = new RecordsUtilities();
        while(read.hasNext())
        {
            deserializedList.add(utilities.deserialize(read.next()));
        }

        return deserializedList;
    }

    /**
     * This method compares any two employees with every comparator provided in the RecordsUtilities class
     * JUSTIFICATION: This method lets a user test all comparators at once to verify that they work correctly.
     * @param first the initial employee to be compared
     * @param second the employee to be compared against
     * @return String representation of each comparison's output
     */
    public String compare(Employee first, Employee second)
    {
        Comparator<Employee> employeeID = utilities.getIdComparator();
        Comparator<Employee> fName = utilities.getFirstNameComparator();
        Comparator<Employee> middleInit = utilities.getMiddleInitComparator();
        Comparator<Employee> lName = utilities.getLastNameComparator();
        Comparator<Employee> hireDate = utilities.getHireDateComparator();

        return "Comparing " + first.getFirstName() + " and " + second.getFirstName() +
                "\r\n" +
                "ID : " +
                employeeID.compare(first, second) +
                "\r\n" +
                "First Name : " +
                fName.compare(first, second) +
                "\r\n" +
                "Middle Initial : " +
                middleInit.compare(first, second) +
                "\r\n" +
                "Last Name : " +
                lName.compare(first, second) +
                "\r\n" +
                "Hire Date : " +
                hireDate.compare(first, second);
    }

    /**
     * This method takes a List of Employee objects, converts them into Strings, and saves them to a file
     * JUSTIFICATION: This method takes care of initializing necessary write-objects as well as executing logic to
     * apply those write-objects to Employees in order to create a new serialized file.
     * @param employees List of Employee objects
     * @throws FileNotFoundException if the destination file/folder could not be located
     */
    public void serializeAll(List<Employee> employees) throws FileNotFoundException {
        PrintWriter write = new FileUtilities().getFileWriter("files/newData.csv", true);
        for (Employee employee : employees)
        {
            String serialized = utilities.serialize(employee);
            write.write(serialized);
            write.flush();
            write.write("\r\n");
            write.flush();
        }
        write.close();
    }

    @Override
    public String toString() {
        return "Facade{" +
                "utilities=" + utilities +
                '}';
    }
}
