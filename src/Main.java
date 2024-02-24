import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan bir sayı almak için Scanner sınıfını kullanıyoruz.
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı girmesini istiyoruz.
        System.out.print("Bir sayı girin: ");
        int girilenSayi = scanner.nextInt();

        // 1'den girilen sayıya kadar olan sayıları kontrol ediyoruz.
        for (int i = 1; i <= girilenSayi; i++) {
            // Her bir sayının 4 ve 5'in kuvvetleri olup olmadığını kontrol ediyoruz.
            if (isDortunKuvveti(i) || isBesinKuvveti(i)) {
                System.out.println(i);
            }
        }

        // Scanner'ı kapatıyoruz.
        scanner.close();
    }

    // Bir sayının 4'ün kuvveti olup olmadığını kontrol eden fonksiyon
    public static boolean isDortunKuvveti(int sayi) {
        int kuvvet = 1;
        while (kuvvet < sayi) {
            kuvvet *= 4;
        }
        return kuvvet == sayi;
    }

    // Bir sayının 5'in kuvveti olup olmadığını kontrol eden fonksiyon
    public static boolean isBesinKuvveti(int sayi) {
        int kuvvet = 1;
        while (kuvvet < sayi) {
            kuvvet *= 5;
        }
        return kuvvet == sayi;
    }
}

