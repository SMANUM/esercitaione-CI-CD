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
}
