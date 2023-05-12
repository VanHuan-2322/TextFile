import java.io.File;

public class Main{
    public static void main(String[] args) {
        String fileName = "example.txt";
        File file = new File(fileName);

        // Kiểm tra xem file có tồn tại hay không?
        if (file.exists()) {
            System.out.println("File " + fileName + " đã tồn tại");
        } else {
            // Tạo file mới
            try {
                file.createNewFile();
                System.out.println("File " + fileName + " đã được tạo");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Kiểm tra xem file có phải là thư mục hay không?
        if (file.isDirectory()) {
            System.out.println(fileName + " là một thư mục");
        } else {
            System.out.println(fileName + " là một file");
        }

        // Hiển thị đường dẫn
        System.out.println("Đường dẫn của " + fileName + " là " + file.getAbsolutePath());
    }
}
