package Toko;
//Inheritance (pewarisan)

public class CD extends product {
    private String artist;
    private int numSong;
    private String label;

    public CD(){
        super(); //constructor dari superclass
        artist = "c";
        numSong = 9;
        label = "r";

    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumSong() {
        return this.numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    public void setPrice(String label) {
        this.label = label;
            }
            //Override dari superclass product
            public void print (){
                super.print();
                System.out.println("Artist: \t"+artist);

                System.out.println("------------------------------");

                System.out.println("Jumlah lagu: \t"+numSong);

                System.out.println("------------------------------");

                System.out.println("Label: \t"+label);

                System.out.println("------------------------------");
            }


}
