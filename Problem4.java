import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of list:");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            map.put(i, 0);
        }

        for (int num : arr) {
            for (int div = 1; div <= 9; div++) {
                if (num % div == 0) {
                    map.put(div, map.get(div) + 1);
                }
            }
        }

       
        System.out.print("{"); 
        for (int div = 1; div <= 9; div++) {
            
            System.out.print(div + ": " + map.get(div));
            
           
            if (div < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}"); 
    }
}