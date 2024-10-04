import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the multiplication table: ");
        int n = input.nextInt();
        int[][] numbers = new int[n][n];

        System.out.println("Multiplication Table: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int number = i * j;
                System.out.printf("%4d", number);
            }
            System.out.println("");
        }
        
        input.close(); 
    }
}