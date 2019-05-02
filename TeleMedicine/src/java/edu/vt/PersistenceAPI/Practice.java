
package edu.vt.PersistenceAPI;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Practice implements Serializable
{

    @SerializedName("location_slug")
    @Expose
    private String locationSlug;
    @SerializedName("within_search_area")
    @Expose
    private Boolean withinSearchArea;
    @SerializedName("distance")
    @Expose
    private Double distance;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lon")
    @Expose
    private Double lon;
    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("accepts_new_patients")
    @Expose
    private Boolean acceptsNewPatients;
    @SerializedName("insurance_uids")
    @Expose
    private List<String> insuranceUids = null;
    @SerializedName("visit_address")
    @Expose
    private VisitAddress visitAddress;
    @SerializedName("office_hours")
    @Expose
    private List<Object> officeHours = null;
    @SerializedName("phones")
    @Expose
    private List<Phone> phones = null;
    @SerializedName("languages")
    @Expose
    private List<Language> languages = null;
    @SerializedName("media")
    @Expose
    private List<Medium> media = null;
    private final static long serialVersionUID = 8271450516550539684L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Practice() {
    }

    /**
     * 
     * @param uid
     * @param lon
     * @param locationSlug
     * @param website
     * @param acceptsNewPatients
     * @param visitAddress
     * @param officeHours
     * @param phones
     * @param withinSearchArea
     * @param languages
     * @param insuranceUids
     * @param distance
     * @param name
     * @param media
     * @param lat
     */
    public Practice(String locationSlug, Boolean withinSearchArea, Double distance, Double lat, Double lon, String uid, String name, String website, Boolean acceptsNewPatients, List<String> insuranceUids, VisitAddress visitAddress, List<Object> officeHours, List<Phone> phones, List<Language> languages, List<Medium> media) {
        super();
        this.locationSlug = locationSlug;
        this.withinSearchArea = withinSearchArea;
        this.distance = distance;
        this.lat = lat;
        this.lon = lon;
        this.uid = uid;
        this.name = name;
        this.website = website;
        this.acceptsNewPatients = acceptsNewPatients;
        this.insuranceUids = insuranceUids;
        this.visitAddress = visitAddress;
        this.officeHours = officeHours;
        this.phones = phones;
        this.languages = languages;
        this.media = media;
    }

    public String getLocationSlug() {
        return locationSlug;
    }

    public void setLocationSlug(String locationSlug) {
        this.locationSlug = locationSlug;
    }

    public Boolean getWithinSearchArea() {
        return withinSearchArea;
    }

    public void setWithinSearchArea(Boolean withinSearchArea) {
        this.withinSearchArea = withinSearchArea;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Boolean getAcceptsNewPatients() {
        return acceptsNewPatients;
    }

    public void setAcceptsNewPatients(Boolean acceptsNewPatients) {
        this.acceptsNewPatients = acceptsNewPatients;
    }

    public List<String> getInsuranceUids() {
        return insuranceUids;
    }

    public void setInsuranceUids(List<String> insuranceUids) {
        this.insuranceUids = insuranceUids;
    }

    public VisitAddress getVisitAddress() {
        return visitAddress;
    }

    public void setVisitAddress(VisitAddress visitAddress) {
        this.visitAddress = visitAddress;
    }

    public List<Object> getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(List<Object> officeHours) {
        this.officeHours = officeHours;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public List<Medium> getMedia() {
        return media;
    }

    public void setMedia(List<Medium> media) {
        this.media = media;
    }

}
