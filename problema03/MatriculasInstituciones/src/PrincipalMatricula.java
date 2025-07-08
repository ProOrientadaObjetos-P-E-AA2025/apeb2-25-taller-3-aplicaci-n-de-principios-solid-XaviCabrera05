
import java.util.ArrayList;

public class PrincipalMatricula {

    public static void main(String[] args) {
        ArrayList<InstitucionEducativa> lista = new ArrayList<>();

        lista.add(new Escuela("Esc. Nac. Centro", 100));
        lista.add(new Colegio("Col. San Pedro", 60));
        lista.add(new Campamento("Camp. Vacacional Verano", 40));

        for (InstitucionEducativa inst : lista) {
            System.out.println(inst.getNombre() + " - Matricula Total: $" + inst.calcularCostoMatricula());
        }
    }
}
