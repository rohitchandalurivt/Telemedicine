
package edu.vt.PersistenceAPI.DoctorSearch;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InsuranceProvider implements Serializable
{

    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("name")
    @Expose
    private String name;
    private final static long serialVersionUID = 3874805979572797605L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public InsuranceProvider() {
    }

    /**
     * 
     * @param uid
     * @param name
     */
    public InsuranceProvider(String uid, String name) {
        super();
        this.uid = uid;
        this.name = name;
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

}
