package Model;

public class Servico {
    
    private int id;
    private String Descricao;
    private float Valor;

    public Servico(int id, String Descricao, float Valor) {
        this.id = id;
        this.Descricao = Descricao;
        this.Valor = Valor;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
