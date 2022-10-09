import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scanner.nextInt();
        double num;
        double[][] arr = new double[size][];
        for (int i = 0;i<arr.length;i++){
            System.out.printf("How many elements does position %d need? ", i);
            size = scanner.nextInt();
            arr[i] = new double[size];
        }
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.printf("Enter number arr[%d][%d]: ",i,j);
                num = scanner.nextDouble();
                arr[i][j] = num;
            }
        }
        System.out.println("Array of you is: ");
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
        double sum = 0;
        System.out.println("What column do you need to sum? ");
        int column = scanner.nextInt();
        for (int i = 0;i<arr.length;i++){
            if (column<=arr[i].length){
                sum += arr[i][column-1];
            }

        }
        System.out.println("The column total you need to calculate is: " + sum);
    }
}