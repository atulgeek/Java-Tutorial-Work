import java.util.Scanner;
public class Trails {
    public static void grtlwr(int a, int b) {
        if (a < b) {
            System.out.println("The first number is smaller");
        } else if (a > b) {
            System.out.println("The second number is smaller");
        } else {
            System.out.println("Both are Equal");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();
        grtlwr(a, b);
    }
}