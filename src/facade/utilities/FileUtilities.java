package facade.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.*;

/**
 * A utilities class with methods that read and write to files.
 *
 * DO NOT EDIT THIS FILE!
 *
 * @author Josh Archer
 * @version 1.0
 */
public class FileUtilities
{
    /**
     * Returns a Scanner to read from a text file.
     *
     * @param path the path to the text file
     * @return a new Scanner
     * @throws FileNotFoundException thrown if there is an error reading from the file
     */
    public Scanner getFileReader(String path) throws FileNotFoundException
    {
        return new Scanner(new FileInputStream(path));
    }

    /**
     * Returns a PrintWriter to write to a text file.
     *
     * @param path the path to the text file
     * @param overwrite true if the writer will overwrite existing contents in the file, otherwise false
     * @return a new PrintWriter
     * @throws FileNotFoundException thrown if there is an error writing to the file
     */
    public PrintWriter getFileWriter(String path, boolean overwrite) throws FileNotFoundException
    {
        return new PrintWriter(new FileOutputStream(path, !overwrite));
    }

    /**
     * Returns an iterator over the lines of the text file.
     *
     * @param path the path of the file
     * @return a new iterator
     * @throws FileNotFoundException thrown if there is an error reading from the file
     */
    public Iterator<String> getFileIterator(String path) throws FileNotFoundException
    {
        Scanner reader = getFileReader(path);

        return new Iterator<>()
        {
            @Override
            public boolean hasNext()
            {
                return reader.hasNextLine();
            }

            @Override
            public String next()
            {
                return reader.nextLine();
            }
        };
    }

    /**
     * Returns the number of lines in the file. Note: This method reads through the
     * contents of the entire file to get the line count.
     *
     * @param path the path to the file
     * @return the line count
     * @throws FileNotFoundException thrown if there is an error reading from the file
     */
    public int linesInFile(String path) throws FileNotFoundException
    {
        Iterator<String> iterator = getFileIterator(path);
        int count = 0;
        while (iterator.hasNext())
        {
            iterator.next();
            count++;
        }
        return count;
    }

    /**
     * Returns the contents at the line specified in the file.
     *
     * @param path the path to the file
     * @param lineNumber the line number in the file
     * @return the contents of the line in the file
     * @throws FileNotFoundException thrown if there is an error reading from the file
     * @throws IllegalStateException if the line number is not found
     */
    public String getLineInFile(String path, int lineNumber) throws FileNotFoundException
    {
        Iterator<String> iterator = getFileIterator(path);
        int count = 0;
        while (iterator.hasNext())
        {
            String line = iterator.next();
            count++;

            if (count == lineNumber)
            {
                return line;
            }
        }
        throw new IllegalStateException("Line number not found");
    }

    /**
     * Reads the contents of a file, sorts them using the input Comparator
     * and then writes the output back to the file. Note: This will replace
     * the contents of the file with the new sorted contents.
     *
     * @param path the path of the file
     * @param sorter the comparator
     * @throws FileNotFoundException thrown if there is an error reading from the file
     */
    public void sortFile(String path, Comparator sorter) throws FileNotFoundException
    {
        Iterator<String> iterator = getFileIterator(path);
        List<String> lines = new ArrayList<>();
        while (iterator.hasNext())
        {
            lines.add(iterator.next());
        }
        Collections.sort(lines, sorter);
        writeToFile(path, lines.toArray(new String[0]), true);
    }

    /**
     * Writes several lines to a text file.
     *
     * @param path the path to the file
     * @param lines the lines to write
     * @param overwrite true if the file should be overwritten, otherwise false
     * @throws FileNotFoundException thrown if there is an error reading from the file
     */
    public void writeToFile(String path, String[] lines, boolean overwrite) throws FileNotFoundException
    {
        PrintWriter writer = getFileWriter(path, overwrite);

        for (String line : lines)
        {
            writer.println(line);
        }

        writer.close();
    }
}
