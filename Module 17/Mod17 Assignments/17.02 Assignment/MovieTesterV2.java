/**
 * Tester class for MovieV2
 *
 * @author Paul Chafetz
 * @version 5/7/2019
 */
public class MovieTesterV2
{
    public static void print(MovieV2[] movies)
    {
        for (MovieV2 movie : movies)
            System.out.println(movie);
    }

    public static MovieV2[] sortTitle(MovieV2[] movies, int sortOrder)
    {
        MovieV2[] sorted = new MovieV2[movies.length];
        if (sortOrder == 1) {
            for (int i = 0; i < movies.length; i++) {
                int index = 0, k = i;
                while (k > 0 && index == 0) {
                    if (movies[i].getTitle().compareTo(sorted[k - 1].getTitle()) > 0)
                        index = k;
                    else
                        sorted[k] = sorted[k - 1];
                    k--;    
                }
                sorted[index] = movies[i];
            }
            return sorted;
        }
        //the only difference between ascending and descending is the conditional operator: > for ascending and < for descending
        else if (sortOrder == 2) {
            for (int i = 0; i < movies.length; i++) {
                int index = 0, k = i;
                while (k > 0 && index == 0) {
                    if (movies[i].getTitle().compareTo(sorted[k - 1].getTitle()) < 0)
                        index = k;
                    else
                        sorted[k] = sorted[k - 1];
                    k--;    
                }
                sorted[index] = movies[i];
            }
            return sorted;
        }
        else {
            System.out.println("Error. Not a sort order code. (1 or 2)");
            return sorted;
        }
    }

    public static MovieV2[] sortYear(MovieV2[] movies, int sortOrder)
    {
        MovieV2[] sorted = new MovieV2[movies.length];
        if (sortOrder == 1) {
            for (int i = 0; i < movies.length; i++) {
                int index = 0, k = i;
                while (k > 0 && index == 0) {
                    if (movies[i].getYear() > sorted[k - 1].getYear())
                        index = k;
                    else
                        sorted[k] = sorted[k - 1];
                    k--;    
                }
                sorted[index] = movies[i];
            }
            return sorted;
        }
        //the only difference between ascending and descending is the conditional operator: > for ascending and < for descending
        else if (sortOrder == 2) {
            for (int i = 0; i < movies.length; i++) {
                int index = 0, k = i;
                while (k > 0 && index == 0) {
                    if (movies[i].getYear() < sorted[k - 1].getYear())
                        index = k;
                    else
                        sorted[k] = sorted[k - 1];
                    k--;    
                }
                sorted[index] = movies[i];
            }
            return sorted;
        }
        else {
            System.out.println("Error. Not a sort order code. (1 or 2)");
            return sorted;
        }
    }

    public static MovieV2[] sortStudio(MovieV2[] movies, int sortOrder)
    {
        MovieV2[] sorted = new MovieV2[movies.length];
        if (sortOrder == 1) {
            for (int i = 0; i < movies.length; i++) {
                int index = 0, k = i;
                while (k > 0 && index == 0) {
                    if (movies[i].getStudio().compareTo(sorted[k - 1].getStudio()) > 0)
                        index = k;
                    else
                        sorted[k] = sorted[k - 1];
                    k--;    
                }
                sorted[index] = movies[i];
            }
            return sorted;
        }
        //the only difference between ascending and descending is the conditional operator: > for ascending and < for descending
        else if (sortOrder == 2) {
            for (int i = 0; i < movies.length; i++) {
                int index = 0, k = i;
                while (k > 0 && index == 0) {
                    if (movies[i].getStudio().compareTo(sorted[k - 1].getStudio()) < 0)
                        index = k;
                    else
                        sorted[k] = sorted[k - 1];
                    k--;    
                }
                sorted[index] = movies[i];
            }
            return sorted;
        }
        else {
            System.out.println("Error. Not a sort order code. (1 or 2)");
            return sorted;
        }
    }

    public static void main(String[] args)
    {
        //I just used the top 10 grossing movies worldwide
        MovieV2[] movies = {  
                new MovieV2("Avatar", 2009, "Lightstorm Entertainment"), 
                new MovieV2("Titanic", 1997, "Lightstorm Entertainment"),
                new MovieV2("Star Wars: Episode VII", 2015, "Luscasfilm Ltd."), 
                new MovieV2("Avengers: Infinity War", 2018, "Marvel Studios"), 
                new MovieV2("Jurassic World", 2015, "Amblin Entertainment"), 
                new MovieV2("Marvel's The Avengers", 2012, "Marvel Studios"),
                new MovieV2("Furious 7", 2015, "One Race Films"), 
                new MovieV2("Avengers: Age of Ultron", 2015, "Marvel Studios"),
                new MovieV2("Black Panther", 2018, "Marvel Studios"), 
                new MovieV2("Harry Potte/Deathly Hallows 2", 2011, "Warner Bros. Pictures")};
        MovieV2[] sorted = new MovieV2[movies.length];

        System.out.println("\nOriginal Movie List\n");
        print(movies);

        System.out.println("\nAscending by Title\n");
        sorted = sortTitle(movies, 1);
        print(sorted);

        System.out.println("\nDescending by Title\n");
        sorted = sortTitle(movies, 2);
        print(sorted);

        System.out.println("\nAscending by Year\n");
        sorted = sortYear(movies, 1);
        print(sorted);

        System.out.println("\nDescending by Year\n");
        sorted = sortYear(movies, 2);
        print(sorted);

        System.out.println("\nAscending by Studio\n");
        sorted = sortStudio(movies, 1);
        print(sorted);

        System.out.println("\nDescending by Studio\n");
        sorted = sortStudio(movies, 2);
        print(sorted);
    }
}
