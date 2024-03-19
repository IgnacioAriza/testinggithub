public class Empleado{
    private String nombre;

    //constructor
    public Empleado(){

    }

    public Empleado(String nombre){
        this.nombre = nombre;
    }

    //getters/setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString(){
        return "empleado string test";
    }
}