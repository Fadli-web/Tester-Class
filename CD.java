public class CD extends produk {
    // inheritance//
    private String artist;
    private int numSong;
    private String label;


    public CD() {
        super(); // ==> Cnstrustor superclass
        artist = "";
        numSong = 0;
        label = "";
    }
    public CD(String artist,int numSong,String label,int number , String name,int quantity , double price){
        super(number,name,quantity,price);
        this.artist = artist;
        this.numSong = numSong;
        this.label = label;

    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String value) {
        this.artist = value;
    }

    public int getNumSong() {
        return this.numSong;
    }

    public void setNumSong(int value) {
        this.numSong = value;
    }

    public String getlabel() {
        return this.label;
    }

    public void setlabel(String value) {
        this.label = value;
    }

    public void print() {
        super.print();

        System.out.println("astist =\t " + artist);
        System.out.println("Total Song = \t" + numSong);
        System.out.println("label = \t" + label);
        
    }
}
