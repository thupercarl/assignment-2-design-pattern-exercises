package strategy.driver;

import strategy.strategy.*;

public class TestStrategyPattern
{
    public static void main(String[] args) {
        String[] array = {"The", "Quick", "Brown", "Fox", "Jumps", "Over", "The", "Lazy", "Dog"};

        SortAndSearchElectricBoogaloo<String> searchSort =
                new SortAndSearchElectricBoogaloo<String>(new SelectionMethods<>(),
                        new KthSmallestElementMethods<>(2));
        System.out.println(searchSort.find(array));

        searchSort =
                new SortAndSearchElectricBoogaloo<String>(new InsertionMethods<>(),
                        new FindSmallestMethods<>());
        System.out.println(searchSort.find(array));

        searchSort =
                new SortAndSearchElectricBoogaloo<String>(new BubbleMethods<>(),
                        new BinaryMethods<>("Dog"));
        System.out.println(searchSort.find(array));
    }

}
