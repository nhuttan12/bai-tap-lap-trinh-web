package model;

public class Question {
    private String content;
    private Option[] options;

    public Question(String content, Option[] opts) {
        this.content = content;
        this.options = opts;
    }

    public String getContent() {
        return content;
    }

    public Option[] getOptions() {
        return options;
    }
}
