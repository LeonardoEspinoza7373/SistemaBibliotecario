public class Usuario {

    //atributos
    private int idUsuario;
    private String correoElectronico;
    private String direccion;

    //relaciones
    private Biblioteca biblioteca;
    private ItemsBiblioteca[] itemsBiblioteca;

    //constructor
    public Usuario(int idUsuario, String correoElectronico, String direccion) {
        this.idUsuario = idUsuario;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;

    }

    //metodos
    public void consultarPresatamos() {
        // Consultar prestamos
    }

    public void consultarReservas() {
        // Consultar reservas
    }

    public void consultarPenalizaciones() {
        // Consultar penalizaciones
    }

    // Getters y Setters

    public Biblioteca getBiblioteca() {

        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public ItemsBiblioteca[] getItemsBiblioteca() {
        return itemsBiblioteca;
    }

    public void setItemsBiblioteca(ItemsBiblioteca[] itemsBiblioteca) {
        this.itemsBiblioteca = itemsBiblioteca;
    }

}
