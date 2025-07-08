
public class Escuela extends InstitucionEducativa {

    public Escuela(String nombre, int est) {
        super(nombre, est);
    }

    @Override
    public double calcularCostoMatricula() {
        return estudiantes * 25.5;
    }
}
