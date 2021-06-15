
package CAT2;

public class Solicitud {
        
    private String id_pedido;
    private String nombre_cliente;
    private String apellido_cliente;
    private String direccion_cliente;
    private String fecha_pedido;
    private String tipo_pack;
    private int cantidad;
    private String a_domicilio;
    private int total;

    public Solicitud(String id_pedido, String nombre_cliente, String apellido_cliente, String direccion_cliente, String fecha_pedido, String tipo_pack, int cantidad, String a_domicilio, int total) {
        this.id_pedido = id_pedido;
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.direccion_cliente = direccion_cliente;
        this.fecha_pedido = fecha_pedido;
        this.tipo_pack = tipo_pack;
        this.cantidad = cantidad;
        this.a_domicilio = a_domicilio;
        this.total = total;
    }

    Solicitud() {
           }

    public String getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(String id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public String getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(String fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public String getTipo_pack() {
        return tipo_pack;
    }

    public void setTipo_pack(String tipo_pack) {
        this.tipo_pack = tipo_pack;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getA_domicilio() {
        return a_domicilio;
    }

    public void setA_domicilio(String a_domicilio) {
        this.a_domicilio = a_domicilio;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    
    
    
}

