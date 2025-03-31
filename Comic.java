/*
@Eric Nans
@Version 1.0
Lab 01 - Hello CS112
Comic class that holds all the meta data to display in the mian program.
*/

public class Comic {
    // Instance Variables
    private String writer;
    private String illustrator;
    private String colorist;
    private String title;
    private int issueNum;

    // Full Constructor
    public Comic(String writer, String illustrator, String colorist, String title, int issueNum) {
        this.writer = writer;
        this.illustrator = illustrator;
        this.colorist = colorist;
        this.title = title;
        this.issueNum = issueNum;
    }

    // Default Constructor
    public Comic() {
        this("Jane Doe", "John Doe", "Jorge Doe", "Comic", 0);
    }

    // Getters and Setters
    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public String getColorist() {
        return colorist;
    }

    public void setColorist(String colorist) {
        this.colorist = colorist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    // toString method
    @Override
    public String toString() {
        return "Comic{" +
                "writer='" + writer + '\'' +
                ", illustrator='" + illustrator + '\'' +
                ", colorist='" + colorist + '\'' +
                ", title='" + title + '\'' +
                ", issueNum=" + issueNum +
                '}';
    }

    // equals method
    public boolean equals(Comic otherComic) {
        if (otherComic == null) return false;
        return this.writer.equals(otherComic.writer) &&
               this.illustrator.equals(otherComic.illustrator) &&
               this.colorist.equals(otherComic.colorist) &&
               this.title.equals(otherComic.title) &&
               this.issueNum == otherComic.issueNum;
    }
}
