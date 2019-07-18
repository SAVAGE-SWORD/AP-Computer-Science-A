/**
 * Tests Candidate with an array.
 *
 * @author Paul Chafetz
 * @version 5/3/2019
 */
public class ElectionTesterV7
{
    //prints individual candidate data - unused in V3/V4 and on
    public static void printVotes(Candidate[] list) {
        for (Candidate cand : list) {
            if (cand != null)
                System.out.println(cand);
        }
    }

    //calculates total votes
    public static int getTotal(Candidate[] list) {
        int total = 0;
        for (Candidate cand : list) {
            if (cand != null)
                total += cand.getVotes();
        }
        return total;
    }

    //prints results in a table
    public static void printTally(Candidate[] list)
    {
        double total = getTotal(list);
        System.out.printf("%-20s%-12s%1s%n", "Candidate", "Votes", "Percentage (%)");
        for (Candidate cand : list) {
            if (cand != null)
                System.out.printf("%-20s%-16d%1.2f%n", cand.getName(), cand.getVotes(), ((cand.getVotes() / total) * 100));
        }
    }

    //changes candidate based on name
    public static void changeCandidate(Candidate[] list, String orig, String newName) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getName().equals(orig) && list[i] != null)
                list[i].setName(newName);
        }
    }

    //changes votes of a candidate based on name
    public static void changeVotes(Candidate[] list, String orig, int newVotes) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getName().equals(orig) && list[i] != null)
                list[i].setVotes(newVotes);
        }
    }

    //changes both the candidate and votes based on name
    public static void changeBoth(Candidate[] list, String orig, String newName, int newVotes) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getName().equals(orig) && list[i] != null) {
                list[i].setName(newName);
                list[i].setVotes(newVotes);
            }
        }
    }

    //inserts candidate based on position
    public static void insertPos(Candidate[] list, int loc, String newName, int newVotes) {
        for (int i = list.length - 1; i > loc; i--)
            list[i] = list[i - 1];
        list[loc] = new Candidate(newName, newVotes);    
    }

    //inserts candidate based on name
    public static void insertCand(Candidate[] list, String orig, String newName, int newVotes) {
        int loc = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getName().equals(orig) && list[i] != null)
                loc = i;
        }
        if (loc >= 0) {
            for (int i = list.length - 1; i > loc; i--)
                list[i] = list[i - 1];
        }
        list[loc] = new Candidate(newName, newVotes);  
    }

    //deletes candidate based on position
    public static void deletePos(Candidate[] list, int loc) {
        if (loc >= 0 && loc < list.length) {
            for (int i = loc; i < list.length - 1; i++)
                list[i] = list[i + 1];
            list[list.length - 1] = null;    
        }
    }

    //deletes candidate based on name
    public static void deleteCand(Candidate[] list, String orig) {
        int loc = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getName().equals(orig) && list[i] != null) {
                loc = i;
                break;
            }
        }
        if (loc >= 0) {
            for (int i = loc; i < list.length - 1; i++)
                list[i] = list[i + 1];
            list[list.length - 1] = null;    
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
        
        //deletes candidate at position
        System.out.println("\nDeleting candidate at position (index) 1\n");
        deletePos(candidates, 1);
        printTally(candidates);
        System.out.println("Total votes in election: " + getTotal(candidates));
        
        //deletes candidate by name
        System.out.println("\nDeleting Rebecca Goldberg\n");
        deleteCand(candidates, "Rebecca Goldberg");
        printTally(candidates);
        System.out.println("Total votes in election: " + getTotal(candidates));
    }
}
