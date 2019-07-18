/**
 * Tests Contact class and sorts a list of Contacts for searches.
 *
 * @author Paul Chafetz
 * @version 5/16/2019
 */
public class ContactTester
{
    //prints contacts in a table format
    public static void print(Contact[] contacts)
    {
        System.out.printf("%7s%17s%11s%12s%21s%n", "Name", "Relation", "Birthday", "Phone #", "Email Address");
        for (Contact c : contacts)
            System.out.println(c);
    }

    //merges subarrays into one array as part of merge sort
    public static void mergeName(Contact[] contacts, int low, int mid, int high)
    {
        Contact[] temp = new Contact[high - low + 1];
        int i = low;
        int j = mid + 1;
        int index = 0;
        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[index] = contacts[j];
                j++;
            }
            else if (j > high) {
                temp[index] = contacts[i];
                i++;
            }
            else if (contacts[i].getName().compareTo(contacts[j].getName()) < 0) {
                temp[index] = contacts[i];
                i++;
            }
            else {
                temp[index] = contacts[j];
                j++;
            }
            index++;
        }
        for (int k = low; k <= high; k++)
            contacts[k] = temp[k - low];
    }

    //merge sorts array and merges the subarrays
    public static void mergeSortName(Contact[] contacts, int low, int high)
    {
        if (low == high)
            return;
        int mid = (low + high)/ 2;
        mergeSortName(contacts, low, mid);
        mergeSortName(contacts, mid + 1, high);
        mergeName(contacts, low, mid, high);
    }

    //merges subarrays into one array as part of merge sort
    public static void mergeRelation(Contact[] contacts, int low, int mid, int high)
    {
        Contact[] temp = new Contact[high - low + 1];
        int i = low;
        int j = mid + 1;
        int index = 0;
        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[index] = contacts[j];
                j++;
            }
            else if (j > high) {
                temp[index] = contacts[i];
                i++;
            }
            else if (contacts[i].getRelation().compareTo(contacts[j].getRelation()) < 0) {
                temp[index] = contacts[i];
                i++;
            }
            else {
                temp[index] = contacts[j];
                j++;
            }
            index++;
        }
        for (int k = low; k <= high; k++)
            contacts[k] = temp[k - low];
    }

    //merge sorts array and merges the subarrays
    public static void mergeSortRelation(Contact[] contacts, int low, int high)
    {
        if (low == high)
            return;
        int mid = (low + high)/ 2;
        mergeSortRelation(contacts, low, mid);
        mergeSortRelation(contacts, mid + 1, high);
        mergeRelation(contacts, low, mid, high);
    }

    //binary search by name using merge sort method
    public static void binaryName(Contact[] contacts, String name)
    {
        mergeSortName(contacts, 0, contacts.length - 1);
        int high = contacts.length;
        int low = -1;
        int mid, index;
        while (high - low > 1) {
            mid = (low + high) / 2;
            if (contacts[mid].getName().compareTo(name) > 0)
                high = mid;
            else
                low = mid;
        }
        if (contacts[low].getName().compareTo(name) == 0 && low >= 0)
            index = low;
        else
            index = -1;
        if (index == -1)
            System.out.println("Error: No one by that name!");
        else
            System.out.println(contacts[index]);
    }

    //binary search by relation using merge sort method
    public static void binaryRelation(Contact[] contacts, String relation)
    {
        mergeSortRelation(contacts, 0, contacts.length - 1);
        int high = contacts.length;
        int low = -1;
        int mid;
        while (high - low > 1) {
            mid = (low + high) / 2;
            if (contacts[mid].getRelation().compareTo(relation) > 0)
                high = mid;
            else {
                low = mid;
                if (contacts[mid].getRelation().compareTo(relation) == 0)
                    break;
            }
        }
        if (contacts[low].getRelation().compareTo(relation) == 0 && low >= 0)
            linearRelation(contacts, low, relation);
        else
            System.out.println("\nError: No one by that relation!");
    }

    //sequential search by birth month
    public static void sequentialBirthday(Contact[] contacts, String birthday)
    {
        int loc = 0;
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getBirthday().substring(0, 3).compareTo(birthday) == 0) {
                loc++;
                System.out.println(contacts[i]);
            }
        }
        if (loc == 0)
            System.out.println("Error: No one with that birthday month!");
    }

    //sequential search by phone number
    public static void sequentialNumber(Contact[] contacts, String number)
    {
        int loc = 0;
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getNumber().compareTo(number) == 0) {
                loc++;
                System.out.println(contacts[i]);
            }
        }
        if (loc == 0)
            System.out.println("Error: No one with that phone number!");
    }

    //sequential search by email address
    public static void sequentialEmail(Contact[] contacts, String email)
    {
        int loc = 0;
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getEmail().compareTo(email) == 0) {
                loc++;
                System.out.println(contacts[i]);
            }
        }
        if (loc == 0)
            System.out.println("Error: No one with that email address!");
    }

    //method to print all instances from binary search for relation
    public static void linearRelation(Contact[] contacts, int low, String relation)
    {
        int i, start = low, end = low;
        i = low - 1;
        while (i >= 0 && contacts[i].getRelation().compareTo(relation) == 0) {
            start = i;
            i--;
        }
        i = low + 1;
        while (i < contacts.length && contacts[i].getRelation().compareTo(relation) == 0) {
            end = i;
            i++;
        }
        for (i = start; i <= end; i++)
            System.out.println(contacts[i]);
    }

    public static void main(String[] args)
    {
        //I used a random number generator to make fake phone numbers
        Contact[] contacts = {
                new Contact("Liam Smith", "father", "Jan 5", "305-189-8337", "lsmith@gmail.com"),
                new Contact("Noah Smith", "brother", "Feb 9", "305-341-0353", "nsmith@yahoo.com"),
                new Contact("William Smith", "brother", "Mar 20", "305-646-8511", "smithwilliam@gmail.com"),
                new Contact("James Fried", "cousin", "Jan 30", "305-697-7058", "jafried@hotmail.com"),
                new Contact("Oliver Twist", "friend", "May 25", "305-034-2066", "oltwist250@company.org"),
                new Contact("Emma Ross", "mother", "Jun 5", "305-183-5840", "eross65@gmail.com"),
                new Contact("Olivia Fried", "cousin", "Jun 16", "305-799-8944", "olivfried2@outlook.com"),
                new Contact("Ava Fried", "aunt", "Aug 2", "305-556-8238", "friedava@yahoo.com"),
                new Contact("Isabella Hauser", "sister", "Nov 19", "305-029-7140", "isahauser@hotmail.com"),
                new Contact("Sophia Jacobs", "friend", "Nov 28", "305-779-4678", "sophjaco@host.net")};

        //All methods tested below with label of search criterion
        System.out.println("\n\t\t\tList of Contacts\n");
        print(contacts);

        System.out.println("\n\n\tMerge sorting by name and searching for \"Emma Ross\"\n");
        binaryName(contacts, "Emma Ross");
        //print(contacts);

        System.out.println("\n\n\tMerge sorting by name and searching for \"Phil Smith\"\n");
        binaryName(contacts, "Phil Swift");
        //print(contacts);

        System.out.println("\n\n\tMerge sorting by relation and searching for cousins\n");
        binaryRelation(contacts, "cousin");
        //print(contacts);

        System.out.println("\n\n\tMerge sorting by relation and searching for uncles\n");
        binaryRelation(contacts, "uncle");
        //print(contacts);

        System.out.println("\n\n\tSearching for birthdays in June\n");
        sequentialBirthday(contacts, "Jun");

        System.out.println("\n\n\tSearching for birthdays in December\n");
        sequentialBirthday(contacts, "Dec");

        System.out.println("\n\n\tSearching for the phone number \"305-341-0353\"\n");
        sequentialNumber(contacts, "305-341-0353");

        System.out.println("\n\n\tSearching for the phone number \"305-123-4567\"\n");
        sequentialNumber(contacts, "305-123-4567");

        System.out.println("\n\n\tSearching for the email address \"oltwist250@company.org\"\n");
        sequentialEmail(contacts, "oltwist250@company.org");

        System.out.println("\n\n\tSearching for the email address \"veryannoyingassignment@apcs.com\"\n");
        sequentialEmail(contacts, "veryannoyingassignment@apcs.com");
    }
}
