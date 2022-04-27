package facade.utilities;

import facade.employees.Employee;

import java.time.LocalDate;
import java.util.Comparator;

/**
 * A utilities class with methods that interact with Employee records.
 *
 * DO NOT EDIT THIS FILE!
 *
 * @author Josh Archer
 * @version 1.0
 */
public class RecordsUtilities
{
    /**
     * Converts a String to an Employee object.
     *
     * @param record the serialized string
     * @return a new Employee object
     */
    public Employee deserialize(String record)
    {
        String[] parts = record.split(",");
        return new Employee(
            Integer.parseInt(parts[0]),
            parts[1],
            parts[2].charAt(0),
            parts[3],
            LocalDate.parse(parts[4])
        );
    }

    /**
     * Converts an Employee object to a String.
     *
     * @param record the Employee object
     * @return a new string
     */
    public String serialize(Employee record)
    {
        return record.getId() + "," +
                record.getFirstName() + "," +
                record.getMiddleInit() + "," +
                record.getLastName() + "," +
                record.getHireDate();
    }

    /**
     * Returns a comparator that compares employees based on id.
     *
     * @return the comparator
     */
    public Comparator<Employee> getIdComparator()
    {
        return Comparator.comparingInt(Employee::getId);
    }

    /**
     * Returns a comparator that compares employees based on first name.
     *
     * @return the comparator
     */
    public Comparator<Employee> getFirstNameComparator()
    {
        return Comparator.comparing(Employee::getFirstName);
    }

    /**
     * Returns a comparator that compares employees based on middle initial.
     *
     * @return the comparator
     */
    public Comparator<Employee> getMiddleInitComparator()
    {
        return Comparator.comparingInt(Employee::getMiddleInit);
    }

    /**
     * Returns a comparator that compares employees based on last name.
     *
     * @return the comparator
     */
    public Comparator<Employee> getLastNameComparator()
    {
        return Comparator.comparing(Employee::getLastName);
    }

    /**
     * Returns a comparator that compares employees based on hire date.
     *
     * @return the comparator
     */
    public Comparator<Employee> getHireDateComparator()
    {
        return Comparator.comparing(Employee::getHireDate);
    }
}
