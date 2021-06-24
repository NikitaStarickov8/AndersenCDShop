package main.shop;


//Реализация класса определенного трэка
public class MusicTrack {
    String title;
    String genre;
    String artistName;
    int yearOfProduct;

    public MusicTrack() {
    }


    @Override
    public String toString() {
        return "\n              ________________________: " + "\n" +
                "               Название трэка: " + title + "\n" +
                "               Жанр: " + genre + "\n" +
                "               Название группы: " + artistName + "\n" +
                "               Год выпуска: " + yearOfProduct + "\n" +
                "               _________________________";
    }

    public MusicTrack(String title, String genre, String artistName, int yearOfProduct) {
        this.title = title;
        this.genre = genre;
        this.artistName = artistName;
        this.yearOfProduct = yearOfProduct;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getYearOfProduct() {
        return yearOfProduct;
    }

    public void setYearOfProduct(int yearOfProduct) {
        this.yearOfProduct = yearOfProduct;
    }
}
