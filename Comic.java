public class Comic {
    //Instance Varibles 
    private String writer;
    private String illustrator;
    private String colorist;
    private String title;
    private int issueNum;
    //Mutators+Accessors
    //Getter & setters for illustrator
    public String getIllustrator() {
        return illustrator;
    }
    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }
    //Getter & setters for writer
    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
    //Getter & setters for colorist
    public String getColorist() {
            return colorist;
        }
    public void setColorist(String colorist) {
        this.colorist = colorist;
        }
    //Getter & setters for title
    public String getTitle() {
            return title;
        }

    public void setTitle(String title) {
        this.title = title;
        }
    //Getter & setters for issueNum
    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }   
}
