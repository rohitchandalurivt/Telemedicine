package edu.vt.PersistenceAPI.DoctorSearch;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum implements Serializable
{

    @SerializedName("practices")
    @Expose
    private List<Practice> practices = null;
    @SerializedName("educations")
    @Expose
    private List<Object> educations = null;
    @SerializedName("profile")
    @Expose
    private Profile profile;
    @SerializedName("ratings")
    @Expose
    private List<Object> ratings = null;
    @SerializedName("insurances")
    @Expose
    private List<Insurance> insurances = null;
    @SerializedName("specialties")
    @Expose
    private List<Specialty> specialties = null;
    @SerializedName("licenses")
    @Expose
    private List<License> licenses = null;
    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("npi")
    @Expose
    private String npi;
    private final static long serialVersionUID = 7680906052607714430L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Datum() {
    }

    /**
     * 
     * @param uid
     * @param practices
     * @param insurances
     * @param specialties
     * @param npi
     * @param licenses
     * @param educations
     * @param ratings
     * @param profile
     */
    public Datum(List<Practice> practices, List<Object> educations, Profile profile, List<Object> ratings, List<Insurance> insurances, List<Specialty> specialties, List<License> licenses, String uid, String npi) {
        super();
        this.practices = practices;
        this.educations = educations;
        this.profile = profile;
        this.ratings = ratings;
        this.insurances = insurances;
        this.specialties = specialties;
        this.licenses = licenses;
        this.uid = uid;
        this.npi = npi;
    }

    public List<Practice> getPractices() {
        return practices;
    }

    public void setPractices(List<Practice> practices) {
        this.practices = practices;
    }

    public List<Object> getEducations() {
        return educations;
    }

    public void setEducations(List<Object> educations) {
        this.educations = educations;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public List<Object> getRatings() {
        return ratings;
    }

    public void setRatings(List<Object> ratings) {
        this.ratings = ratings;
    }

    public List<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(List<Insurance> insurances) {
        this.insurances = insurances;
    }

    public List<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(List<Specialty> specialties) {
        this.specialties = specialties;
    }

    public List<License> getLicenses() {
        return licenses;
    }

    public void setLicenses(List<License> licenses) {
        this.licenses = licenses;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNpi() {
        return npi;
    }

    public void setNpi(String npi) {
        this.npi = npi;
    }

}
