import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào kích thước mảng : ");
        int size = scanner.nextInt();
        int[] arrayNumber = createArray(size);
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập giá trị tại " + i + " : ");
            arrayNumber[i] = scanner.nextInt();
        }
        System.out.println("Mảng : " + Arrays.toString(arrayNumber));
        System.out.println("Giá trị nhỏ nhất trong mảng : " + findMin(arrayNumber));
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        return array;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
