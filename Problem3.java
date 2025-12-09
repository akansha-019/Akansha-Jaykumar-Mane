import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter single integer");
        int a = sc.nextInt();

        int numberOfTerms = (a % 2 == 0) ? a - 1 : a;

        
        for (int i = 0; i < numberOfTerms; i++) {
            
           
            int oddNumber = 2 * i + 1;
            
            System.out.print(oddNumber);

           
            if (i < numberOfTerms - 1) {
                System.out.print(", ");
            }
        }
    }
}