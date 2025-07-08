
public abstract class InstitucionEducativa {

    protected String nombre;
    protected int estudiantes;

    public InstitucionEducativa(String nombre, int est) {
        this.nombre = nombre;
        this.estudiantes = est;
    }

    public abstract double calcularCostoMatricula();

    public String getNombre() {
        return nombre;
    }
}
