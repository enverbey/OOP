public class FunctionsExample {
    // Dönüş değeri olmayan metod (void)
    public static void printGreeting() {
        System.out.println("Merhaba, Metodlar ve Fonksiyonlar dersine hoş geldiniz!");
    }

    // Dönüş değeri olan metod
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Birden fazla parametre alan metod
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        // Dönüş değeri olmayan bir metod çağrısı
        printGreeting();

        // Dönüş değeri olan bir metod çağrısı
        int sum = addNumbers(5, 10);
        System.out.println("5 ve 10'un toplamı: " + sum);

        // Birden fazla parametre alan bir metod çağrısı
        String fullName = getFullName("John", "Doe");
        System.out.println("Tam Ad: " + fullName);
    }
}
