import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class test {
    public static void main(String[] args) {
        try {
            // Khởi tạo đối tượng FileWriter và BufferedWriter với đường dẫn tới file cần ghi
            FileWriter writer = new FileWriter("D:\\TextFile\\FileWrite\\src\\Text");
            BufferedWriter buffer = new BufferedWriter(writer);

            // Ghi dữ liệu vào buffer
            buffer.write("Dòng 1");
            buffer.newLine(); // Xuống dòng mới
            buffer.write("Dòng 2");

            // Đóng buffer và writer để lưu dữ liệu
            buffer.close();
            writer.close();

            System.out.println("Ghi dữ liệu vào file thành công.");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi dữ liệu vào file: " + e.getMessage());
        }
    }
}
