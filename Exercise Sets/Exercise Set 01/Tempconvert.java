import java.util.Scanner;

class Tempconvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Celcius value: ");
        float celcius = sc.nextFloat();
        float fahrenheit = (celcius * 9) / 5 + 32;
        System.out.printf("%.2f %s is %.2f %s%n", celcius, "Celcius", fahrenheit, "Fahrenheit");
        sc.close();
    }
}
