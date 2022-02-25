import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public int[] creatRandom (){
        Random random = new Random();
        int[] arr = new int[100];
        System.out.println("Danh sách các phần tử mảng: ");
        for (int i = 0; i < 100 ; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        // Khởi tạo đối tượng
        ArrayExample arrayExample = new ArrayExample();
        int[] arr = arrayExample.creatRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();

        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
