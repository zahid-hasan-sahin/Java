package LabTest;

public abstract class GameReviewer implements Game {

    private String palyerName;
    private String playerId;
    private int rating;
    //we have set and geter for review so we need it
    private String review;

    public String getPalyerName() {
        return palyerName;
    }

    public String getPlayerId() {
        return playerId;
    }

    public int getRating() {
        return rating;
    }

    public String getReview() {
        return review;
    }

    public void setPalyerName(String palyerName) {
        this.palyerName = palyerName;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setReview(String review) {
        this.review = review;
    }

}
