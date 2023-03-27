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

    public int contaLetterePerDesƟnatario (String nome, String cognome){
        int i = 0;
        for (Lettera let: lettere){
            if (let.getNomeDestinatario().equals(nome) &&
                 let.getCognomeDestinatario().equals(cognome)){
                i++;
            }
        }
        return i;
    }
}
