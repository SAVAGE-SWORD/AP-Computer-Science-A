/**
 * Tests Candidate with an ArrayList.
 *
 * @author Paul Chafetz
 * @version 5/2/2019
 */
import java.util.*;
public class ElectionTesterV2
{
    //prints individual candidate data
    public static void printVotes(List<Candidate> list) {
         for (Candidate cand : list)
            System.out.println(cand);
    }

    //calculates total votes
    public static int getTotal(List<Candidate> list) {
        int total = 0;
        for (Candidate cand : list)
            total += cand.getVotes();
        return total;
    }

    //prints results in a table
    public static void printTally(List<Candidate> list)
    {
        double total = getTotal(list);
        System.out.printf("%-20s%-12s%1s%n", "Candidate", "Votes", "Percentage (%)");
        for (Candidate cand : list)
            System.out.printf("%-20s%-16d%1.2f%n", cand.getName(), cand.getVotes(), ((cand.getVotes() / total) * 100));
    }

    public static void main(String[] args)
    {
        //creates 5 candidates in an ArrayList
        List<Candidate> candidates = new ArrayList<Candidate>();
        candidates.add(new Candidate("Bill Smith", 35000));
        candidates.add(new Candidate("James Phillips", 130000));
        candidates.add(new Candidate("Rebecca Goldberg", 20000));
        candidates.add(new Candidate("Robert Sheperdson", 15000));
        candidates.add(new Candidate("Ana Thompson", 50000));

        //prints individual results and the table
        System.out.println("Individual Candidate Data:\n");
        printVotes(candidates);
        System.out.println("\nElection Results:\n");
        printTally(candidates);
        System.out.println("\nTotal votes in election: " + getTotal(candidates));
    }
}
