import java.util.Scanner;
import java.util.regex.Matcher;

public class QuestSix {
    public void Run(){

        System.out.println("HESAPLAMAYA HOŞGELDİNİZ");
        System.out.println("YAPMAK İSTEDİĞİNZ İŞLEMİ SECİNİZ");
        System.out.println("0:ANA MENÜ");
        System.out.println("1:4 İŞLEM");
        System.out.println("2:KAREKÖK ALMA");
        System.out.println("3:KÜPKÖK ALMA");
        System.out.println("4:KUVVET ALMA");
        System.out.println("5:FAKTORİYEL HESAPLAMA");

            Scanner girdi = new Scanner(System.in);
            int secim = girdi.nextInt();

            switch (secim) {
                case 0:
                Menu menu = new Menu();
                menu.main(null);
                case 1:
                    System.out.println("YAPMAK İSTEDİĞİNİZ 4 İŞLEMİ SEÇİNİZ");
                    System.out.println("1:TOPLAMA");
                    System.out.println("2:CIKARMA");
                    System.out.println("3:CARPMA");
                    System.out.println("4:BOLME");
                    Scanner girdi1 = new Scanner(System.in);
                    int secim1 = girdi1.nextInt();
                    switch (secim1) {
                        case 1:
                            double sayi1, sayi2, toplam;
                            Scanner giris = new Scanner(System.in);
                            System.out.print("Bir sayı girin:");
                            sayi1 = giris.nextDouble();
                            System.out.print("Bir sayı girin:");
                            sayi2 = giris.nextDouble();
                            toplam = sayi1 + sayi2;
                            System.out.print("Sayıların Toplamı:" + toplam);
                            QuestSix questSix = new QuestSix();
                            questSix.Run();
                            break;
                        case 2:
                            double sayi3, sayi4, fark;
                            Scanner giriss = new Scanner(System.in);
                            System.out.print("Bir sayı girin:");
                            sayi3 = giriss.nextDouble();
                            System.out.print("Bir sayı girin:");
                            sayi4 = giriss.nextDouble();
                            fark = sayi3 - sayi4;
                            System.out.print("Sayıların FARKI:" + fark);
                            QuestSix questSix1 = new QuestSix();
                            questSix1.Run();

                            break;
                        case 3:
                            double sayi5, sayi6, carpma;
                            Scanner girix = new Scanner(System.in);
                            System.out.print("Bir sayı girin:");
                            sayi5 = girix.nextDouble();
                            System.out.print("Bir sayı girin:");
                            sayi6 = girix.nextDouble();
                            carpma = sayi5 * sayi6;
                            System.out.print("Sayıların Toplamı:" + carpma);
                            QuestSix questSix2 = new QuestSix();
                            questSix2.Run();
                            break;

                        case 4:
                            double sayi7, sayi8, bolme;
                            Scanner girib = new Scanner(System.in);
                            System.out.print("Bir sayı girin:");
                            sayi5 = girib.nextDouble();
                            System.out.print("Bir sayı girin:");
                            sayi6 = girib.nextDouble();
                            bolme = sayi5 * sayi6;
                            System.out.print("Sayıların Toplamı:" + bolme);
                            QuestSix questSix3 = new QuestSix();
                            questSix3.Run();
                            break;

                        default:
                            System.out.println("geçerli sayı giriniz");
                            Run();
                            break;

                    }

                case 2:
                    System.out.println("KAREKÖK ALMAK İSTEDİĞİNİZ SAYIYI  GİRİNİZ");
                    double sayi9, karekok;
                    Scanner girik = new Scanner(System.in);
                    System.out.print("Bir sayı girin:");
                    sayi9 = girik.nextDouble();
                    System.out.println("SONUÇ:" + Math.sqrt(sayi9));
                    QuestSix questSix = new QuestSix();
                    questSix.Run();
                    break;



                case 3:
                    System.out.println("KÜPKÖK ALMAK İSTEDİĞİNİZ SAYIYI  GİRİNİZ");
                    double sayi10, kupkok;
                    Scanner girikk = new Scanner(System.in);
                    System.out.print("Bir sayı girin:");
                    sayi10 = girikk.nextDouble();
                    System.out.println("SONUÇ:" + Math.cbrt(sayi10));
                    QuestSix questSix1 = new QuestSix();
                    questSix1.Run();
                    break;

                case 4:
                    double sayi11, sayı12, kuvvet;
                    System.out.println("KUVVETİNİ ALMAK İSTEDİĞİNİZ SAYIYI  GİRİNİZ");
                    Scanner girir = new Scanner(System.in);
                    sayi11 = girir.nextDouble();
                    System.out.print("Bir sayı girin:");
                    sayı12 = girir.nextDouble();
                    System.out.println("SONUC:" + Math.pow(sayi11, sayı12));
                    QuestSix questSix2 = new QuestSix();
                    questSix2.Run();
                    break;

                case 5:
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Sayi Giriniz : ");
                    int deger = scan.nextInt();
                    int faktoriyel = 1;
                    for (int i = 1; i <= deger; i++) {
                        faktoriyel = faktoriyel * i;
                    }

                    System.out.println(faktoriyel);
                    QuestSix questSix3 = new QuestSix();
                    questSix3.Run();
                    break;


                default:
                    System.out.println("geçerli sayı giriniz");
                    Run();
                    break;

            }

    }
}
