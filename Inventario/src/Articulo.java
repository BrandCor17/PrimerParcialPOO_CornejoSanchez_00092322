package inventario;

import javax.sql.rowset.spi.SyncResolver;

public abstract class Articulo{
    private String nombre;
    private String modelo;
    private String descripcion;
    private double precio;
    private String id;

    public Articulo(String nombre, String modelo, String descripcion, double precio, String  id) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.id = id;

    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }
    public String getId(){
        return  descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setId(String id){
        this.id = id;
    }
}