package facade.testing;

import facade.employees.Employee;
import facade.employees.Facade;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class tests a Facade class for Employee objects
 * @author Jake Donaldson
 * @version 5/3/22
 */
public class TestFacade
{
    /**
     * runs tests on Facade to verify ease-of-use
     * @param args String[] representing any arguments passed into the Driver
     */
    public static void main(String[] args) {
        //initialize Facade and List
        Facade employeeFacade = new Facade();
        List<Employee> employees = new ArrayList<>();

        //Deserialize
        try
        {
            employees = employeeFacade.deserializeAll();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
            System.exit(0);
        }

        //Print out Employees
        for (Employee employee : employees)
        {
            System.out.println(employee);
            System.out.println();
        }

        //Compare two employees
        System.out.println(employeeFacade.compare(employees.get(0), employees.get(1)));

        //Serialize
        try
        {
            employeeFacade.serializeAll(employees);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Could not write to file.");
            System.exit(0);
        }
    }
}
