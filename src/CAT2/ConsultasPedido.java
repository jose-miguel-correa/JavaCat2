
package CAT2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultasPedido extends Conexion{
    
    public boolean registrar(Solicitud pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO pedido VALUES(?,?,?,?,?,?,?,?,?)";
        
        try{
            
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getId_pedido());
            ps.setString(2, pro.getNombre_cliente());
            ps.setString(3, pro.getApellido_cliente());
            ps.setString(4, pro.getDireccion_cliente());
            ps.setString(5, pro.getFecha_pedido());
            ps.setString(6, pro.getTipo_pack());
            ps.setInt(7, pro.getCantidad());
            ps.setString(8, pro.getA_domicilio());
            ps.setInt(9, pro.getTotal());
            ps.execute();
            return true;
            
    } catch(SQLException e){
        System.err.println(e);
        return false;
    } finally{
            try{
                con.close();
            } catch(SQLException e) {
                System.err.println(e);
            }
        }
}
    
    public boolean modificar(Solicitud pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE pedido SET "
                + "id_pedido=?,"
                + "nombre_cliente=?,"
                + "apellido_cliente=?,"
                + "direccion_cliente=?,"
                + "fecha_pedido=?,"
                + "tipo_pack=?,"
                + "cantidad=?,"
                + "a_domicilio=? WHERE id_pedido=?";
        
        try{
            
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getId_pedido());
            ps.setString(2, pro.getNombre_cliente());
            ps.setString(3, pro.getApellido_cliente());
            ps.setString(4, pro.getDireccion_cliente());
            ps.setString(5, pro.getFecha_pedido());
            ps.setString(6, pro.getTipo_pack());
            ps.setInt(7, pro.getCantidad());
            ps.setString(8, pro.getA_domicilio());
            ps.setInt(9, pro.getTotal());
            
            ps.execute();
            return true;
            
    } catch(SQLException e){
        System.err.println(e);
        return false;
    } finally{
            try{
                con.close();
            } catch(SQLException e) {
                System.err.println(e);
            }
        }
}
    
    public boolean eliminar(Solicitud pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "DELETE FROM pedido WHERE id_pedido =?";
        
        try{
            
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getId_pedido());
            
            ps.execute();
            return true;
            
    } catch(SQLException e){
        System.err.println(e);
        return false;
    } finally{
            try{
                con.close();
            } catch(SQLException e) {
                System.err.println(e);
            }
        }
}
    
    public boolean buscar(Solicitud pro) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "SELECT * FROM pedido where id_pedido=?";
        
        try{
            
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getId_pedido());
            rs = ps.executeQuery();
            
            if(rs.next()) {
                pro.setId_pedido(rs.getString("id_pedido"));
                pro.setNombre_cliente(rs.getString("nombre_cliente"));
                pro.setApellido_cliente(rs.getString("apellido_cliente"));
                pro.setDireccion_cliente(rs.getString("direccion_cliente"));
                pro.setFecha_pedido(rs.getString("fecha_pedido"));
                pro.setTipo_pack(rs.getString("tipo_pack"));
                pro.setCantidad(rs.getInt("cantidad"));
                pro.setA_domicilio(rs.getString("a_domicilio"));
                pro.setTotal(rs.getInt("total"));
                
                return true;
                
            }
            
            return false;
            
    } catch(SQLException e){
        System.err.println(e);
        return false;
    } finally{
            try{
                con.close();
            } catch(SQLException e) {
                System.err.println(e);
            }
        }
}
    
    
    
}
