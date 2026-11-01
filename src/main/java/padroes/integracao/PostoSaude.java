package padroes.integracao;

public class PostoSaude {

    private PostoSaude() {};
    private static PostoSaude instance = new PostoSaude();
    public static PostoSaude getInstance() {
        return instance;
    }

    private String nomePosto;
    private String profissionalResponsavel;
    private int estoqueGripe;
    private int estoqueHPV;
    private int estoqueFebreAmarela;

    public String getNomePosto() {
        return nomePosto;
    }

    public void setNomePosto(String nomePosto) {
        this.nomePosto = nomePosto;
    }

    public String getProfissionalResponsavel() {
        return profissionalResponsavel;
    }

    public void setProfissionalResponsavel(String profissionalResponsavel) {
        this.profissionalResponsavel = profissionalResponsavel;
    }

    public int getEstoqueGripe() {
        return estoqueGripe;
    }

    public void setEstoqueGripe(int estoqueGripe) {
        this.estoqueGripe = estoqueGripe;
    }

    public int getEstoqueHPV() {
        return estoqueHPV;
    }

    public void setEstoqueHPV(int estoqueHPV) {
        this.estoqueHPV = estoqueHPV;
    }

    public int getEstoqueFebreAmarela() {
        return estoqueFebreAmarela;
    }

    public void setEstoqueFebreAmarela(int estoqueFebreAmarela) {
        this.estoqueFebreAmarela = estoqueFebreAmarela;
    }
}
