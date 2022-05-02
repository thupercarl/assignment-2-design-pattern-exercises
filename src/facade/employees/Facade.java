package facade.employees;

import facade.utilities.FileUtilities;
import facade.utilities.RecordsUtilities;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Facade
{
    private RecordsUtilities utilities;

    public Facade()
    {
        //do nothing
    }

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

    public String compare(Employee first, Employee second)
    {
        Comparator<Employee> employeeID = utilities.getIdComparator();
        Comparator<Employee> fName = utilities.getFirstNameComparator();
        Comparator<Employee> middleInit = utilities.getMiddleInitComparator();
        Comparator<Employee> lName = utilities.getLastNameComparator();
        Comparator<Employee> hireDate = utilities.getHireDateComparator();

        StringBuilder result = new StringBuilder();
        result
                .append("Comparing ").append(first.getFirstName()).append(" and ").append(second.getFirstName())
                .append("\r\n")
                .append("ID : ")
                .append(employeeID.compare(first, second))
                .append("\r\n")
                .append("First Name : ")
                .append(fName.compare(first, second))
                .append("\r\n")
                .append("Middle Initial : ")
                .append(middleInit.compare(first, second))
                .append("\r\n")
                .append("Last Name : ")
                .append(lName.compare(first, second))
                .append("\r\n")
                .append("Hire Date : ")
                .append(hireDate.compare(first, second));
        return result.toString();
    }

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
}
