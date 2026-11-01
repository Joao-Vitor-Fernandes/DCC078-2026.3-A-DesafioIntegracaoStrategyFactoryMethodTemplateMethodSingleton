package padroes.integracao;

public class EsquemaTresDoses implements EsquemaDose {

    public int getTotalDoses() {
        return 3;
    }

    public int calcularIntervaloDias(int dosesAplicadas) {
        if (dosesAplicadas == 1) {
            return 30;
        }
        else if (dosesAplicadas == 2) {
            return 150;
        }
        else {
            return 0;
        }
    }
}
