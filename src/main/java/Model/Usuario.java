package Model;

import java.text.ParseException;

public class Usuario extends Pessoa {
    
    private String senha;
    private String nivelAcesso;

    public Usuario(int id,  String nome, char sexo, String dataNascimento, String telefone, String email, String RG, String senha,String nivelAcesso) {
        super(id, nome, sexo, dataNascimento, telefone, email, RG);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }
    
    
    public Usuario(int id, String nome, String senha){
        super(id, nome);
        this.senha = senha;     
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
    
}