package Model;

import java.text.ParseException;


public class Cliente extends Pessoa {
    
    protected String endereco;
    protected String cep;

    public Cliente(String cep, String endereco, String nome, int id) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }
    public Cliente(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String RG, String endereco, String cep) throws ParseException {
        super(id, nome, sexo, dataNascimento, telefone, email, RG);
        this.endereco = endereco;
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
}

   
