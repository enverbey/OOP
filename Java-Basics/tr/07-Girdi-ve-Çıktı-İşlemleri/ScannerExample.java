import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bir string girişi alma
        System.out.print("Adınızı girin: ");
        String name = scanner.nextLine();
        System.out.println("Merhaba, " + name + "!");

        // Bir tam sayı girişi alma
        System.out.print("Yaşınızı girin: ");
        int age = scanner.nextInt();
        System.out.println("Siz " + age + " yaşındasınız.");

        // Bir double girişi alma
        System.out.print("Boyunuzu metre cinsinden girin: ");
        double height = scanner.nextDouble();
        System.out.println("Boyunuz " + height + " metredir.");

        // Scanner tamponunu temizleme
        scanner.nextLine(); // Kalan yeni satırı tüket

        // Birden fazla girişi alma
        System.out.print("Favori hobilerinizi girin (virgülle ayrılmış): ");
        String hobbies = scanner.nextLine();
        System.out.println("Hobileriniz: " + hobbies);

        scanner.close(); // Scanner'ı kapat
    }
}
