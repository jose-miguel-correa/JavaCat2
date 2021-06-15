
package CAT2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.ButtonModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.util.Enumeration;

public class Controladores implements ActionListener{
    
    private final Solicitud mod;
    private final ConsultasPedido modC;
    private final Formulario frm;
    
    /**
     *
     * @param mod
     * @param modC
     * @param frm
     */
    public Controladores(Solicitud mod, ConsultasPedido modC, Formulario frm) {
        
        this.mod = mod;
        this.modC = modC;
        this.frm = frm;
        this.frm.btnIngresarPedido.addActionListener(this);
        
    }
    
    public void iniciar() {
        frm.setTitle("Pedido");
        frm.setLocationRelativeTo(null);
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource() == frm.btnIngresarPedido){
            
            frm.rdoNo.setActionCommand("No");
            frm.rdoSi.setActionCommand("Si");
                       
        mod.setId_pedido(frm.txtId.getText());
            mod.setNombre_cliente(frm.txtNombre.getText());
                mod.setApellido_cliente(frm.txtApellido.getText());
                    mod.setDireccion_cliente(frm.txtDireccion.getText());
                        mod.setFecha_pedido(frm.txtFecha.getText());
                            mod.setTipo_pack((frm.cmbTipoPack.getSelectedItem().toString()));
                                mod.setCantidad(Integer.parseInt((frm.cmbCantidad.getSelectedItem().toString())));
                                    mod.setA_domicilio(frm.buttonGroup1.getSelection().getActionCommand());
                                        mod.setTotal(Integer.parseInt(frm.txtTotal.getText()));
                                        
                                        
                                        
        if(modC.registrar(mod)) {
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error al Guardar");
            limpiar();
        }
                                
    }
        
        if(e.getSource() == frm.btnLimpiar){
            limpiar();
                                
    }
        
    }

    /**
     *
     */
    public void limpiar() {
            frm.txtId.setText(null);
            frm.txtNombre.setText(null);
            frm.txtApellido.setText(null);
            frm.txtDireccion.setText(null);
            frm.txtFecha.setText(null);
            frm.cmbTipoPack.getSelectedItem();
            frm.cmbTipoPack.setSelectedIndex(0);
            frm.cmbCantidad.getSelectedItem();
            frm.cmbCantidad.setSelectedIndex(0);
            frm.rdoNo.setSelected(false);
            frm.rdoSi.setSelected(false);
            frm.txtTotal.setText(null);
//            this.cmbTipoLavado.getSelectedItem();
//            this.radCargoAdicional.setSelected(false);
//            this.cmbTipoLavado.setSelectedIndex(0);
           
        }
    
}
