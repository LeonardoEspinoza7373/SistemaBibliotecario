public class ItemsBiblioteca {
    //atributos
    protected String titulo;
    protected String autor;
    protected int añoPublicacion;
    protected String editorial;
    protected char numeroEdicion;
    protected String genero;


    //relaciones
    private Biblioteca biblioteca;
    private Usuario usuarios;

    //metodos
    public void mostrarDetalles() {
        // Mostrar detalles del item
    }

    public void mostrarDisponibilidad() {
        // Mostrar disponibilidad del item
    }

    public void penalizacionPorDevolucion() {
        // Calcular penalización por devolución
    }

    public void buscarItemsPorEtiquetas() {
        // Buscar items por etiquetas
    }

    public void tiempoEsperaPorReserva() {
        // Calcular tiempo de espera por reserva
    }

    // Getters y Setters


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public char getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(char numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Usuario getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario usuarios) {
        this.usuarios = usuarios;
    }

}

