package model;

public class Conclusion {
    private int pointLevel;
    private String content;
    public Conclusion(int pointLevel, String content) {
        this.pointLevel = pointLevel;
        this.content = content;
    }
    public int getPointLevel() {
        return pointLevel;
    }

    public String getContent() {
        return content;
    }
}
