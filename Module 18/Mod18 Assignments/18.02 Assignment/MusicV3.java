/**
 * To create songs and search based on different criteria.
 *
 * @author Paul Chafetz
 * @version 5/15/2019
 */
public class MusicV3
{
    // instance variables
    private int year;
    private String title;
    private String artist;

    // Constructor for objects of class Music
    public MusicV3(String t, int y, String a)
    {
        // initialize instance variables
        title = t;
        year = y;
        artist = a;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String t)
    {
        title = t;
    }

    public String getArtist()
    {
        return artist;
    }

    public void setArtist(String a)
    {
        artist = a;
    }

    public int getYear()
    {
        return year;
    }

    public void setTitle(int y)
    {
        year = y;
    }

    public String toString()
    {
        String str = String.format( "%-24s%4d     %-20s ", title,  year , artist);
        return str;
    }
}
