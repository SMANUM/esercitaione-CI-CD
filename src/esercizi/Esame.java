package esercizi;

public class Esame {

    private String matricola;
    private String cognome;
    private int voto;

    public Esame(){

    }

    public Esame(String matricola, String cognome,
                 int voto){
        this.matricola = matricola;
        this.cognome = cognome;
        this.voto = voto;
    }

    public String getMatricola() {
        return matricola;
    }

    public String getCognome() {
        return cognome;
    }

    public int getVoto() {
        return voto;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }
}