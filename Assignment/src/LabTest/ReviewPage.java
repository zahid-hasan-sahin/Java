package LabTest;

import java.util.Date;

public class ReviewPage extends GameReviewer {

    private Date datePosted;
    //we should have this variables because we have some getter and setter
    private String name;
    private int version;
    private String genre;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public int getVersion() {
        return version;
    }

    @Override
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    public ReviewPage() {

    }

    public ReviewPage(Date datePosted) {
        this.datePosted = datePosted;
    }

    public Date getDate() {
        return datePosted;
    }

    @Override
    public String toString() {
        return "ReviewPage{" + "datePosted=" + datePosted + "PlayerName=" + this.getPalyerName() + ", name=" + name + ", version=" + version + ", genre=" + genre + '}';
    }

}
