package beans;

public class SurveyItem {
    private String name;
    private String description;
    private int voteQuantity;

    public SurveyItem(String name, String description, int voteQuantity) {
        this.name = name;
        this.description = description;
        this.voteQuantity = voteQuantity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getVoteQuantity() {
        return voteQuantity;
    }

    public void increaseVote() {
        voteQuantity++;
    }
}