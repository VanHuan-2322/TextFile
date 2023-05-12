import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng File
        File myFile = new File("myFile.txt");

        // Sử dụng phương thức getName() để lấy tên file
        String fileName = myFile.getName();
        System.out.println("Tên file: " + fileName);

        // Sử dụng phương thức getPath() để lấy đường dẫn tuyệt đối của file
        String filePath = myFile.getPath();
        System.out.println("Đường dẫn tuyệt đối của file: " + filePath);
    }
}
