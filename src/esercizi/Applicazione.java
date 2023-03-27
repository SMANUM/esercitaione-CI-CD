package esercizi;
import java.util.Scanner;
public class Applicazione {

    public static void main(String[] args) {
        UfficioPostale ufficio = new UfficioPostale();
        Lettera[] listaLettere = new Lettera[1000];
        Scanner scan = new Scanner(System.in);
        String stopCondition = "no";
        System.out.println("Inserisci 'si' per fermarti.");
        int i = 0;
        Lettera lett = new Lettera();
        while (stopCondition.equals("no")) {

            System.out.println("Inserisci un nome mittente: ");
            lett.setNomeMittente(scan.nextLine());
            System.out.println("Inserisci un cognome mittente: ");
            lett.setCognomeMittente(scan.nextLine());
            System.out.println("Inserisci un nome destinatario: ");
            lett.setNomeDestinatario(scan.nextLine());
            System.out.println("Inserisci un cognome destinatario: ");
            lett.setCognomeDestinatario(scan.nextLine());
            System.out.println("Inserisci 'si' per fermarti.");
            listaLettere[i] = lett;
            i++;
        }

        // visualizza i dati di spedizione della prima lettera da consegnare
        System.out.println("Prelevamento lettera inserita: ");

        System.out.println("Dati di spedizione della prima lettera da consegnare:");
        System.out.println("mittente: " + lett.getNomeMittente() + lett.getCognomeMittente());
        System.out.println("destinatario: " + lett.getNomeDestinatario() + lett.getCognomeDestinatario());

        ufficio.setLettere(listaLettere);

        System.out.println("Inserisci un nome destinatario da " +
                "controllare: ");
        String nome = scan.nextLine();
        System.out.println("Inserisci un cognome destinatario da " +
                "controllare: ");
        String cognome = scan.nextLine();

        System.out.println(ufficio.contaLetterePerDesƟnatario(nome, cognome));

    }
}
p
