import java.util.Random;

public class FactoryLibroDefault implements FactoryLibro{
    @Override
    public Libro creaLibro(String titolo, String autore, int ISBN) {
        Libro libro = new Libro();
        libro.setTitolo(titolo);
        libro.setAutore(autore);
        libro.setISBN(ISBN);
        libro.setGenere("Generico");
        libro.setValutazione(0);
        libro.setStato(StatoLettura.DA_LEGGERE);
        return libro;
    }
}
