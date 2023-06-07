package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;
import java.util.HashSet;


public class LoginController {
    
    private final Login view;
    private LoginHelper helper;
    
    public LoginController(Login view){
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei tarefa");
    }
    
    public void entrarNoSistema(){
        //pegar o Usuario da view
        Usuario usuario = helper.obterModelo();
        //pesquisa Usuario no Banco de Dados
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        //Se o usuario da view tiver mesmo usuario e senha que o usuario vindo do BD, direcionar para o menu
        if (usuarioAutenticado != null){
            //navegar para menu principal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            view.dispose();
            
        }
        else{
            view.exibeMensagem("Usuário e senha inválidos");
        }
    }
        //Senão mostra uma mensagem ao usario "Usuário ou senha invalidos"
}
