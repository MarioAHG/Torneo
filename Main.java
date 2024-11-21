import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;

class Main {
 
    public static void main(String[] args) {
        String [] datav = condition.Condiciones(args);
        String[] cats=condition.Categories(Integer.parseInt(datav[3]));
        ArrayList<jugador> Players = new ArrayList<>();
        String[] opciones = new String[] { ":Para agregar jugador", ":Para quitar jugador", ":Para crear categoría",":Para ver horarios",":Para cerrar" };
        for(int i=0;i<opciones.length;i++){
            System.out.println((i+1)+opciones[i]);
        }
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        switch (option) {
            case "1":
                //ArrayList<jugador> A = new ArrayList<>();
                String [] data = new String[3];
                for(int i=0;i<3;i++){
                    //AQUÍ FALTA PONERLE AL USUARIO QUE PONER DEL JUGADOR
                    Scanner read = new Scanner(System.in);
                    String line = read.nextLine();
                    data[i]=line;
                }
                Players.add(new jugador(data[0], data[1], data[2]));
                System.out.println(option+"was selected");
                break;
            case "2":
            System.out.println(option+"was selected");
                break;
            case "3":
            System.out.println(option+"was selected");
                break;
            case "4":
            System.out.println(option+"was selected");
                break;
            case "5":
            System.out.println(option+"was selected");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    // public static jugador inputJ(){
    //     jugador jSubmit = new jugador();
    //     System.out.println("Ingrese el nombre del jugador");
    //     //jugadores[0] = jSubmit;
    //     return jSubmit;
    // }

    // public static String readTer() {

    //     try (InputStreamReader reader = new InputStreamReader(System.in);
    //             BufferedReader bf = new BufferedReader(reader);) {
    //         String read = "";
    //         read = bf.readLine();
    //         return read;
    //     } catch (IOException e) {
    //         System.out.println("Alert-----Unexpected Error(1-IOException)");
    //     }
    //     System.out.println("Alert-----Unexpected Error(2-Nothing_Founded)");
    //     return "";
    // }
}