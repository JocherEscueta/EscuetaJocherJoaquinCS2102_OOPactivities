import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the multiplication table: ");
        int n = input.nextInt();
        int[][] numbers = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int number = i * j;
                numbers[i][j] = number;
            }
        }

        System.out.println("Multiplication Table: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", numbers[i][j]);
            }
            System.out.println();
        }
        
        input.close(); 
    }
}
