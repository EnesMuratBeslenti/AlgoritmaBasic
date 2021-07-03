import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class QuestFive {
    static ArrayList<String> liste = new ArrayList<String>();
    public void Run(){
        boolean zarKontrol = true;
        while (zarKontrol) {
            Scanner soru = new Scanner(System.in);
            System.out.println(
                    "Yapmak istediğiniz işlemi seçiniz.\n 1.Zar at \n 2.Atılan Tüm zarları göster \n 3.Programı bitir");
            int cevap = soru.nextInt();
            if (cevap == 1) {
                System.out.println(zarAt());
            } else if (cevap == 2) {
                for (int i = 0; i < liste.size(); i++) {
                    System.out.println(liste.get(i));
                }
            } else {
                Menu menu = new Menu();
                menu.main(null);
            }
        }
        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }

    }
    public static String zarAt() {
        Random rnd = new Random();
        int zar1 = rnd.nextInt(5) +1;
        int zar2 = rnd.nextInt(5) +1;
        liste.add("İlk zar:" + zar1 + " İkinci zar: " + zar2);
        return ("İlk zar: " + zar1 + "İkinci zar: " + zar2);
    }

}

