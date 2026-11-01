package padroes.integracao;

public class EsquemaDoseUnica implements EsquemaDose {

    public int getTotalDoses() {
        return 1;
    }

    public int calcularIntervaloDias(int dosesAplicadas) {
        return 0;
    }
}
