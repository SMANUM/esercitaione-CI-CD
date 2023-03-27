package esercizi;

public class UfficioPostale {
    private Lettera[] lettere = new Lettera[1000];

    public UfficioPostale(){

    }

    public Lettera[] getLettere() {
        return lettere;
    }

    public void setLettere(Lettera[] lettere) {
        this.lettere = lettere;
    }

}
