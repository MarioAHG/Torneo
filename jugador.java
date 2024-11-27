public class jugador {
    String nombre;
    String cat;
    String puntaje;
    //boolean res;
    public jugador(String nombre, String cat, String puntaje){
        this.nombre = nombre;
        this.cat = cat;
        this.puntaje = puntaje;
    }
    public static String[] dataPlayer= new String[]{"Nombre:","Categoría","Puntaje:" };

    public String toData(){
        return this.nombre + "," + this.cat + "," + this.puntaje;
    }
}
