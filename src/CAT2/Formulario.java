
package CAT2;

//import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

//import java.util.ArrayList;
//import javax.swing.table.DefaultTableModel;

public class Formulario extends javax.swing.JFrame {

    //public Formulario() {
    //    initComponents();
    //}
    
    //ArrayList<Solicitud> misPedidos = new ArrayList<Solicitud>();
    
    public Formulario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblDireccion = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        btnIngresarPedido = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblAdomicilio = new javax.swing.JLabel();
        cmbTipoPack = new javax.swing.JComboBox<>();
        rdoNo = new javax.swing.JRadioButton();
        rdoSi = new javax.swing.JRadioButton();
        lblTipoPack = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        cmbCantidad = new javax.swing.JComboBox<>();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblDireccion.setText("Dirección");

        lblApellido.setText("Apellido");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblId.setText("ID");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre");

        btnIngresarPedido.setText("Ingresar Pedido");
        btnIngresarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarPedidoActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.setPreferredSize(new java.awt.Dimension(109, 23));

        jButton2.setText("Modificar");
        jButton2.setPreferredSize(new java.awt.Dimension(109, 23));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");

        lblFecha.setText("Fecha");

        txtFecha.setText("yyyy/mm/dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDireccion)
                            .addComponent(lblNombre)
                            .addComponent(lblId))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApellido)
                            .addComponent(txtNombre)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblFecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))))
                    .addComponent(lblApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                        .addComponent(btnIngresarPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresarPedido)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion)
                    .addComponent(btnLimpiar)
                    .addComponent(jButton3))
                .addGap(20, 20, 20))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblAdomicilio.setText("A domicilio");

        cmbTipoPack.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carga Básica: Hasta 8 Kg.", "Carga Media: 9 Kg. - 12 Kg.", "Carga Full: 13 Kg. - 16 Kg." }));

        buttonGroup1.add(rdoNo);
        rdoNo.setText("No");
        rdoNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoSi);
        rdoSi.setText("Sí");
        rdoSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoSiActionPerformed(evt);
            }
        });

        lblTipoPack.setText("Tipo Pack");

        lblCantidad.setText("Cantidad");

        cmbCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", " " }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAdomicilio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdoSi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdoNo)
                .addGap(45, 45, 45)
                .addComponent(lblTipoPack)
                .addGap(18, 18, 18)
                .addComponent(cmbTipoPack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(lblCantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTipoPack)
                        .addComponent(cmbTipoPack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAdomicilio)
                        .addComponent(rdoSi)
                        .addComponent(rdoNo)
                        .addComponent(lblCantidad)
                        .addComponent(cmbCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Sistema Gestión de Packs - LavaSoft");

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
        );

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Dirección", "Fecha", "Tipo Pack", "Cantidad", "A domicilio", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnIngresarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarPedidoActionPerformed

        DefaultTableModel tableModel = new DefaultTableModel();
                
//        String[] columnas = {"RUT","NOMBRE","PATENTE","FECHA","TIPO LAVADO","TOTAL"};
//        
//        tableModel.setColumnIdentifiers(columnas);
        
//        Solicitud elLavado = new Solicitud(
//                this.txtRut.getText(),
//                this.txtNombre.getText(),
//                this.txtPatente.getText(),
//                this.txtFecha.getText(),
//                this.cmbTipoLavado.getSelectedItem().toString(),
//                Integer.parseInt(this.txtTotal.getText())
//                
//        );
//        
//        miLavado.add(elLavado);
//                
//        for(Lavado p:miLavado) {
//            Object[] fila = new Object[6];
//            fila[0] = p.getRut();
//            fila[1] = p.getNombre();
//            fila[2] = p.getPatente();
//            fila[3] = p.getFecha();
//            fila[4] = p.getTipolavado();
//            fila[5] = p.getTotal();
//            tableModel.addRow(fila);
//            }
        
        this.tblTabla.setModel(tableModel);
//        
//        if(
//                this.txtId.getText().isEmpty() || 
//                this.txtNombre.getText().isEmpty() || 
//                this.txtApellido.getText().isEmpty() || 
//                this.txtDireccion.getText().isEmpty() ||
//                this.txtFecha.getText().isEmpty() ||
//                this.cmbCantidad.getSelectedItem().equals("")||
//                this.cmbTipoPack.getSelectedItem().equals("") ){
//            JOptionPane.showMessageDialog(null, "¡Faltan Datos Por Llenar!","¡ATENCIÓN!",
//                    JOptionPane.WARNING_MESSAGE);
//        }
//        else{
//            int cantidad = 0, valor_pack = 0, total = 0;
//            
//            cantidad = Integer.parseInt(this.cmbCantidad.getSelectedItem().toString());
//            
//            if(this.cmbTipoPack.getSelectedItem().equals("Carga Básica")) {
//                valor_pack = 7500;
//            }
//            else if(this.cmbTipoPack.getSelectedItem().equals("Carga Media")){
//                valor_pack = 9990;
//            }
//            else if(this.cmbTipoPack.getSelectedItem().equals("Carga Full")){
//                valor_pack = 12990;
//                            }
//            
//            total = valor_pack*cantidad;
//            this.txtTotal.setText(String.valueOf(total));
//            
//        }
//                
//        DefaultTableModel tableModel = new DefaultTableModel();
//        
//        String[] columnas = {"ID","Nombre","Apellido","Dirección","Fecha","Total"};
//        
//        tableModel.setColumnIdentifiers(columnas);
//        
//        Solicitud miSolicitud = new Solicitud(
//                this.txtId.getText(),
//                this.txtNombre.getText(),
//                this.txtApellido.getText(),
//                this.txtDireccion.getText(),
//                this.txtFecha.getText(),           
//                Integer.parseInt(this.txtTotal.getText())
//                     
//        );
//        
//        for(Solicitud p:misPedidos) {
//            Object[] fila = new Object[7];
//            fila[0] = p.getId();
//            fila[1] = p.getNombre();
//            fila[2] = p.getApellido();
//            fila[3] = p.getDireccion();
//            fila[4] = p.getFecha();
//            fila[5] = p.getTotal();
//            tableModel.addRow(fila);
//            }
//        
//        tblTablaIngreso.setModel(tableModel);
//        
    }//GEN-LAST:event_btnIngresarPedidoActionPerformed

    private void rdoNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
            
            
        
            txtId.setText(null);
            txtNombre.setText(null);
            txtApellido.setText(null);
            txtDireccion.setText(null);
            txtFecha.setText("yyyy/mm/dd");
            cmbTipoPack.getSelectedItem();
            cmbTipoPack.setSelectedIndex(0);
            cmbCantidad.getSelectedItem();
            cmbCantidad.setSelectedIndex(0);
            this.buttonGroup1.clearSelection();
            //txtTotal.setText(null);
        
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void rdoSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoSiActionPerformed

    private void tblTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaMouseClicked
        PreparedStatement ps = null;
            ResultSet rs = null;
            
            try {
                
                Conexion objCon = new Conexion();
                Connection conn = objCon.getConexion();
                
                int Fila = tblTabla.getSelectedRow();
                String id_pedido = tblTabla.getValueAt(Fila, 0).toString();
                
                ps = conn.prepareStatement("SELECT id_pedido,"
                    + "nombre_cliente,"
                    + "apellido_cliente,"
                    + "direccion_cliente,"
                    + "fecha_pedido,"
                    + "tipo_pack,"
                    + "cantidad,"
                    + "a_domicilio,"
                    + "total FROM pedido WHERE id_pedido=?");
                ps.setString(1, id_pedido);
                rs = ps.executeQuery();
                
                rdoNo.setActionCommand("No");
                rdoSi.setActionCommand("Si");
                
                while (rs.next()) {
                    txtId.setText(rs.getString("id_pedido"));
                    txtNombre.setText(rs.getString("nombre_cliente"));
                    txtApellido.setText(rs.getString("apellido_cliente"));
                    txtDireccion.setText(rs.getString("direccion_cliente"));
                    txtFecha.setText(rs.getString("fecha_pedido"));
                    cmbCantidad.setSelectedIndex(rs.getInt("cantidad"));
                    buttonGroup1.setSelected(rs.getString("a_domicilio");
                    cmbTipoPack.setSelectedItem(rs.getString("tipo_pack"));
                    
                   
                    
                    
                }
                
            } catch(SQLException ex) {
                System.out.println(ex.toString());
                
            }
    }//GEN-LAST:event_tblTablaMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
        
            DefaultTableModel modelo = new DefaultTableModel();
            tblTabla.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            
            String sql = "SELECT id_pedido,"
                    + "nombre_cliente,"
                    + "apellido_cliente,"
                    + "direccion_cliente,"
                    + "fecha_pedido,"
                    + "tipo_pack,"
                    + "cantidad,"
                    + "a_domicilio,"
                    + "total FROM pedido";
                    
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Dirección");
            modelo.addColumn("Fecha");
            modelo.addColumn("Tipo Pack");
            modelo.addColumn("Cantidad");
            modelo.addColumn("A domicilio");
            modelo.addColumn("Total");
            
            
            while(rs.next()) {
                
                Object[] filas = new Object[cantidadColumnas];
                
                for(int i = 0; i< cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                
                modelo.addRow(filas);
            }
             
            
        
    } catch(SQLException ex){
        System.err.println(ex.toString());
        
    }
    }//GEN-LAST:event_formWindowOpened

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Formulario().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnIngresarPedido;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox<String> cmbCantidad;
    public javax.swing.JComboBox<String> cmbTipoPack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblAdomicilio;
    public javax.swing.JLabel lblApellido;
    public javax.swing.JLabel lblCantidad;
    public javax.swing.JLabel lblDireccion;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblId;
    public javax.swing.JLabel lblNombre;
    public javax.swing.JLabel lblTipoPack;
    public javax.swing.JRadioButton rdoNo;
    public javax.swing.JRadioButton rdoSi;
    private javax.swing.JTable tblTabla;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtFecha;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
