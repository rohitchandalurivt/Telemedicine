
package edu.vt.PersistenceAPI.DoctorSearch;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta implements Serializable
{

    @SerializedName("data_type")
    @Expose
    private String dataType;
    @SerializedName("item_type")
    @Expose
    private String itemType;
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
    private final static long serialVersionUID = 4205057759446122614L;

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
     * @param dataType
     * @param count
     * @param itemType
     * @param skip
     */
    public Meta(String dataType, String itemType, Integer total, Integer count, Integer skip, Integer limit) {
        super();
        this.dataType = dataType;
        this.itemType = itemType;
        this.total = total;
        this.count = count;
        this.skip = skip;
        this.limit = limit;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
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

}
