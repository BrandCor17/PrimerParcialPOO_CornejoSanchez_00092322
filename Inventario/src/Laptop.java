public class Laptop extends inventario.Articulo {
    private String tipo;
    private boolean camara;


    public Laptop(String nombre, String modelo, String descripcion, double precio, String id, String tipo, boolean camara) {
        super(nombre, modelo, descripcion, precio, id);
        this.tipo= tipo;
        this.camara = camara;
    }
//Getters
    public String getTipo() {
        return tipo;
    }

    public boolean isCamara() {
        return camara;
    }

    //Setters

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCamara(boolean camara) {
        this.camara = camara;
    }
}
