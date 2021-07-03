import java.util.ArrayList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        System.out.println("OYUNLARA HOS GELDİNİZ");
        System.out.println("1:UYGULAMA: KÖŞE KAPMACA");
        System.out.println("2:UYGULAMA:İSİM TAHMİN");
        System.out.println("3:UYGULAMA:KELİME GİRİŞİ");
        System.out.println("4:UYGULAMA: KÜTÜPHANE");
        System.out.println("5:UYGULAMA:ZAR");
        System.out.println("6:UYGULAMA:İŞLEMLER");
        Scanner giris =new Scanner(System.in);
        int tercih =giris.nextInt();
        switch (tercih) {
            case 1:
              QuestOne questOne = new QuestOne();
              questOne.run();
                break;
            case 2:
                QuestTwo questTwo = new QuestTwo();
                questTwo.run();
                break;

            case 3:
                QuestThree questThree = new QuestThree();
                questThree.run();
                break;
            case 4:
                QuestFour questFour = new QuestFour();
                questFour.run();
                break;
            case 5:
                QuestFive questFive = new QuestFive();
                questFive.Run();
                break;
            case 6:
                QuestSix questSix = new QuestSix();
                questSix.Run();
                break;


        }
    }

    }




