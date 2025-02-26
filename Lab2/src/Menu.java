import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Hiển thị menu
        	System.out.println("Nhập sự lựa chọn của bạn.");
            System.out.println("1. Giải phương trình bậc 1");
            System.out.println("2. Giải phương trình bậc 2");
            System.out.println("3. Tính tiền điện hàng tháng");
            System.out.println("4. Thoát chương trình");
            System.out.print("Vui lòng chọn chương trình muốn thực hiện: ");

            choice = sc.nextInt();  // Nhập lựa chọn

            switch (choice) {
                case 1:
                    PTB1(sc);
                    break;
                case 2:
                    PTB2(sc);
                    break;
                case 3:
                    Bai3(sc);
                    break;
                case 4:
                    System.out.println("Chương trình kết thúc. ");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
            }
        } while (choice != 4);  // Lặp lại cho đến khi chọn 4 để thoát

        sc.close(); // Đóng Scanner để tránh rò rỉ bộ nhớ
    }

    // Giải phương trình bậc 1
    public static void PTB1(Scanner sc) {
        System.out.print("Vui lòng nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Vui lòng nhập b: ");
        double b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm!");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            System.out.println("Nghiệm của phương trình là: x = " + (-b / a));
        }
    }

    // Giải phương trình bậc 2
    public static void PTB2(Scanner sc) {
        System.out.print("Vui lòng nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Vui lòng nhập b: ");
        double b = sc.nextDouble();
        System.out.print("Vui lòng nhập c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Nghiệm của phương trình là: x = " + (-c / b));
        } else {
            double delta = b * b - 4 * a * c;
            System.out.println("Delta của phương trình là: " + delta);

            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép x = " + (-b / (2 * a)));
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }

    // Tính tiền điện hàng tháng
    public static void Bai3(Scanner sc) {
        System.out.print("Vui lòng nhập vào số điện đã sử dụng: ");
        double sDien = sc.nextDouble();
        double tien;

        if (sDien <= 50) {
            tien = sDien * 1000;
        } else {
            tien = 50 * 1000 + (sDien - 50) * 1200;
        }

        System.out.println("Số tiền điện đã sử dụng hàng tháng là: " + tien + " VND");
    }
}
