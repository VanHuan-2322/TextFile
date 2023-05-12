import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DocFile {
        public static void main(String[] args) {
            String fileName = "D:\\TextFile\\TapDocFile\\src\\Doc"; // Đường dẫn tới file
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
                String data = "Hello!!!"; // Chuỗi dữ liệu cần lưu vào file
                bw.write(data);
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
            try {
                FileReader reader = new FileReader("D:\\TextFile\\TapDocFile\\src\\Doc");
                int character;
                while ((character = reader.read()) != -1) {
                    System.out.print((char) character);
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

}
