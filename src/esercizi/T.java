package esercizi;

public class T {
    private int ore;
    private int minuti;
    private int secondi;

    public T() {

    }

    public T(int ore, int minuti, int secondi) {
        try {
            if (ore < 0 || ore > 23 || minuti < 0 ||
                    minuti > 59 || secondi < 0 || secondi > 59) {
                throw new Exception("Inserisci un orario valido");
            }
            this.ore = ore;
            this.minuti = minuti;
            this.secondi = secondi;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public int getOre() {
        return ore;
    }

    public int getMinuti() {
        return minuti;
    }

    public int getSecondi() {
        return secondi;
    }

    public void setOre(int ore) {
        try {
            if (ore < 0 || ore > 23) {
                throw new Exception("Inserisci un numero tra 0 e 23");
            }
            this.ore = ore;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void setMinuti(int minuti) {
        try {
            if (minuti < 0 || minuti > 59) {
                throw new Exception("Inserisci un numero tra 0 e 59");
            }
            this.minuti = minuti;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void setSecondi(int secondi) {
        try {
            if (secondi < 0 || secondi > 59) {
                throw new Exception("Inserisci un numero tra 0 e 59");
            }
            this.secondi = secondi;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void sottraiOrario(int ore, int minuti, int secondi) {
        this.ore = this.ore - ore;
        if (this.ore < 0) {
            this.ore = 24 + this.ore;
        }

        this.minuti = this.minuti - minuti;
        if (this.minuti < 0) {
            this.ore -= 1;
            this.minuti = 60 + this.minuti;
        }

        this.secondi = this.secondi - secondi;
        if (this.secondi < 0) {
            this.minuti -= 1;
            this.secondi = 60 + this.secondi;
        }

    }


    public void aggiungiOrario(int ore, int minuti, int secondi) throws IllegalArgumentException {
        if (minuti < 0 || minuti > 59 || secondi < 0 || secondi > 59) {
            throw new IllegalArgumentException("Orario non valido.");
        }
        int aggiungi_secondi = this.secondi + secondi;
        int aggiungi_minuti = this.minuti + minuti;
        int aggiungi_ore = this.ore + ore;
        if (aggiungi_secondi >= 60) {
            aggiungi_secondi = aggiungi_secondi - 60;
            aggiungi_minuti++;
        }
        if (aggiungi_minuti >= 60) {
            aggiungi_minuti = aggiungi_minuti - 60;
            aggiungi_ore++;
        }
        aggiungi_ore = aggiungi_ore % 24;
        this.ore = aggiungi_ore;
        this.minuti = aggiungi_minuti;
        this.secondi = aggiungi_secondi;

    }

}
