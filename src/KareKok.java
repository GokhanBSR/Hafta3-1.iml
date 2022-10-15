import javax.swing.*;
import java.math.MathContext;
import java.util.Random;
public class KareKok {
    int sayi1; int sayi2; int sayi3;
    static Void KareKokHesapla() {
        JOptionPane.showMessageDialog(null, "hesaplama yapmak istediğniz işlemi seçiniz \n" +
                "1 = Karekök Hesaplama\n 2 = Sayının Üssünü Hesaplama\n 3 = Kök Hesaplama \n");
        int secenek = Integer.parseInt(JOptionPane.showInputDialog("Lütfen bir İşlem Seçiniz"));
        if (secenek <1 || secenek >3) {
            JOptionPane.showMessageDialog(null, "Secenekler birisini seciniz.");
        } else { switch (secenek) {
                case 1 -> {
                    int sayi1 = Integer.parseInt(JOptionPane.showInputDialog ("Sıfır'dan Büyük Bir Sayı Giriniz:"));
                    double sonuc = Math.sqrt(sayi1);
                    JOptionPane.showMessageDialog(null, "Sayının Kare Kökü " + sonuc);
                }
                case 2 -> {
                    int sayi1 = Integer.parseInt(JOptionPane.showInputDialog("Bir Sayı Giriniz:"));
                    int sayi2 = Integer.parseInt(JOptionPane.showInputDialog("Bir Sayı Giriniz:"));
                    double sonuc = Math.pow(sayi1,sayi2);
                    JOptionPane.showMessageDialog(null, "Sayının Üssü" + sonuc);
                }
                case 3 -> {
                    int sayi1 = Integer.parseInt(JOptionPane.showInputDialog("Bir Sayı Giriniz:"));
                    double sonuc = Math.pow(sayi1,sayi1);
                    JOptionPane.showMessageDialog(null, "Sayının Karesi" + sonuc);
                }
            }}
        return null;
    }
        }