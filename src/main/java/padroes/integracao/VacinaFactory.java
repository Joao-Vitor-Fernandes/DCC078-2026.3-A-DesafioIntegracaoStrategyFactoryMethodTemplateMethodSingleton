package padroes.integracao;

public class VacinaFactory {

    public static IVacina obterVacina(String vacina) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroes.integracao.Vacina" + vacina);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Vacina inexistente");
        }
        if (!(objeto instanceof IVacina)) {
            throw new IllegalArgumentException("Vacina inválida");
        }
        return (IVacina) objeto;
    }
}
