/**
 * Tests Candidate with an array.
 *
 * @author Paul Chafetz
 * @version 5/2/2019
 */
public class ElectionTesterV3
{
    //prints individual candidate data - unused in V3/V4
    public static void printVotes(Candidate[] list) {
        for (Candidate cand : list)
            System.out.println(cand);
    }

    //calculates total votes
    public static int getTotal(Candidate[] list) {
        int total = 0;
        for (Candidate cand : list)
            total += cand.getVotes();
        return total;
    }

    //prints results in a table
    public static void printTally(Candidate[] list)
    {
        double total = getTotal(list);
        System.out.printf("%-20s%-12s%1s%n", "Candidate", "Votes", "Percentage (%)");
        for (Candidate cand : list)
            System.out.printf("%-20s%-16d%1.2f%n", cand.getName(), cand.getVotes(), ((cand.getVotes() / total) * 100));
    }

    //changes candidate based on name
    public static void changeCandidate(Candidate[] list, String orig, String newName) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getName().equals(orig))
                list[i].setName(newName);
        }
    }

    //changes votes of a candidate based on name
    public static void changeVotes(Candidate[] list, String orig, int newVotes) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getName().equals(orig))
                list[i].setVotes(newVotes);
        }
    }

    //changes both the candidate and votes based on name
    public static void changeBoth(Candidate[] list, String orig, String newName, int newVotes) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getName().equals(orig)) {
                list[i].setName(newName);
                list[i].setVotes(newVotes);
            }
        }
    }

    public static void main(String[] args)
    {
        //creates 5 candidates in an array
        Candidate[] candidates = new Candidate[5];
        candidates[0] = new Candidate("Bill Smith", 35000);
        candidates[1] = new Candidate("James Phillips", 130000);
        candidates[2] = new Candidate("Rebecca Goldberg", 20000);
        candidates[3] = new Candidate("Robert Sheperdson", 15000);
        candidates[4] = new Candidate("Ana Thompson", 50000);

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
    }
}
