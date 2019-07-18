/**
 * Tester class for MovieV4
 *
 * @author Paul Chafetz
 * @version 5/12/2019
 */
public class MovieTesterV4
{
    public static void print(MovieV4[] movies)
    {
        for (MovieV4 movie : movies)
            System.out.println(movie);
    }

    //these methods merge the subarrays
    //the code only differs in the 2nd else if statement (to compare)
    public static void mergeTitle(MovieV4[] movies, int low, int mid, int high)
    {
        MovieV4[] temp = new MovieV4[high - low + 1];
        int i = low, index = 0, j = mid + 1;
        //in theory, low and high should be 0 and movies.length - 1, always
        //but the instructions want a low and high parameter for the method

        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[index] = movies[j];
                j++;
            }
            else if (j > high) {
                temp[index] = movies[i];
                i++;
            }
            else if (movies[i].getTitle().compareTo(movies[j].getTitle()) < 0) {
                temp[index] = movies[i];
                i++;
            }
            else {
                temp[index] = movies[j];
                j++;
            }
            index++;
        }
        for (int k = low; k <= high; k++)
            movies[k] = temp[k - low];
    }

    public static void mergeYear(MovieV4[] movies, int low, int mid, int high)
    {
        MovieV4[] temp = new MovieV4[high - low + 1];
        int i = low, index = 0, j = mid + 1;

        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[index] = movies[j];
                j++;
            }
            else if (j > high) {
                temp[index] = movies[i];
                i++;
            }
            else if (movies[i].getYear() < movies[j].getYear()) {
                temp[index] = movies[i];
                i++;
            }
            else {
                temp[index] = movies[j];
                j++;
            }
            index++;
        }
        for (int k = low; k <= high; k++)
            movies[k] = temp[k - low];
    }

    public static void mergeStudio(MovieV4[] movies, int low, int mid, int high)
    {
        MovieV4[] temp = new MovieV4[high - low + 1];
        int i = low, index = 0, j = mid + 1;
        //in theory, low and high should be 0 and movies.length - 1, always
        //but the instructions want a low and high parameter for the method

        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[index] = movies[j];
                j++;
            }
            else if (j > high) {
                temp[index] = movies[i];
                i++;
            }
            else if (movies[i].getStudio().compareTo(movies[j].getStudio()) < 0) {
                temp[index] = movies[i];
                i++;
            }
            else {
                temp[index] = movies[j];
                j++;
            }
            index++;
        }
        for (int k = low; k <= high; k++)
            movies[k] = temp[k - low];
    }

    //these methods sort the subarrays and then merge them
    public static void sortTitle(MovieV4[] movies, int low, int high)
    {
        if (low == high)
            return;
        int mid = (low + high) / 2;    
        sortTitle(movies, low, mid);
        sortTitle(movies, mid + 1, high);
        mergeTitle(movies, low, mid, high);
    }

    public static void sortYear(MovieV4[] movies, int low, int high)
    {
        if (low == high)
            return;
        int mid = (low + high) / 2;    
        sortYear(movies, low, mid);
        sortYear(movies, mid + 1, high);
        mergeYear(movies, low, mid, high);
    }

    public static void sortStudio(MovieV4[] movies, int low, int high)
    {
        if (low == high)
            return;
        int mid = (low + high) / 2;    
        sortStudio(movies, low, mid);
        sortStudio(movies, mid + 1, high);
        mergeStudio(movies, low, mid, high);
    }

    public static void main(String[] args)
    {
        //I just used the top 10 grossing movies worldwide
        MovieV4[] movies = {  
                new MovieV4("Avatar", 2009, "Lightstorm Entertainment"), 
                new MovieV4("Titanic", 1997, "Lightstorm Entertainment"),
                new MovieV4("Star Wars: Episode VII", 2015, "Luscasfilm Ltd."), 
                new MovieV4("Avengers: Infinity War", 2018, "Marvel Studios"), 
                new MovieV4("Jurassic World", 2015, "Amblin Entertainment"), 
                new MovieV4("Marvel's The Avengers", 2012, "Marvel Studios"),
                new MovieV4("Furious 7", 2015, "One Race Films"), 
                new MovieV4("Avengers: Age of Ultron", 2015, "Marvel Studios"),
                new MovieV4("Black Panther", 2018, "Marvel Studios"), 
                new MovieV4("Harry Potte/Deathly Hallows 2", 2011, "Warner Bros. Pictures")};

        System.out.println("\nOriginal Movie List\n");
        print(movies);

        System.out.println("\nAscending by Title\n");
        sortTitle(movies, 0, movies.length - 1);
        print(movies);

        System.out.println("\nAscending by Year\n");
        sortYear(movies, 0, movies.length - 1);
        print(movies);

        System.out.println("\nAscending by Studio\n");
        sortStudio(movies, 0, movies.length - 1);
        print(movies);
    }
}
