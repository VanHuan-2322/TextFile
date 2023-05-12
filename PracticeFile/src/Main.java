import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    // Phương thức đọc dữ liệu từ file và trả về chuỗi chứa dữ liệu đó.
    public static String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (FileReader reader = new FileReader(fileName)) {
            int character;
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
        } catch (IOException e) {
            System.out.println("Không thể đọc file " + fileName);
        }
        return content.toString();
    }

    // Phương thức ghi dữ liệu vào file và trả về true nếu việc ghi thực hiện thành công, ngược lại trả về false.
    public static boolean writeFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            return true;
        } catch (IOException e) {
            System.out.println("Không thể ghi dữ liệu vào file " + fileName);
            return false;
        }
    }

    public static void main(String[] args) {
        String fileName = "example.txt";
        String contentToWrite = "Đây là nội dung mẫu để ghi vào file.";

        // Ghi dữ liệu vào file
        boolean success = writeFile(fileName, contentToWrite);
        if (success) {
            System.out.println("Đã ghi dữ liệu thành công vào file " + fileName);
        }

        // Đọc dữ liệu từ file và in ra màn hình
        String contentToRead = readFile(fileName);
        System.out.println("Nội dung của file " + fileName + " là:\n" + contentToRead);
    }
}
