public class IfElseExample {
    public static void main(String[] args) {
        int number = 10;

        // Basit bir if-else örneği
        if (number > 0) {
            System.out.println("Sayı pozitiftir.");
        } else if (number == 0) {
            System.out.println("Sayı sıfırdır.");
        } else {
            System.out.println("Sayı negatiftir.");
        }

        // İç içe if örneği
        int age = 20;
        if (age > 18) {
            if (age < 25) {
                System.out.println("Yaş 18 ile 25 arasında.");
            }
        }
    }
}
