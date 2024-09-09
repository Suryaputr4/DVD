package Toko;

public class Tester {
    public static void main(String[] args) {
        //Buat object dari class CD
        CD c1 = new CD();
        DVD c2 = new DVD();

        c1.setArtist("Lady gaga");
        c1.setNumSong(10);
        c1.setLabel("        Sony Music");
        c1.setName("Reborn");
        c1.setPrice(2000.00);
        c1.setNumber(2);
        c1.setQuantity(12);
        c2.setLength(300);
        c2.setRating("PG");
        c2.setStudio("NewLine Cinema");

        c1.print();
        c2.print();
    }
    
}
