import java.util.ArrayList;

public class Sorting {

    public static void main(String[] args) {
        int[] rand =  new int[100];
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        //assign values to array list - each value will be a random number between 1 and 100
        for (double i : rand) {
            i = Math.random()*100;
            int value = (int)i;
            arrList.add(value);
        }

        //unsorted ArrayList
        AscendingDescending sortArrList = new AscendingDescending(arrList);
        ArrayList<Integer> unsorted = sortArrList.getArrayList();
        System.out.println("Unsorted ArrayList: " + unsorted + "\n"); 

        //sort ArrayList in descending order
        ArrayList<Integer> descendingOrder = sortArrList.sortDescending();
        System.out.println("Sort ArrayList in descending order: " + descendingOrder + "\n"); 

        //sort ArrayList in ascending order
        ArrayList<Integer> ascendingOrder = sortArrList.sortAscending();
        System.out.println("Sort ArrayList in Ascending Order: " + ascendingOrder); 

        //--------------------------------------------------Explanation of what this program does------------------------------------------------------------//
        /* ArrayList object was initialized in constructor defined in the AscendingDescending class. sortAscending() and sortDescending() methods will sort 
        ArrayLists in each order. Used the Collections.sort() and Collections.reverseOrder() methods inside of those created methods to accomplish this goal. */
    }
}