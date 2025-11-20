public class Libro{
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Metodo set
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setPaginas(int paginas){
        this.paginas = paginas;
    }

    // Metodo get
    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public int getPaginas(){
        return this.paginas;
    }

    public String toString(){
        return "Libro[Titulo:" + titulo + ", Autor: " + autor + ", Paginas: " + paginas + " ]";
    }
}