package facade.testing;

import facade.employees.Employee;
import facade.employees.Facade;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TestFacade
{
    public static void main(String[] args) {
        Facade employeeFacade = new Facade();
        List<Employee> employees = new ArrayList<>();

        try
        {
            employees = employeeFacade.deserializeAll();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
            System.exit(0);
        }

        for (Employee employee : employees)
        {
            System.out.println(employee);
            System.out.println();
        }


        System.out.println(employeeFacade.compare(employees.get(0), employees.get(1)));

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
