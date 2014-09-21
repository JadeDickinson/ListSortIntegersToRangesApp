/* 1) Implement the following method:

// Convert a list of not-necessarily sequential
// numbers into a comma-separated list of
// ranges, of the format "from:to".

    static string ranges(int[] numbers) {}

// Example: ranges([1,2]) = "1:2"
// Example: ranges([1,2,3,5]) = "1:3,5"
// Example: ranges(1) = "1"
 */
package listsortintegerstorangesapp;
import java.util.*;
import java.lang.*;
/**
 *
 * @author jade
 */
public class ListSortIntegersToRangesApp {
    /**
     * @param args the command line arguments
     */
    // Declare the variables before the if
            static String stringA;
            static String stringB;
            static String stringC;
            static String stringD;
            static String stringE;
            static String stringF;
            static String stringG;

    public static void main(String[] args) {
        //System.out.print("This thing is on");
        /** Create the range of numbers. Possibly later take an input for,
         * or generate a random list of numbers. These are in an array.
         **/
        Scanner input = new Scanner(System.in);
        
            System.out.print("Type 7 numbers to sort: ");
            int[] numbers = new int[7];
            for(int typed_integer=0; typed_integer<7; typed_integer++) {
                numbers[typed_integer] = input.nextInt();
                
                for(int sort_integer=0; sort_integer<7; sort_integer++) {
                    if(numbers[typed_integer] < numbers[sort_integer]) {
                        int swap = numbers[typed_integer];
                        numbers[typed_integer] = numbers[sort_integer];
                        numbers[sort_integer] = swap;
                    }
                }
            }
            
            System.out.println("All of the numbers in order: ");
            
            for(int print = 0; print<7; print++) {
                System.out.print(numbers[print]+ " ");
            }
            System.out.println();

//Declaring variables moved from here.

            //Printing out the list in the format required.
    //Below, added method which prints out the numbers in the format required. They may
          //still be integers though. It does not work properly with negatives.
            for (int i = 0; i<7; i++ ) {
                //The first if statement below handles what to do if the next number is the same as the current number.
                //When this is the case it will not print the current number, because to avoid duplicate numbers only the
                //final identical number in the sorted sequence prints.
                if     (i==0)    {
                    if (numbers[i] == numbers[i+1]) {
                        stringA = Integer.toString(numbers[i])+":";
                        System.out.print(stringA);
                    }
                    else if (numbers[i] != (numbers[i+1]-1)) {
                        stringA = Integer.toString(numbers[i])+",";
                        System.out.print(stringA);
                    }
                    else if (numbers[i] == (numbers[i+1]-1)) {
                        stringA = Integer.toString(numbers[i])+":";
                        System.out.print(stringA);
                    }
                }

                else if (i==1)   {
                    if (numbers[i] == numbers[i-1] || numbers[i] == numbers[i+1]) {
                        stringB = Integer.toString(numbers[i]);
                    }
                    else if(numbers[i] != (numbers[i+1]-1)) {
                        stringB = Integer.toString(numbers[i])+",";
                        System.out.print(stringB);
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] != (numbers[i-1]+1) ) {
                        stringB = Integer.toString(numbers[i])+":";
                        System.out.print(stringB);
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] == (numbers[i-1]+1) ) {
                        stringB = Integer.toString(numbers[i]);
                    }

                }

                else if (i==2)   {
                    if (numbers[i] == numbers[i-1] || numbers[i] == numbers[i+1]) {
                        stringC = Integer.toString(numbers[i]);
                    }
                    else if(numbers[i] != (numbers[i+1]-1)) {
                        stringC = Integer.toString(numbers[i])+",";
                        System.out.print(stringC);
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] != (numbers[i-1]+1) ) {
                        stringC = Integer.toString(numbers[i])+":";
                        System.out.print(stringC);
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] == (numbers[i-1]+1) ) {
                        stringC = Integer.toString(numbers[i]);
                    }
                }

                else if (i==3)   {
                    if (numbers[i] == numbers[i-1] || numbers[i] == numbers[i+1]) {
                        stringD = Integer.toString(numbers[i]);
                    }
                    else if(numbers[i] != (numbers[i+1]-1)) {
                        stringD = Integer.toString(numbers[i])+",";
                        System.out.print(stringD);
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] != (numbers[i-1]+1) ) {
                        stringD = Integer.toString(numbers[i])+":";
                        System.out.print(stringD);
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] == (numbers[i-1]+1) ) {
                        stringD = Integer.toString(numbers[i]);
                    }
                }

                else if (i==4)   {
                    if (numbers[i] == numbers[i-1] || numbers[i] == numbers[i+1]) {
                        stringE = Integer.toString(numbers[i]);
                    }
                    else if(numbers[i] != (numbers[i+1]-1)) {
                        stringE = Integer.toString(numbers[i])+",";
                        System.out.print(stringE);
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] != (numbers[i-1]+1) ) {
                        stringE = Integer.toString(numbers[i])+":";
                        System.out.print(stringE);
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] == (numbers[i-1]+1) ) {
                        stringE = Integer.toString(numbers[i]);
                    }
                }

                else if (i==5)   {
                    if (numbers[i] == numbers[i-1] || numbers[i] == numbers[i+1]) {
                        stringF = Integer.toString(numbers[i]);
                    }
                    else if(numbers[i] != (numbers[i+1]-1)) {
                        stringF = Integer.toString(numbers[i])+",";
                        System.out.print(stringF);
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] != (numbers[i-1]+1) ) {
                        stringF = Integer.toString(numbers[i])+":";
                        System.out.print(stringF);
                    }
                    else if(numbers[i] == (numbers[i+1]-1) && numbers[i] == (numbers[i-1]+1) ) {
                        stringF = Integer.toString(numbers[i]);
                    }
                }

                else if (i==6)   {
                    stringG = Integer.toString(numbers[i]);
                    System.out.print(stringG);
                    break;
                }
//Bracket below is the closure of the for loop.
            }
            System.out.println();
            
            String ranges = (stringA + stringB + stringC + stringD + stringE + stringF + stringG);
            
            System.out.println("Ranges: "+ranges);
            

    }
       
}