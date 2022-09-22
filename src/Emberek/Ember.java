package Emberek;

public class Ember {
    private String nev;
    private String szulDatum;
    private String szulHeLy;

    public Ember(String nev, String szulDatum, String szulHely){
        this.nev=nev;
        this.szulDatum=szulDatum;
        this.szulHeLy=szulHely;
    }

    @Override
    public String toString() {
        return String.format("%30s, %10s, %-20s ", this.nev, this.szulDatum, this.szulHeLy );
    }
}
