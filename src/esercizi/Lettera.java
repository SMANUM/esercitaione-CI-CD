package esercizi;

public class Lettera {
    private String nomeMittente;
    private String cognomeMittente;
    private String nomeDestinatario;
    private String cognomeDestinatario;

    public Lettera(){}

    public Lettera(String nomeMittente, String cognomeMittente,
                   String nomeDestinatario, String cognomeDestinatario) {
        this.nomeMittente = nomeMittente;
        this.cognomeMittente = cognomeMittente;
        this.nomeDestinatario = nomeDestinatario;
        this.cognomeDestinatario = cognomeDestinatario;
    }

    public String getNomeMittente() {
        return nomeMittente;
    }

    public String getCognomeMittente() {
        return cognomeMittente;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public String getCognomeDestinatario() {
        return cognomeDestinatario;
    }

    public void setNomeMittente(String nomeMittente) {
        this.nomeMittente = nomeMittente;
    }

    public void setCognomeMittente(String cognomeMittente) {
        this.cognomeMittente = cognomeMittente;
    }

    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }

    public void setCognomeDestinatario(String cognomeDestinatario) {
        this.cognomeDestinatario = cognomeDestinatario;
    }
}