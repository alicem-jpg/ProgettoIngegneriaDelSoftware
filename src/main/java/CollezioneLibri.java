import java.util.ArrayList;
import java.util.List;
//COMPOSITE
public class CollezioneLibri implements LibroIF{
    private String nomeCollezione;
    private List<LibroIF> elem = new ArrayList<>();
    public CollezioneLibri(String nomeCollezione){
        this.nomeCollezione = nomeCollezione;
    }
    public void aggiungiLibro(LibroIF componente){
        elem.add(componente);
    }
    public void rimuoviLibro(LibroIF componente){
        elem.remove(componente);
    }
    @Override
    public void info() {
        for(LibroIF componente :elem){
        componente.info();
    }
    }

    @Override
    public List<LibroIF> ottieniLibri() {
        List<LibroIF> ret = new ArrayList<>();
        for(LibroIF componente :elem){
            ret.addAll(componente.ottieniLibri());
        }
        return ret;
    }
}
