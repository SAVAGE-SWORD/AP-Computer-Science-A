/**
 * Tests the MusicV3 class and the searching algorithms.
 *
 * @author Paul Chafetz
 * @version 5/15/2019
 */
public class MusicTesterV3
{
    public static void print(MusicV3[] music)
    {
        System.out.printf("%11s%17s%13s%n", "Title", "Year", "Artist");
        for (MusicV3 m : music)
            System.out.println(m);
    }

    public static void mergerT(MusicV3[] music, int low, int mid, int high)
    {
        MusicV3[] temp = new MusicV3[high - low + 1];
        int i = low;
        int j = mid + 1;
        int index = 0;
        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[index] = music[j];
                j++;
            }
            else if (j > high) {
                temp[index] = music[i];
                i++;
            }
            else if (music[i].getTitle().compareTo(music[j].getTitle()) < 0) {
                temp[index] = music[i];
                i++;
            }
            else {
                temp[index] = music[j];
                j++;
            }
            index++;
        }
        for (int k = low; k <= high; k++)
            music[k] = temp[k - low];
    }

    public static void mergerY(MusicV3[] music, int low, int mid, int high)
    {
        MusicV3[] temp = new MusicV3[high - low + 1];
        int i = low;
        int j = mid + 1;
        int index = 0;
        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[index] = music[j];
                j++;
            }
            else if (j > high) {
                temp[index] = music[i];
                i++;
            }
            else if (music[i].getYear() < music[j].getYear()) {
                temp[index] = music[i];
                i++;
            }
            else {
                temp[index] = music[j];
                j++;
            }
            index++;
        }
        for (int k = low; k <= high; k++)
            music[k] = temp[k - low];
    }

    public static void mergerA(MusicV3[] music, int low, int mid, int high)
    {
        MusicV3[] temp = new MusicV3[high - low + 1];
        int i = low;
        int j = mid + 1;
        int index = 0;
        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[index] = music[j];
                j++;
            }
            else if (j > high) {
                temp[index] = music[i];
                i++;
            }
            else if (music[i].getArtist().compareTo(music[j].getArtist()) < 0) {
                temp[index] = music[i];
                i++;
            }
            else {
                temp[index] = music[j];
                j++;
            }
            index++;
        }
        for (int k = low; k <= high; k++)
            music[k] = temp[k - low];
    }

    public static void mergeTitle(MusicV3[] music, int low, int high) {
        if (low == high)
            return;
        int mid = (low + high)/ 2;
        mergeTitle(music, low, mid);
        mergeTitle(music, mid + 1, high);
        mergerT(music, low, mid, high);
    }

    public static void mergeYear(MusicV3[] music, int low, int high) {
        if (low == high)
            return;
        int mid = (low + high)/ 2;
        mergeYear(music, low, mid);
        mergeYear(music, mid + 1, high);
        mergerY(music, low, mid, high);
    }

    public static void mergeArtist(MusicV3[] music, int low, int high) {
        if (low == high)
            return;
        int mid = (low + high)/ 2;
        mergeArtist(music, low, mid);
        mergeArtist(music, mid + 1, high);
        mergerA(music, low, mid, high);
    }

    public static int findTitle(MusicV3[] music, String title)
    {
        int high = music.length;
        int low = -1;
        int mid;
        while (high - low > 1) {
            mid = (low + high) / 2;
            if (music[mid].getTitle().compareTo(title) > 0)
                high = mid;
            else
                low = mid;
        }
        if (music[low].getTitle().compareTo(title) == 0 && low >= 0)
            return low;
        else
            return -1; 
    }

    public static void findYear(MusicV3[] music, int year)
    {
        int high = music.length;
        int low = -1;
        int mid;
        while (high - low > 1) {
            mid = (low + high) / 2;
            if (music[mid].getYear() > year)
                high = mid;
            else {
                low = mid;
                if (music[mid].getYear() == year)
                    break;
                }
        }
        if (music[low].getYear() == year && low >= 0)
            linearYear(music, low, year);
            
        else
            System.out.println("\nError: No songs from that year!");
    }

    public static void findArtist(MusicV3[] music, String artist)
    {
        int high = music.length;
        int low = -1;
        int mid;
        while (high - low > 1) {
            mid = (low + high) / 2;
            if (music[mid].getArtist().compareTo(artist) > 0)
                high = mid;
            else {
                low = mid;
                if (music[mid].getArtist().compareTo(artist) == 0)
                    break;
                }
        }
        if( music[low].getArtist().compareTo(artist) == 0 && low >= 0)
            linearArtist(music, low, artist);
        else
            System.out.println("\nError: No songs by that artist!");
    }
    
    public static void linearYear(MusicV3[] music, int low, int year)
    {
        int i, start = low, end = low;
        i = low - 1;
        while (i >= 0 && music[i].getYear() == year) {
            start = i;
            i--;
        }
        i = low + 1;
        while (i < music.length && music[i].getYear() == year) {
            end = i;
            i++;
        }
        for (i = start; i <= end; i++)
            System.out.println(music[i]);
    }
    
    public static void linearArtist(MusicV3[] music, int low, String artist)
    {
        int i, start = low, end = low;
        i = low - 1;
        while (i >= 0 && music[i].getArtist().compareTo(artist) == 0) {
            start = i;
            i--;
        }
        i = low + 1;
        while (i < music.length && music[i].getArtist().compareTo(artist) == 0) {
            end = i;
            i++;
        }
        for (i = start; i <= end; i++)
            System.out.println(music[i]);
    }
    
    public static void main(String[] args)
    {
        MusicV3[] music = {
                new MusicV3("Like a Rolling Stone", 1965, "Bob Dylan"),
                new MusicV3("Satisfaction", 1965, "The Rolling Stones"),
                new MusicV3("Imagine", 1971, "John Lennon"),
                new MusicV3("What's Going On", 1971, "Marvin Gaye"),
                new MusicV3("Respect", 1967, "Arethra Franklin"),
                new MusicV3("Good Vibrations", 1966, "The Beach Boys"),
                new MusicV3("Johnny B. Goode", 1958, "Chuck Berry"),
                new MusicV3("Hey Jude", 1968, "The Beatles"),
                new MusicV3("A Day in the Life", 1967, "The Beatles"),
                new MusicV3("What'd I Say", 1959, "Ray Charles")};

        int value;

        System.out.println("\n\tMusic List:\n");
        print(music);

        System.out.println("\n\n\tMerge sorting titles and searching for song \"Satisfaction\"\n");
        mergeTitle(music, 0, music.length - 1);
        //print(music);
        value = findTitle(music, "Satisfaction");
        if (value == -1)
            System.out.println("Error: Song not found!");
        else
            System.out.println(music[value]);

        System.out.println("\n\n\tMerge sorting titles and searching for song \"Cherry Bomb\"\n");
        mergeTitle(music, 0, music.length - 1);
        //print(music);
        value = findTitle(music, "Cherry Bomb");
        if (value == -1)
            System.out.println("Error: Song not found!");
        else
            System.out.println(music[value]);

        System.out.println("\n\n\tMerge sorting years and searching for songs released in 1971\n");
        mergeYear(music, 0, music.length - 1);
        //print(music);
        findYear(music, 1971);

        System.out.println("\n\n\tMerge sorting years and searching for songs released in 2001\n");
        mergeYear(music, 0, music.length - 1);
        //print(music);
        findYear(music, 2001);

        System.out.println("\n\n\tMerge sorting artists and searching for artist \"The Beatles\"\n");
        mergeArtist(music, 0, music.length - 1);
        //print(music);
        findArtist(music, "The Beatles");

        System.out.println("\n\n\tMerge sorting artists and searching for artist \"Metallica\"\n");
        mergeArtist(music, 0, music.length - 1);
        //print(music);
        findArtist(music, "Metallica");
    }
}
