
package CAT2;


public class Main {

    public static void main(String[] args) {
        
        Solicitud mod = new Solicitud();
        ConsultasPedido modC = new ConsultasPedido();
        Formulario frm = new Formulario();
        
        Controladores ctrl = new Controladores(mod, modC, frm);
        
        ctrl.iniciar();
        frm.setVisible(true);
        
        
    }
    
}
