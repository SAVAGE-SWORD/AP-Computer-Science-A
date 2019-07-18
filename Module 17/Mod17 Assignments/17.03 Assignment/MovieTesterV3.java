/**
 * Tester class for MovieV3
 *
 * @author Paul Chafetz
 * @version 5/12/2019
 */
public class MovieTesterV3
{
    public static void print(MovieV3[] movies)
    {
        for (MovieV3 movie : movies)
            System.out.println(movie);
    }

    public static void sortTitle(MovieV3[] movies, int sortOrder)
    {
        if (sortOrder == 1) {
            int max;
            MovieV3 temp;
            for (int i = movies.length - 1; i > 0; i--) {
                max = 0;
                for (int k = 1; k <= i; k++) {
                    if (movies[k].getTitle().compareTo(movies[max].getTitle()) > 0)
                        max = k;
                }
                temp = movies[i];
                movies[i] = movies[max];
                movies[max] = temp;
            }
        }
        //the only difference between ascending and descending is the conditional operator: > for ascending and < for descending
        else if (sortOrder == 2) {
            int max;
            MovieV3 temp;
            for (int i = movies.length - 1; i > 0; i--) {
                max = 0;
                for (int k = 1; k <= i; k++) {
                    if (movies[k].getTitle().compareTo(movies[max].getTitle()) < 0)
                        max = k;
                }
                temp = movies[i];
                movies[i] = movies[max];
                movies[max] = temp;
            }
        }
        else
            System.out.println("Error. Not a sort order code. (1 or 2)");
    }

    public static void sortYear(MovieV3[] movies, int sortOrder)
    {
        if (sortOrder == 1) {
            int max;
            MovieV3 temp;
            for (int i = movies.length - 1; i > 0; i--) {
                max = 0;
                for (int k = 1; k <= i; k++) {
                    if (movies[k].getYear() > movies[max].getYear())
                        max = k;  
                }
                temp = movies[i];
                movies[i] = movies[max];
                movies[max] = temp;
            }
        }
        //the only difference between ascending and descending is the conditional operator: > for ascending and < for descending
        else if (sortOrder == 2) {
            int max;
            MovieV3 temp;
            for (int i = movies.length - 1; i > 0; i--) {
                max = 0;
                for (int k = 1; k <= i; k++) {
                    if (movies[k].getYear() < movies[max].getYear())
                        max = k;  
                }
                temp = movies[i];
                movies[i] = movies[max];
                movies[max] = temp;
            }
        }
        else
            System.out.println("Error. Not a sort order code. (1 or 2)");
    }

    public static void sortStudio(MovieV3[] movies, int sortOrder)
    {
        if (sortOrder == 1) {
            int max;
            MovieV3 temp;
            for (int i = movies.length - 1; i > 0; i--) {
                max = 0;
                for (int k = 1; k <= i; k++) {
                    if (movies[k].getStudio().compareTo(movies[max].getStudio()) > 0)
                        max = k;
                }
                temp = movies[i];
                movies[i] = movies[max];
                movies[max] = temp;
            }
        }
        //the only difference between ascending and descending is the conditional operator: > for ascending and < for descending
        else if (sortOrder == 2) {
            int max;
            MovieV3 temp;
            for (int i = movies.length - 1; i > 0; i--) {
                max = 0;
                for (int k = 1; k <= i; k++) {
                    if (movies[k].getStudio().compareTo(movies[max].getStudio()) < 0)
                        max = k;
                }
                temp = movies[i];
                movies[i] = movies[max];
                movies[max] = temp;
            }
        }
        else
            System.out.println("Error. Not a sort order code. (1 or 2)");
    }

    public static void main(String[] args)
    {
        //I just used the top 10 grossing movies worldwide
        MovieV3[] movies = {  
                new MovieV3("Avatar", 2009, "Lightstorm Entertainment"), 
                new MovieV3("Titanic", 1997, "Lightstorm Entertainment"),
                new MovieV3("Star Wars: Episode VII", 2015, "Luscasfilm Ltd."), 
                new MovieV3("Avengers: Infinity War", 2018, "Marvel Studios"), 
                new MovieV3("Jurassic World", 2015, "Amblin Entertainment"), 
                new MovieV3("Marvel's The Avengers", 2012, "Marvel Studios"),
                new MovieV3("Furious 7", 2015, "One Race Films"), 
                new MovieV3("Avengers: Age of Ultron", 2015, "Marvel Studios"),
                new MovieV3("Black Panther", 2018, "Marvel Studios"), 
                new MovieV3("Harry Potte/Deathly Hallows 2", 2011, "Warner Bros. Pictures")};

        System.out.println("\nOriginal Movie List\n");
        print(movies);

        System.out.println("\nAscending by Title\n");
        sortTitle(movies, 1);
        print(movies);

        System.out.println("\nDescending by Title\n");
        sortTitle(movies, 2);
        print(movies);

        System.out.println("\nAscending by Year\n");
        sortYear(movies, 1);
        print(movies);

        System.out.println("\nDescending by Year\n");
        sortYear(movies, 2);
        print(movies);

        System.out.println("\nAscending by Studio\n");
        sortStudio(movies, 1);
        print(movies);

        System.out.println("\nDescending by Studio\n");
        sortStudio(movies, 2);
        print(movies);
    }
}
