import java.util.Scanner;

public class QuestTwo {
    public  void run() {
         int sayac=0;
            String[] words= {"kadir","ilker","murat","burak","turan","sezer","ahmet","mehmet","yılmaz","fatih"};
            int index=(int)(Math.random()*words.length);
            String selectedWord=words[index];
            StringBuilder myWord=setCharToPass(selectedWord);
            Scanner scan=new Scanner(System.in);
            while(sayac<=4)
            {
                System.out.println("Bir harf söyle");
                String selChar=scan.next();
                int i=selectedWord.indexOf(selChar);
                for(int k=0;k<selectedWord.length();k++)
                {

                    i=selectedWord.indexOf(selChar,i+1);

                    if(i>=0)

                    {
                        changeCharacter(i, myWord, selChar);
                    }
                }

                System.out.println(myWord);
                if(myWord.toString().equals(selectedWord)) {

                    sayac=selectedWord.length()+2;
                }

                sayac++;
            }
            finalState(myWord,selectedWord);

               Menu menu = new Menu();
               menu.main(null);

        }

        public static void finalState(StringBuilder  myWord,String selectedWord) {

            if( myWord.toString().equals(selectedWord)) {


                System.out.println("Tebrikler Bildin ");
            }
            else
            {

                System.out.println("Maalesef Bilemedin Tekrar Denemen lazım");
            }


        }

        public static StringBuilder setCharToPass(String word) {
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<word.length();i++) {
                sb.append("_");
            }
            return sb;

        }

        public static void changeCharacter(int Position,StringBuilder sb,String character) {
            sb.replace(Position, Position+1, character);


        }


}
