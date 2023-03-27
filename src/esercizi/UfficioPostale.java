package esercizi;

public class UfficioPostale {
    private Lettera[] lettere = new Lettera[1000];

    public UfficioPostale() {

    }

    public Lettera[] getLettere() {
        return lettere;
    }

    public void setLettere(Lettera[] lettere) {
        this.lettere = lettere;
    }


    public void aggiungiLettera(Lettera lett) {
        for (int i = 0; i < lettere.length; i++) {
            if (lettere[i] == null) {
                lettere[i] = lett;
            }
        }
    }

    public Lettera getProssimaLettera() {
        Lettera toSave = lettere[0];
        for (int i = 0; i < lettere.length - 1; i++) {
            lettere[i] = lettere[i + 1];
        }

        return toSave;

    }

    public int contaLetterePerDesƟnatario(String nome, String cognome) {
        int i = 0;
        for (Lettera let : lettere) {
            if (let.getNomeDestinatario().equals(nome) &&
                    let.getCognomeDestinatario().equals(cognome)) {
                i++;
            }
        }
        return i;

    }

}