package Toko;

public class DVD {
	//SubClass
        private int length;
        private String Studio, Rating;

        public DVD(){
            super();
            length = 1;
            Rating = "p";
            Studio = "p";
    }

	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getRating() {
		return this.Rating;
	}

	public void setRating(String Rating) {
		this.Rating = Rating;
	}

	public String getStudio() {
		return this.Studio;
	}

	public void setStudio(String Studio) {
		this.Studio = Studio;
	}

    public void print(){
	
    System.out.println("length: \t" + length);

	System.out.println("------------------------------");

    System.out.println("Rating: \t" + Rating);

	System.out.println("------------------------------");

    System.out.println("Studio: \t" + Studio);

	System.out.println("------------------------------");
}
}