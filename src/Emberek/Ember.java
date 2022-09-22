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

    public int getSzuletesiEv(){
        return Integer.parseInt(this.szulDatum.substring(0,4));
    }

    public int getSzuletesiHonap(){
        String[] szuletesiAdatok = this.szulDatum.split("-");
        return Integer.parseInt(szuletesiAdatok[1]);
    }

    public int getSzuletesiNap(){
        String[] szuletesiAdatok = this.szulDatum.split("-");
        return Integer.parseInt(szuletesiAdatok[2]);
    }



    @Override
    public String toString() {
        return String.format("%30s, %10s, %-20s ", this.nev, this.szulDatum, this.szulHeLy);
    }
}
