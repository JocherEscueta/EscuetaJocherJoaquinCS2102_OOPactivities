import java.util.Scanner;

class GetArrayMean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        int[] numbers = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            numbers[i] = input.nextInt();
        }
        
        float mean = getArrayMean(numbers);
        System.out.printf("Mean of array is: %.2f%n", mean);
        
        input.close(); 
    }
    
    public static float getArrayMean(int[] array) {
        float sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }
}