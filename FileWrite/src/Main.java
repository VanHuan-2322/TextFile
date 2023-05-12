import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            // Khởi tạo đối tượng FileWriter với đường dẫn tới file cần ghi
            FileWriter writer = new FileWriter("D:\\TextFile\\FileWrite\\src\\Text");

            // Ghi dữ liệu vào file
            writer.write("Đã ghi dữ liệu");

            // Đóng writer để lưu dữ liệu
            writer.close();

            System.out.println("Ghi dữ liệu vào file thành công.");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi dữ liệu vào file: " + e.getMessage());
        }

        String fileName = "D:\\TextFile\\FileWrite\\src\\Text"; // Đường dẫn tới file cần đọc

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

    }
}
