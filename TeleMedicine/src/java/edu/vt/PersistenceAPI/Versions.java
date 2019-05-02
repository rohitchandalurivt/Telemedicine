
package edu.vt.PersistenceAPI;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Versions implements Serializable
{

    @SerializedName("small")
    @Expose
    private String small;
    @SerializedName("medium")
    @Expose
    private String medium;
    @SerializedName("large")
    @Expose
    private String large;
    @SerializedName("hero")
    @Expose
    private String hero;
    private final static long serialVersionUID = 4275425443978838193L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Versions() {
    }

    /**
     * 
     * @param hero
     * @param small
     * @param large
     * @param medium
     */
    public Versions(String small, String medium, String large, String hero) {
        super();
        this.small = small;
        this.medium = medium;
        this.large = large;
        this.hero = hero;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

}
