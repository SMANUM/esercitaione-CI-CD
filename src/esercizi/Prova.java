package esercizi;

public class Prova {
    public static void main(String[] args) {
        Bambino b1 = new Bambino("Elena", 13);
        Bambino b2 = new Bambino("Luca", 14);

        if(b1.maggioreDi(b2)){
            System.out.println(b1.toString());
        }

        else{
            System.out.println(b2.toString());
        }
    }
}
