package padroes.integracao;

public class EsquemaDuasDoses implements EsquemaDose {

    public int getTotalDoses() {
        return 2;
    }

    public int calcularIntervaloDias(int dosesAplicadas) {
        if (dosesAplicadas == 1) {
            return 180;
        }
        else {
            return 0;
        }
    }
}
