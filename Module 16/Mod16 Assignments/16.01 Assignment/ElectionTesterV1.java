/**
 * Tests Candidate with an array.
 *
 * @author Paul Chafetz
 * @version 5/2/2019
 */
public class ElectionTesterV1
{
    //prints individual candidate data
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

    public static void main(String[] args)
    {
        //creates 5 candidates in an array
        Candidate[] candidates = new Candidate[5];
        candidates[0] = new Candidate("Bill Smith", 35000);
        candidates[1] = new Candidate("James Phillips", 130000);
        candidates[2] = new Candidate("Rebecca Goldberg", 20000);
        candidates[3] = new Candidate("Robert Sheperdson", 15000);
        candidates[4] = new Candidate("Ana Thompson", 50000);

        //prints individual results and the table
        System.out.println("Individual Candidate Data:\n");
        printVotes(candidates);
        System.out.println("\nElection Results:\n");
        printTally(candidates);
        System.out.println("\nTotal votes in election: " + getTotal(candidates));
    }
}
