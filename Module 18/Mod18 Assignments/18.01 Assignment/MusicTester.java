/**
 * Tests the Music class and the searching algorithms.
 *
 * @author Paul Chafetz
 * @version 5/14/2019
 */
public class MusicTester
{
    public static void print(Music[] music)
    {
        System.out.printf("%11s%17s%13s%n", "Title", "Year", "Artist");
        for (Music m : music)
            System.out.println(m);
    }

    public static void findTitle(Music[] music, String title)
    {
        int loc = -1;
        for (int i = 0; i < music.length; i++)
            if (music[i].getTitle().compareTo(title) == 0) {
                loc = i;
                break;
            }
        if (loc != -1)
            System.out.println(music[loc]);
        else
            System.out.println("There are no songs by the title \"" + title + "\".");
    }

    public static void findYear(Music[] music, int year)
    {
        int loc = -1;
        for (int i = 0; i < music.length; i++) {
            if (music[i].getYear() == year) {
                loc++;
                System.out.println(music[i]);
            }
        }
        if (loc == -1)
            System.out.println("There are no songs released in " + year + "." );
    }

    public static void findArtist(Music[] music, String artist)
    {
        int loc = -1;
        for (int i = 0; i < music.length; i++) {
            if (music[i].getArtist().compareTo(artist) == 0) {
                loc++;
                System.out.println(music[i]);
            }
        }
        if (loc == -1)
            System.out.println("There are no songs by " + artist + ".");
    }

    public static void main(String[] args)
    {
        Music[] music = {
                new Music("Like a Rolling Stone", 1965, "Bob Dylan"),
                new Music("Satisfaction", 1965, "The Rolling Stones"),
                new Music("Imagine", 1971, "John Lennon"),
                new Music("What's Going On", 1971, "Marvin Gaye"),
                new Music("Respect", 1967, "Arethra Franklin"),
                new Music("Good Vibrations", 1966, "The Beach Boys"),
                new Music("Johnny B. Goode", 1958, "Chuck Berry"),
                new Music("Hey Jude", 1968, "The Beatles"),
                new Music("A Day in the Life", 1967, "The Beatles"),
                new Music("What'd I Say", 1959, "Ray Charles")};

        System.out.println("\n\tMusic List:\n");
        print(music);

        System.out.println("\n\n\tSearching for song \"Respect\"\n");
        findTitle(music, "Respect");

        System.out.println("\n\n\tSearching for song \"Party Rock Anthem\"\n");
        findTitle(music, "Party Rock Anthem");

        System.out.println("\n\n\tSearching for songs released in 1971\n");
        findYear(music, 1971);

        System.out.println("\n\n\tSearching for songs released in 2001\n");
        findYear(music, 2001);

        System.out.println("\n\n\tSearching for artist \"The Beatles\"\n");
        findArtist(music, "The Beatles");

        System.out.println("\n\n\tSearching for artist \"King Crimson\"\n");
        findArtist(music, "King Crimson");
    }
}
