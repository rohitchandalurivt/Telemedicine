
package edu.vt.PersistenceAPI;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VisitAddress implements Serializable
{

    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lon")
    @Expose
    private Double lon;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("state_long")
    @Expose
    private String stateLong;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("zip")
    @Expose
    private String zip;
    private final static long serialVersionUID = 9149317907909056735L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public VisitAddress() {
    }

    /**
     * 
     * @param zip
     * @param lon
     * @param street
     * @param state
     * @param stateLong
     * @param lat
     * @param city
     */
    public VisitAddress(String city, Double lat, Double lon, String state, String stateLong, String street, String zip) {
        super();
        this.city = city;
        this.lat = lat;
        this.lon = lon;
        this.state = state;
        this.stateLong = stateLong;
        this.street = street;
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateLong() {
        return stateLong;
    }

    public void setStateLong(String stateLong) {
        this.stateLong = stateLong;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}
