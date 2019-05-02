
package edu.vt.PersistenceAPI.SpecialitySearch;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta implements Serializable
{

    @SerializedName("data_type")
    @Expose
    private String dataType;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("skip")
    @Expose
    private Integer skip;
    @SerializedName("limit")
    @Expose
    private Integer limit;
    @SerializedName("fields_requested")
    @Expose
    private String fieldsRequested;
    private final static long serialVersionUID = -3180992210988514357L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Meta() {
    }

    /**
     * 
     * @param limit
     * @param total
     * @param fieldsRequested
     * @param dataType
     * @param count
     * @param skip
     */
    public Meta(String dataType, Integer total, Integer count, Integer skip, Integer limit, String fieldsRequested) {
        super();
        this.dataType = dataType;
        this.total = total;
        this.count = count;
        this.skip = skip;
        this.limit = limit;
        this.fieldsRequested = fieldsRequested;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getSkip() {
        return skip;
    }

    public void setSkip(Integer skip) {
        this.skip = skip;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getFieldsRequested() {
        return fieldsRequested;
    }

    public void setFieldsRequested(String fieldsRequested) {
        this.fieldsRequested = fieldsRequested;
    }

}
