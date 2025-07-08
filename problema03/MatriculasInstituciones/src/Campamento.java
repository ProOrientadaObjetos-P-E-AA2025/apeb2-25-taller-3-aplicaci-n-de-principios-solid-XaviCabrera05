
public class Campamento extends InstitucionEducativa {

    public Campamento(String nombre, int est) {
        super(nombre, est);
    }

    @Override
    public double calcularCostoMatricula() {
        return estudiantes * 15.0;
    }
}
