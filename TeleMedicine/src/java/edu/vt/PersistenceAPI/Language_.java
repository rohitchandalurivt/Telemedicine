
package edu.vt.PersistenceAPI;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Language_ implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("code")
    @Expose
    private String code;
    private final static long serialVersionUID = 2485376256034300831L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Language_() {
    }

    /**
     * 
     * @param name
     * @param code
     */
    public Language_(String name, String code) {
        super();
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
