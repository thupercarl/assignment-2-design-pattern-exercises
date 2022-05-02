package facade.employees;

import facade.utilities.FileUtilities;
import facade.utilities.RecordsUtilities;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Facade
{
    public Facade()
    {
        //do nothing
    }

    public List<Employee> deserializeAll() throws FileNotFoundException
    {
        Scanner read = new FileUtilities().getFileReader("PATH TBD");
        List<Employee> deserializedList = new ArrayList<>();
        RecordsUtilities utilities = new RecordsUtilities();
        while(read.hasNext())
        {
            deserializedList.add(utilities.deserialize(read.next()));
        }

        return deserializedList;
    }

    public String compare()
    {
        return null;
    }
}
