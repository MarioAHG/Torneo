import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;

class Main {
    static String[] options = new String[] {"Canchas disponibles", "Hora de inicio", "Dias de duración"};
    public static void Condiciones(String[] args) {
        String[] cond = new String[3];
        System.out.println("Ponga las siguientes condiciones:");
        for (int i = 0; i < options.length; i++) {
            System.out.println(options[i]);
            Scanner rr = new Scanner(System.in);
            String ss = rr.nextLine();
            cond[i] = ss;

        }
    }

    public static void main(String[] args) {
        Condiciones(args);
        // jugador[] jugadores = new jugador[4];
        // Scanner sc = new Scanner(System.in);
        // String option = sc.nextLine();
        // switch (option) {
        //     case "1":
        //         //ArrayList<jugador> A = new ArrayList<>();
        
        //         //A.add();
        //         break;
        //     case "2":

        //         break;
        //     case "3":

        //         break;
        //     default:
        //         System.out.println("Error");
        //         break;
        // }
    }

    public static jugador inputJ(){
        jugador jSubmit = new jugador();
        System.out.println("Ingrese el nombre del jugador");
        //jugadores[0] = jSubmit;
        return jSubmit;
    }

    public static String readTer() {

        try (InputStreamReader reader = new InputStreamReader(System.in);
                BufferedReader bf = new BufferedReader(reader);) {
            String read = "";
            read = bf.readLine();
            return read;
        } catch (IOException e) {
            System.out.println("Alert-----Unexpected Error(1-IOException)");
        }
        System.out.println("Alert-----Unexpected Error(2-Nothing_Founded)");
        return "";
    }
}