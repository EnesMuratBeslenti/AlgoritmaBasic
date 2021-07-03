import java.util.Random;
import java.util.Scanner;

public class QuestFour {

    public void run(){

        System.out.println("KÜTÜPHANEYE HOŞGELDİNİZ");
        System.out.println("0:ANA MENÜ");
        System.out.println("SIRALAMA İÇİN 1");
        System.out.println("DİZME İÇİN 2");
        Random r=new Random();
        Scanner girdi = new Scanner(System.in);
        int secim = girdi.nextInt();
        switch (secim) {
            case 0:
                Menu menu = new Menu();
                menu.main(null);
            case 1:
                int a = r.nextInt(42 )+1;
                int kırmızı = a;
                int b = 42 - kırmızı;
                int c = r.nextInt(b);
                int yesil = c;
                int d = b - c;
                System.out.println("KIRMIZI KİTAPLAR:" + a + "YEŞİL KİTAPLAR :" + c + "MAVİ KİTAPLAR: " + d);
                break;
            case 2:
                int q,w,e;
                for(int i=0;i<1;i++){
                    for ( q=1;q<=14;q++){
                        System.out.println(q+"KIRMIZI KİTAP");


                    }
                    for(w=q;w<=28;w++){
                        System.out.println(w+"YEŞİL KİTAPLAR");

                    }
                    for (e=28; e<=42;e++){
                        System.out.println(e +"MAVİ KİTAPLAR");
                    }
                    break;
                }


        }

        QuestFour questFour =new QuestFour();
        questFour.run();
    }
}
