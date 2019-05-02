
package edu.vt.PersistenceAPI;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InsurancePlan implements Serializable
{

    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("category")
    @Expose
    private List<String> category = null;
    private final static long serialVersionUID = -2755472251987728792L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public InsurancePlan() {
    }

    /**
     * 
     * @param uid
     * @param category
     * @param name
     */
    public InsurancePlan(String uid, String name, List<String> category) {
        super();
        this.uid = uid;
        this.name = name;
        this.category = category;
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

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

}
