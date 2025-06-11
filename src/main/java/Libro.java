import java.util.List;

public class Libro implements LibroIF{
    private String titolo;
    private String autore;
    private String genere;
    private int ISBN;
    private StatoLettura stato;
    private int valutazione;
    public Libro(){}

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public StatoLettura getStato() {
        return stato;
    }

    public void setStato(StatoLettura stato) {
        this.stato = stato;
    }

    public int getValutazione() {
        return valutazione;
    }

    public void setValutazione(int valutazione) {
        this.valutazione = valutazione;
    }
//COMPOSITE
    @Override
    public void info() {
        System.out.println(titolo+ autore + "Stato di lettura: " + stato+ "Valutazione:" + valutazione );
    }

    @Override
    public List<LibroIF> ottieniLibri() {
        return List.of(this); //rivedi .of
    }
}