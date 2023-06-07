package Controller;

import Controller.Helper.MenuPrincipalHelper;
import View.Agenda;
import View.MenuPrincipal;

/**
 *
 * @author Samuel
 */
public class MenuPrincipalController {
    
    private final MenuPrincipal view;
    private MenuPrincipal helper;
    
    public MenuPrincipalController (MenuPrincipal view){
        this.view = view;
    }
    
    public void navegarParaAgenda() {
        
        Agenda agenda = new Agenda();
        agenda.setVisible(true);      
    }
}
