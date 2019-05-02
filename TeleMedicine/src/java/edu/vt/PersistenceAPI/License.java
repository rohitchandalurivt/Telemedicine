
package edu.vt.PersistenceAPI;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class License implements Serializable
{

    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("number")
    @Expose
    private String number;
    private final static long serialVersionUID = 1712694592874132399L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public License() {
    }

    /**
     * 
     * @param state
     * @param number
     */
    public License(String state, String number) {
        super();
        this.state = state;
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
