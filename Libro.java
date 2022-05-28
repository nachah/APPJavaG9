public class Libro {
    private String titulo;
    private String autor;
    private int año;

    public Libro(String titulo, String autor,int año){
        this.titulo=titulo;
        this.autor=autor;
        this.año=año;
    }

    String getTitulo(){
        return this.titulo;
    }

    String getAutor(){
        return this.autor;
    }

    int getAño(){
        return this.año;
    }



}
