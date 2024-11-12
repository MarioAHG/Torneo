import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class Main {
    
    public static void main(String[] args){
        jugador o = new jugador();
        o.cats = new String[9];
        System.out.println(o.cats[0]);
    }

    public static String read(){
       
       
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