package esercizi;

import java.util.ArrayList;
public class Corso {
    private String nome;
    private ArrayList<Esame> esami;

    public Corso(){

    }

    public Corso(String nome, ArrayList<Esame> esami){
        this.nome = nome;
        this.esami = esami;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Esame> getEsami() {
        return esami;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEsami(ArrayList<Esame> esami) {
        this.esami = esami;
    }


}
