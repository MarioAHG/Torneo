import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

class Main {

    public static void main(String[] args) {
        int cerrar=0;
        String [] datav = condition.Condiciones(args);
        //Arreglo de categorías
        String[] cats=condition.Categories(Integer.parseInt(datav[3]));
        //Arreglo de jugadores
        HashMap<String, ArrayList<jugador>> categoriasMap = new HashMap<>();
        for (String cat : cats) {
            categoriasMap.put(cat, new ArrayList<>());
        }

        ArrayList<jugador> Players = new ArrayList<>();
     
        while(cerrar==0){
            String[] opciones = new String[] { ":Para agregar jugador", ":Para quitar jugador",":Para ver horarios",":Para cerrar" };
            for(int i=0;i<opciones.length;i++){
                System.out.println((i+1)+opciones[i]);
            }
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();
        switch (option) {
            case "1":
                //ArrayList<jugador> A = new ArrayList<>();
                String [] data = new String[3];
                String[] dataP=jugador.dataPlayer;
                System.out.println("Ponga lo siguiente del jugador");
                for(int i=0;i<3;i++){
                    System.out.println(dataP[i]);
                    Scanner read = new Scanner(System.in);
                    String line = read.nextLine();
                    data[i]=line;
                }
                jugador jg = new jugador(data[0], data[1], data[2]);
                Players.add(jg);
                for (String cat: cats){
                    ArrayList<jugador> temp = categoriasMap.get(cat);
                    if(jg.cat.equals(cat)){
                        temp.add(jg);
                        categoriasMap.put(data[1], temp);
                    }
                }
                utils.writeToFile("jugador.csv", jg.toData());
                System.out.println(option+"was selected");
                break;
            case "2":
            Scanner scan = new Scanner(System.in);
            String jugadorParaEliminar = scan.nextLine();
            String linea;
            FileReader f;
            int aa=0;
            try {
                f = new FileReader("jugador.csv");
                BufferedReader b = new BufferedReader(f);
                while ((linea = b.readLine()) != null&&aa==0) {
                    if(linea.indexOf(jugadorParaEliminar)!=-1){
                        ///////////////////////////////////////////////
                        aa=0;

                    }                    
                }
                b.close();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                System.out.println("Error");
    
            }
            System.out.println(option+"was selected");
                break;
            case "3":
            System.out.println(option+"was selected");
                break;
            case "4":
            System.out.println(option+"was selected");
            cerrar=1;
                break;
            default:
                System.out.println("Error");
                break;
        }}
    }

    // public static jugador inputJ(){
    // jugador jSubmit = new jugador();
    // System.out.println("Ingrese el nombre del jugador");
    // //jugadores[0] = jSubmit;
    // return jSubmit;
    // }

    // public static String readTer() {

    // try (InputStreamReader reader = new InputStreamReader(System.in);
    // BufferedReader bf = new BufferedReader(reader);) {
    // String read = "";
    // read = bf.readLine();
    // return read;
    // } catch (IOException e) {
    // System.out.println("Alert-----Unexpected Error(1-IOException)");
    // }
    // System.out.println("Alert-----Unexpected Error(2-Nothing_Founded)");
    // return "";
    // }
}