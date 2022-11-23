import java.util.Scanner;

public class Book {
    private String author;
    private String title;
    private int pageCount;
    private String pressMark;

    public Book(String author, String title, int pageCount, String pressMark) {
        this.author = author;
        this.pressMark = pressMark;
        this.pageCount = pageCount;
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPressMark(String pressMark) {
        this.pressMark = pressMark;
    }

    public String getPressMark() {
        return pressMark;
    }

    public String needsRepair(boolean needsRapair) {
        if (!needsRapair) return "doesn't need repair " + "\n";
        else return "needs repair " + "\n";
    }

    public void changeAuthor() {
        Scanner scS = new Scanner(System.in);
        System.out.println("Change Author");
        String changeAuthor = scS.nextLine();
        setAuthor(changeAuthor);
    }

    public void changePageCount() {
        Scanner scI = new Scanner(System.in);
        System.out.println("Change Page Count");
        int changePageCount = scI.nextInt();
        setPageCount(changePageCount);
    }

    @Override
    public String toString() {
        return "Author - " + author + "\n" +
                "Title - " + title + "\n" +
                "Page count - " + pageCount + "\n" +
                "Press mark - " + pressMark + "\n";
    }

}