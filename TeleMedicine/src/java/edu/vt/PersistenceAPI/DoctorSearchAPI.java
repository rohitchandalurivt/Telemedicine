
package edu.vt.PersistenceAPI;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DoctorSearchAPI implements Serializable
{

    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    private final static long serialVersionUID = -3122454939947047262L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DoctorSearchAPI() {
    }

    /**
     * 
     * @param data
     * @param meta
     */
    public DoctorSearchAPI(Meta meta, List<Datum> data) {
        super();
        this.meta = meta;
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

}
