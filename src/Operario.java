public class Operario extends Empleado{
    private String especializacion;

    public Operario(){

    }

    public Operario(String nombre, String especializacion){
        super(nombre);
        this.especializacion = especializacion;

    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public
}