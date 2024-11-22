public class ArtistDemo {
    public static void main(String[] args) {
        // Instance of Artist
        Artist artist = new Artist("Ella Purnell", "British", 27, "Acting");
        artist.displayInfo();

        System.out.println();

        // Instance of Singer
        Singer singer = new Singer("Freddie Mercury", "British", 45, "Music", Genre.ROCK);
        singer.displayInfo();

        System.out.println();

        // Instance of Painter
        Painter painter = new Painter("Vincent van Gogh", "Dutch", 37, "Painting", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        // Instance of Writer
        Writer writer = new Writer("J.K. Rowling", "British", 58, "Writing", WritingStyle.FICTION);
        writer.displayInfo();

        System.out.println();

        // Instance of Dancer
        Dancer dancer = new Dancer("Michael Jackson", "American", 50, "Dance", DanceStyle.HIPHOP);
        dancer.displayInfo();
    }
}
