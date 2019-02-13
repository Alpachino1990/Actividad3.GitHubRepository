package libro;

/**
 *
 * @author Francisco Puga
 */
public class Libro {

    private int ISBN;
    private String Título;
    private String Autor;
    private int nPag;
    
    Libro (int i, String t, String a, int p){
        this.ISBN = i;
        this.Título = t;
        this.Autor = a;
        this.nPag = p;
    }
    
    public int getISBN() {
        return ISBN;
    }

    public String getTítulo() {
        return Título;
    }

    public String getAutor() {
        return Autor;
    }

    public int getnPag() {
        return nPag;
    }
    
    public String toString(){
        return "El "+getTítulo()+" con ISBN "+getISBN()+" escrito por el autor "+getAutor()+" tiene "+getnPag()+" páginas";
    }
}
