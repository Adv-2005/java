package lab7;
import myPackages.p1.Maximum;
public class q2 {
	public static void main(String[] args) {
      
        int maxInt = Maximum.max(3, 7, 5);
        System.out.println("Maximum among 3, 7, 5: " + maxInt);

     
        float maxFloat = Maximum.max(3.5f, 7.2f, 5.8f);
        System.out.println("Maximum among 3.5, 7.2, 5.8: " + maxFloat);

        
        int[] array = {1, 2, 3, 4, 5};
        int maxArray = Maximum.max(array);
        System.out.println("Maximum in array {1, 2, 3, 4, 5}: " + maxArray);

     
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int maxMatrix = Maximum.max(matrix);
        System.out.println("Maximum in matrix {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}: " + maxMatrix);
    }
}
