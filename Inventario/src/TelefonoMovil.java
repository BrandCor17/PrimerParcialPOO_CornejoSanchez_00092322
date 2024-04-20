public class TelefonoMovil extends inventario.Articulo {
    private int  ram;
    private int memInterna;


    public TelefonoMovil(String nombre, String modelo, String descripcion, double precio, String id,int ram, int memInterna) {
        super(nombre, modelo, descripcion, precio, id);
        this.ram = ram;
        this.memInterna = memInterna;
    }

    public int getRam() {
        return ram;
    }

    public int getMemInterna() {
        return memInterna;
    }

    //setters
    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setMemInterna(int memInterna) {
        this.memInterna = memInterna;
    }
}
