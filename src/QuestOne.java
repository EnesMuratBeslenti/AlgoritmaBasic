import java.util.Scanner;

public class QuestOne {
    public void run (){
        int Row, Col, Num1, Num2;
        int p1 = 0;
        int p2 = 0;
        char Move;
        boolean Running = true;
        Scanner input = new Scanner(System.in);
        String dizi[][] = new String[3][3];
        dizi[p1][p2] = "x";
        print(dizi);
        while (Running) {
            Move = input.next().charAt(0);
            switch (Move) {
                case 'w':
                case 'W':
                    dizi[p1][p2] = "-";
                    dizi[--p1][p2] = "x";
                    print(dizi);
                    break;
                case 's':
                case 'S':
                    dizi[p1][p2] = "-";
                    dizi[++p1][p2] = "x";
                    print(dizi);
                    break;
                case 'd':
                case 'D':
                    dizi[p1][p2] = "-";
                    dizi[p1][++p2] = "x";
                    print(dizi);
                    break;
                case 'a':
                case 'A':
                    dizi[p1][p2] = "-";
                    dizi[p1][--p2] = "x";
                    print(dizi);
                    break;
                case 'l':
                case 'L':
                    Running = false;
                    input.close();
                    break;
                default:
                    System.out.print("Please Press Proper Keys!");
                    break;
            }
        }


    }
    private static void print(String[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int x = 0; x < grid[0].length; x++) {
                System.out.print(grid[i][x] + "\t");
            }
            System.out.println();
        }
    }


}
