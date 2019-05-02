
package edu.vt.PersistenceAPI;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Profile implements Serializable
{

    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("middle_name")
    @Expose
    private String middleName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("languages")
    @Expose
    private List<Language_> languages = null;
    @SerializedName("bio")
    @Expose
    private String bio;
    private final static long serialVersionUID = 8644697445015190430L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Profile() {
    }

    /**
     * 
     * @param middleName
     * @param languages
     * @param lastName
     * @param title
     * @param bio
     * @param imageUrl
     * @param gender
     * @param slug
     * @param firstName
     */
    public Profile(String firstName, String middleName, String lastName, String slug, String title, String imageUrl, String gender, List<Language_> languages, String bio) {
        super();
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.slug = slug;
        this.title = title;
        this.imageUrl = imageUrl;
        this.gender = gender;
        this.languages = languages;
        this.bio = bio;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Language_> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language_> languages) {
        this.languages = languages;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

}
