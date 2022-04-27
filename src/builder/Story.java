package builder;

import java.time.LocalDate;
import java.util.List;

/**
 * Represents a story with author, title and body.
 *
 * DO NOT EDIT THIS FILE!
 *
 * @author Josh Archer
 * @version 1.0
 */
public class Story
{
    private String author;
    private String title;
    private LocalDate releasedOn;
    private List<String> storyLines;

    /**
     * Creates a new story object
     * @param author the author of the story
     * @param title the title of the story
     * @param releasedOn the date the story released on
     * @param storyLines the lines of the story
     */
    public Story(String author, String title, LocalDate releasedOn,
                 List<String> storyLines)
    {
        this.author = author;
        this.title = title;
        this.releasedOn = releasedOn;
        this.storyLines = storyLines;
    }

    /**
     * Gets the author of the story
     * @return the author
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * Gets the title of the story
     * @return the title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Gets the release date of the story
     * @return the release date
     */
    public LocalDate getReleasedOn()
    {
        return releasedOn;
    }

    /**
     * Gets the lines of the story
     * @return the lines
     */
    public List<String> getStoryLines()
    {
        return storyLines;
    }

    @Override
    public String toString()
    {
        return "Story{" +
                "author='" + author + '\'' +
                ", releasedOn=" + releasedOn +
                ", storyLines=" + storyLines +
                '}';
    }
}
