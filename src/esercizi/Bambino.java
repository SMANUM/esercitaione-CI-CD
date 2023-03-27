package esercizi;

public class Bambino implements Comparabile{
    private String nome;
    private int eta;

    public Bambino(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String toString(){
        return "Il bambino si chiama " + nome +
                " ed ha " + eta + " anni";
    }

    @Override
    public boolean maggioreDi(Object x) {
        Bambino bambino = (Bambino) x;
        return (this.eta > bambino.getEta());
    }
}
