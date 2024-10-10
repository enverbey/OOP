import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOExample {
    public static void main(String[] args) {
        String filePath = "example.txt";
        
        // Bir dosyaya yazma
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Merhaba, Dünya!");
            writer.newLine();
            writer.write("Java Dosya G/Ç'ye hoş geldiniz!");
            writer.newLine();
            System.out.println("Veriler dosyaya yazıldı.");
        } catch (IOException e) {
            System.out.println("Dosyaya yazma sırasında bir hata oluştu.");
            e.printStackTrace();
        }

        // Bir dosyadan okuma
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Dosyadan veriler okunuyor:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Dosyadan okuma sırasında bir hata oluştu.");
            e.printStackTrace();
        }
    }
}
