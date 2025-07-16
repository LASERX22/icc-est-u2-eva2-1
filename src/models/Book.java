package models;

public class Book implements Comparable<Book>{
    private String titulo;
    private String autor;
    private int anio;
    public Book(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    @Override
    public int compareTo(Book o) {
        int comparacionTitulo=o.titulo.compareTo(this.titulo);
        if (comparacionTitulo!=0) {
            return comparacionTitulo;
        }
        return Integer.compare(anio, o.anio);

    }
    @Override
    public String toString(){
        return String.format("%s - %s (%d)",titulo,autor,anio);
    }
}