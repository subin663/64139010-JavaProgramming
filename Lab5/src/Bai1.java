import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> arr = new ArrayList<>();

        while (true) {
            // Nhập số từ người dùng
            System.out.print("Nhập một số thực: ");
            arr.add(sc.nextDouble());

            // Hỏi người dùng có muốn nhập tiếp không
            System.out.print("Bạn có muốn nhập số nữa không? (Y/N): ");
            char c = sc.next().charAt(0);

            if (c == 'N' || c == 'n') {
                break;
            }
        }

        // In ra các phần tử đã nhập
        System.out.println("Các số bạn đã nhập:");
        for (Double num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
