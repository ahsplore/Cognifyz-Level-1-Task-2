import java.util.*;

public class SpiralPatternOddNumbers {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int n = sc.nextInt();
        int[][] spiral = new int[n][n];
        
        int value = 1;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {
            // top row
            for (int i = left; i <= right; i++) {
                spiral[top][i] = value;
                value += 2;
            }
            top++;

            // right column
            for (int i = top; i <= bottom; i++) {
                spiral[i][right] = value;
                value += 2;
            }
            right--;

            // bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiral[bottom][i] = value;
                    value += 2;
                }
                bottom--;
            }

            // left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiral[i][left] = value;
                    value += 2;
                }
                left++;
            }
        }
        
        System.out.println("Spiral Pattern is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", spiral[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }  
}