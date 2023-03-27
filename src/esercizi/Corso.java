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
    public int votoMinimo() {
        int minimo;
        minimo = esami.get(0).getVoto();
        for (Esame esame : esami) {
            int voto = esame.getVoto();
            if(minimo > voto){
                minimo = voto;
            }
        }
        return minimo;
    }

    public ArrayList<String> studentiPeggiori(){
        int votoMinimo = votoMinimo();
        ArrayList<String> cognomiPeggiori = new ArrayList<String>();
        for(int i = 0; i < esami.size(); i ++){
            Esame esame = esami.get(i);
            if(esame.getVoto() == votoMinimo){
                cognomiPeggiori.add(esame.getCognome());
            } 
        }

        return cognomiPeggiori;
    }
}
