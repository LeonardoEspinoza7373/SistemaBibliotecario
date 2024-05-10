public class Biblioteca {
    private int idBiblioteca;
    private String nombre;
    private String direccion;

    // Relaciones
    private Usuario[] usuarios;
    private ItemsBiblioteca[] itemsBiblioteca;


    // Constructor
    public Biblioteca(int idBiblioteca, String nombre, String direccion) {
        this.idBiblioteca = idBiblioteca;
        this.nombre = nombre;
        this.direccion = direccion;
    }


    // Métodos

    public void agregarItemBiblioteca(ItemsBiblioteca itemBiblioteca) {
        // Agregar item a la lista de items
    }

    public void eliminarItemBiblioteca(ItemsBiblioteca itemBiblioteca) {
        // Eliminar item de la lista de items
    }

    public void buscarItemBiblioteca(ItemsBiblioteca itemBiblioteca) {
        // Buscar item en la lista de items
    }

    public void prestarItem(ItemsBiblioteca itemBiblioteca, Usuario usuario) {
        // Prestar item a usuario
    }

    public void devolverItem(ItemsBiblioteca itemBiblioteca, Usuario usuario) {
        // Devolver item a biblioteca
    }

    public void reservarItem(ItemsBiblioteca itemBiblioteca, Usuario usuario) {
        // Reservar item
    }

    public void cancelarReserva(ItemsBiblioteca itemBiblioteca, Usuario usuario) {
        // Cancelar reserva
    }

    public void reporteDePrestamos() {
        // Generar reporte de prestamos
    }

    // HASTA AQUI VAN LOS METODOS


    // Getters y Setters

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdBiblioteca() {
        return idBiblioteca;
    }

    public void setIdBiblioteca(int idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }

    public ItemsBiblioteca[] getItemsBiblioteca() {
        return itemsBiblioteca;
    }

    public void setItemsBiblioteca(ItemsBiblioteca[] itemsBiblioteca) {
        this.itemsBiblioteca = itemsBiblioteca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    //
}
