import java.sql.SQLOutput;
import java.util.Scanner;

public class QuestThree {
    public void run() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String kelime = scan.next();
        System.out.println("0:ANA MENÜ");
        System.out.println("1:Girilen Harfin ilk yeri");
        System.out.println("2:GİRİLEN HARFİN SON YERİ");
        System.out.println("3:GİRİLEN HARFTEN KAÇTANE VAR");
        System.out.println("4:GİRİLEN ARALIKTA YAZDIRMA");
        Scanner girdi = new Scanner(System.in);
        int secim = girdi.nextInt();
        switch (secim){
            case 0:
                Menu menu = new Menu();
                menu.main(null);
                break;
            case 1:
                System.out.println("LÜTFEN HARF GİRİNİZ");
                CharSequence girilenharf =scan.next();
                if(kelime.contains(girilenharf.toString())){
                    System.out.println("Girlen harfin ilk karşılaşıldığı yer :  "+ (kelime.indexOf(girilenharf.toString())+1));

                    QuestThree questThree = new QuestThree();
                    questThree.run();
                }

                break;
            case 2:
                System.out.println("LÜTFEN HARF GİRİNİZ");
                CharSequence girilenharff =scan.next();
                if(kelime.contains(girilenharff.toString())){
                    System.out.println("Girlen harfin ilk karşılaşıldığı yer :  "+ (kelime.lastIndexOf(girilenharff.toString())+1));

                    QuestThree questThree = new QuestThree();
                    questThree.run();
                }

                break;
            case 3:
                System.out.print("Bir harf giriniz: ");
                char harf = scan.next().charAt(0);
                int sayac = 0;
                for(int i = 0; i < kelime.length(); i++)
                {
                    if(kelime.charAt(i) == harf) {
                        sayac++;
                    }

                }

                System.out.println("Girdiginizkelımede " + sayac + " tane '" + harf + "' vardır");
                QuestThree questThree = new QuestThree();
                questThree.run();
            break;

            case 4:
                System.out.println("LÜTFEN İLK SAYIYI GİRİNİZ");
                int sayı =scan.nextInt();
                System.out.println("LÜTFEN İKİNCİ SAYIYI GİRİNİZ");
                int sayı2= scan.nextInt();
                System.out.println("SECİLEN ARALIKTAKİ HARFLER           :" +kelime.substring(sayı,sayı2));
              if(sayı2==0){

                  System.out.println(kelime);

                  QuestThree questThree1 = new QuestThree();
                  questThree1.run();}
              else if(sayı==0 && sayı2==0){
                  System.out.println(kelime);

                  QuestThree questThree2 = new QuestThree();
                  questThree2.run();}

              break;
        }


    }
}


