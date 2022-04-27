package builder;

import java.time.LocalDate;

/**
 * Driver class that can test Story and StoryBuilder objects
 * @author Jake Donaldson
 * @version 4/27/22
 */
public class TestStoryBuilder
{
    /**
     * runs tests on both Story and StoryBuilder objects
     * @param args String[] representing any arguments passed into the Driver
     */
    public static void main(String[] args)
    {
        //create a StoryBuilder object
        StoryBuilder buildMyStory = new StoryBuilder()
                .addStoryLine("Once upon a time")
                .setAuthor("Me")
                .setReleasedOn(LocalDate.now())
                .setTitle("My Story")
                .addStoryLine("I wrote some code")
                .addStoryLine("The end");
        //Create a Story object
        Story myStory = buildMyStory.build();

        //Test StoryBuilder and Story objects
        System.out.println("StoryBuilder");
        System.out.println();
        System.out.println(buildMyStory);
        System.out.println();
        System.out.println("Story");
        System.out.println();
        System.out.println(myStory);

        //Create an empty StoryBuilder object
        StoryBuilder emptyStoryBuilder = new StoryBuilder();
        //Create an empty Story object
        Story emptyStory = emptyStoryBuilder.blank();

        //Test the empty Story object
        System.out.println("Empty Story");
        System.out.println();
        System.out.println(emptyStory);
    }
}
