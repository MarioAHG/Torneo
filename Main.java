import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class Main {
    
    public static void main(String[] args){
        jugador[] jugadores = new jugador[0];
    }

    
    public static jugador inputJ(){
        jugador jSubmit = new jugador();
        System.out.println("Ingrese el nombre del jugador" + ;);
        jugadores[0] = jSubmit;
        return jSubmit;
    }

    public 

    public static String readTer(){
       
       
        try(InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(reader);
        ){
            String read = "";
            read = bf.readLine();
            return read;
        } catch (IOException e){
            System.out.println("Alert-----Unexpected Error(1-IOException)");
        }
        System.out.println("Alert-----Unexpected Error(2-Nothing_Founded)");
        return "";
    }
}