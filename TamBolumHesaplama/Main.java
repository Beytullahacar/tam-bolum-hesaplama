package TamBolumHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input, sayac = 0;
        double toplam = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        input = scan.nextInt();

        int i = 1;

        while (i <= input){
            if ((i % 3 == 0) && (i % 4 == 0)){
                toplam += i;
                sayac++;
            }
            i++;
        }
        double sonuc = toplam / sayac;
        System.out.println("Ortalama : " + sonuc);
    }
}
