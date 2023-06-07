package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author Samuel
 */
public class Main {
    public static void main(String[] args){
        
        Servico barba = new Servico(1, "barba", 28) ;
        
        System.out.println(barba.getDescricao());
        System.out.println(barba.getValor());

        Usuario usuario = new Usuario(1, "barbeiro1", "senha");
        System.out.println(usuario.getNome());   
    }
}
