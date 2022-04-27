package builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Builder class that can construct a Story object
 * @author Jake Donaldson
 * @version 4/27/22
 */
public class StoryBuilder
{
    private String author;
    private String title;
    private LocalDate releasedOn;
    private List<String> storyLines;

    /**
     * Constructs a StoryBuilder object
     */
    public StoryBuilder()
    {
        //do nothing
    }

    /**
     * assigns the author field of a StoryBuilder object
     * @param author String representing the author of a Story object
     * @return StoryBuilder object to be used later
     */
    public StoryBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * assigns the title field of a StoryBuilder object
     * @param title String representing the title of a Story object
     * @return StoryBuilder object to be used later
     */
    public StoryBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * assigns the release date field of a StoryBuilder object
     * @param releasedOn LocalDate representing the release date of a Story object
     * @return StoryBuilder object to be used later
     */
    public StoryBuilder setReleasedOn(LocalDate releasedOn) {
        this.releasedOn = releasedOn;
        return this;
    }

    /**
     * creates and/or adds a line of text to the storyLine field of a StoryBuilder object
     * @param text String representing a line of text in a Story object
     * @return StoryBuilder object to be used later
     */
    public StoryBuilder addStoryLine(String text)
    {
        //lazy initialization pattern
        if(this.storyLines == null) { this.storyLines = new ArrayList<>(); }

        storyLines.add(text);
        return this;
    }

    /**
     * builds a Story object
     * @return completed Story object
     */
    public Story build()
    {
        return new Story(author, title, releasedOn, storyLines);
    }

    /**
     * builds an empty Story object
     * @return completed Story object
     */
    public Story blank()
    {
        return new Story("_____", "_____", LocalDate.now(), new ArrayList<>());
    }

    @Override
    public String toString()
    {
        StringBuilder story = new StringBuilder();
        story.append("Author: ")
                .append(author)
                .append("\r\n")
                .append("Title: ")
                .append(title)
                .append("\r\n")
                .append("Released: ")
                .append(releasedOn)
                .append("\r\n")
                .append("********************")
                .append("\r\n");
        if(storyLines != null)
        {
            for (String text : storyLines)
            {
                story.append(text).append("\r\n");
            }
        }

        story.append("********************");
        return story.toString();
    }
}
