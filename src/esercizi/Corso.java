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
        int minimo = Integer.MIN_VALUE;
        for (Esame esame : esami) {
            if (esame.getVoto() == minimo) {
                minimo = esame.getVoto();
            }
        }
        return minimo;
    }
}

    public ArrayList<String> studentiPeggiori(){
        int votoMinimo = 21;
        ArrayList<String> cognomiPeggiori = new ArrayList<String>();
        for(int i = 0; i < esami.size(); i ++){
            Esame esame = esami.get(i);
            if(esame.getVoto() == votoMinimo){
                cognomiPeggiori.add(esame.getCognome());
            } 
        }
    }


}
