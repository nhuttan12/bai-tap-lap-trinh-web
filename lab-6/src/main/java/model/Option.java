package model;

public class Option {
    private String content;
    private int point;
    public Option(String content, int point) {
        this.content = content;
        this.point = point;
    }
    public String getContent() {
        return content;
    }
    public int getPoint() {
        return point;
    }
}
