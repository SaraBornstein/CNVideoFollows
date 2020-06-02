package CodingNomads.examples.Enums;

public enum BookEnum {
    HOPONPOP("DrSeuss", 50, "childrens"),
    PRIDEANDPREJUDICE("Jane Austen", 100, "classic"),
    THEHOBBIT("Tolkein", 200, "classic");

    String author;
    int numPages;
    String genre;
    boolean doILikeIt;

    BookEnum(String author, int numPages, String genre) {
        this.author = author;
        this.numPages = numPages;
        this.genre = genre;
    }
}

class Example{
    public static void main(String[] args) {
        BookEnum fav1 = BookEnum.THEHOBBIT;
        System.out.println(fav1.author);
        fav1.doILikeIt = false;

        BookEnum fav2 = BookEnum.PRIDEANDPREJUDICE;
        System.out.println(fav2.genre);

        BookEnum fav3 = BookEnum.HOPONPOP;
        System.out.println(fav3.numPages);
    }
}
