package strategy.driver;

import strategy.strategy.*;

/**
 * This class is designed to test SortAndSearchElectricBoogaloo objects
 * @author Jake Donaldson
 * @version 5/4/22
 */
public class TestStrategyPattern
{
    /**
     * runs tests on SortAndSearchElectricBoogaloo objects with a test array
     * @param args String[] representing any arguments passed into the Driver
     */
    public static void main(String[] args) {
        String[] array = {"The", "Quick", "Brown", "Fox", "Jumps", "Over", "The", "Lazy", "Dog"};

        SortAndSearchElectricBoogaloo<String> searchSort =
                new SortAndSearchElectricBoogaloo<String>(new SelectionMethods<>(),
                        new KthSmallestElementMethods<>(2));
        System.out.println("SelectionSort + KthSmallestSearch (posK=2): " + searchSort.find(array));

        searchSort =
                new SortAndSearchElectricBoogaloo<String>(new InsertionMethods<>(),
                        new FindSmallestMethods<>());
        System.out.println("InsertionSort + FindSmallest: " + searchSort.find(array));

        searchSort =
                new SortAndSearchElectricBoogaloo<>(new BubbleMethods<>(),
                        new BinaryMethods<>("Dog"));
        System.out.println("BubbleSort + BinarySearch: " + searchSort.find(array));
    }

}
