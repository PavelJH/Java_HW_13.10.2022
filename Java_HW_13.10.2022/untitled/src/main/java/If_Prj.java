import java.util.Scanner;

public class If_Prj {
    public static void main(String[] args) {
        int isWeekend = 1;
        int isRain = 2;

        System.out.print ("isWeekend - true/1 or False/2:  ");
        Scanner inputFigure = new Scanner (System.in);
        int a = inputFigure.nextInt ();
        System.out.print ("isRain - true/1 or False/2:  ");
        inputFigure = new Scanner(System.in);
        int b = inputFigure.nextInt ();
        if (a + b == 3) {
            System.out.println ("canWalk: False ");
        } else {
            System.out.println ("canWalk: true");
}
    }
}
//Добрй день, немного запутался с булями, так что удалось сделать лишь так.
