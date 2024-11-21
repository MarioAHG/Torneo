import java.util.Scanner;

public class condition {
    static String[] requisitos = new String[] { "Canchas disponibles", "Hora de inicio", "Dias de duración","Número de categorías" };

    public static String[] Condiciones(String[] args) {
        String[] cond = new String[4];
        System.out.println("Ponga las siguientes condiciones:");
        for (int i = 0; i < requisitos.length; i++) {
            System.out.println(requisitos[i]);
            Scanner rr = new Scanner(System.in);
            String ss = rr.nextLine();
            cond[i] = ss;

        }
        return cond;
    }
    public static String[] Categories(int input) {
        String[] cats=new String[input];
        for (int i = 0; i < cats.length; i++) {
            System.out.println("Ponga el nombre de la categoría "+(i+1));
            Scanner rr = new Scanner(System.in);
            String ss = rr.nextLine();
            cats[i] = ss;

        }
        return cats;
    }

}
