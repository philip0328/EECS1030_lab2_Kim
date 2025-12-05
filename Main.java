import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      boolean[] chptList = new boolean[16]; // Valid chapters are 1-15. 1 means include, 0 exclude. Element 0 unused. 
      int includeChpt;
      int i, j;
      
      // Get the chapter selections
      for (i = 1; i <= 15; ++i) {
         includeChpt = scnr.nextInt(); 
         if (includeChpt == 1) {
            chptList[i] = true;
         }
         else {
            chptList[i] = false;
         }
      }
      
      /* Type your code here. */
      boolean anySelected = false;

      i = 1;
      while (i <= 15) {
        if (!chptList[i]) {
            i++;
        } else {
            anySelected = true;

            int start = i;
            int end = i;

            while (end + 1 <= 15 && chptList[end + 1]) {
                end++;
            }
            int len = end - start + 1;

            if (len >= 3) {
                System.out.print(start + "-" + end + " ");
            } else if (len == 2) {
                System.out.print(start + " " + end + " ");
            } else {
                System.out.print(start + " ");
            }
            i = end + 1;
        }
      }
      if (!anySelected) {
        System.out.print("None ");
      }
      System.out.println();
   }
}
