
public class Colegio extends InstitucionEducativa {

    public Colegio(String nombre, int est) {
        super(nombre, est);
    }

    @Override
    public double calcularCostoMatricula() {
        return estudiantes * 40.0;
    }
}
