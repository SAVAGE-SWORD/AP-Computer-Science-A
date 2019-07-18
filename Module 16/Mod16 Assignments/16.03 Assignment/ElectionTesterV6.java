/**
 * Tests Candidate with an ArrayList.
 *
 * @author Paul Chafetz
 * @version 5/3/2019
 */
import java.util.*;
public class ElectionTesterV6
{
    //prints individual candidate data - unused after V3/V4
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

    //changes candidate based on name
    public static void changeCandidate(List<Candidate> list, String orig, String newName) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(orig))
                list.get(i).setName(newName);
        }
    }

    //changes votes of a candidate based on name
    public static void changeVotes(List<Candidate> list, String orig, int newVotes) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(orig))
                list.get(i).setVotes(newVotes);
        }
    }

    //changes both the candidate and votes based on name
    public static void changeBoth(List<Candidate> list, String orig, String newName, int newVotes) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(orig)) {
                list.get(i).setName(newName);
                list.get(i).setVotes(newVotes);
            }
        }
    }
    
    //inserts candidate based on position
    public static void insertPos(List<Candidate> list, int loc, String newName, int newVotes) {
        list.add(loc, new Candidate(newName, newVotes)); 
    }
    
    //inserts candidate based on name
    public static void insertCand(List<Candidate> list, String orig, String newName, int newVotes) {
        int loc = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(orig))
                loc = i;
        }
        list.add(loc, new Candidate(newName, newVotes));
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

        System.out.println("\nOriginal Election Results:\n");
        printTally(candidates);
        System.out.println("Total votes in election: " + getTotal(candidates));

        //replaces candidate
        System.out.println("\nReplacing James Phillips with Gary McConnel\n");
        changeCandidate(candidates, "James Phillips", "Gary McConnel");
        printTally(candidates);
        System.out.println("Total votes in election: " + getTotal(candidates));

        //replaces votes
        System.out.println("\nReplacing Ana Thompson's vote with 60000\n");
        changeVotes(candidates, "Ana Thompson", 60000);
        printTally(candidates);
        System.out.println("Total votes in election: " + getTotal(candidates));
        
        //replaces candidate and votes
        System.out.println("\nReplacing Robert Sheperdson with Camilla Waters at 5000 votes\n");
        changeBoth(candidates, "Robert Sheperdson", "Camilla Waters", 5000);
        printTally(candidates);
        System.out.println("Total votes in election: " + getTotal(candidates));
    
        //inserts candidate at position
        System.out.println("\nInserting Johnny Gatts with 35000 votes at position 2\n");
        insertPos(candidates, 2, "Johnny Gatts", 35000);
        printTally(candidates);
        System.out.println("Total votes in election: " + getTotal(candidates));
        
        //inserts candidate by name
        System.out.println("\nInserting Jessica Katz with 30000 votes before Bill Smith\n");
        insertCand(candidates, "Bill Smith", "Jessica Katz", 30000);
        printTally(candidates);
        System.out.println("Total votes in election: " + getTotal(candidates));
    }
}
