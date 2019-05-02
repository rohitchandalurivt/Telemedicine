
package edu.vt.PersistenceAPI;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Insurance implements Serializable
{

    @SerializedName("insurance_plan")
    @Expose
    private InsurancePlan insurancePlan;
    @SerializedName("insurance_provider")
    @Expose
    private InsuranceProvider insuranceProvider;
    private final static long serialVersionUID = 8896572636920410174L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Insurance() {
    }

    /**
     * 
     * @param insurancePlan
     * @param insuranceProvider
     */
    public Insurance(InsurancePlan insurancePlan, InsuranceProvider insuranceProvider) {
        super();
        this.insurancePlan = insurancePlan;
        this.insuranceProvider = insuranceProvider;
    }

    public InsurancePlan getInsurancePlan() {
        return insurancePlan;
    }

    public void setInsurancePlan(InsurancePlan insurancePlan) {
        this.insurancePlan = insurancePlan;
    }

    public InsuranceProvider getInsuranceProvider() {
        return insuranceProvider;
    }

    public void setInsuranceProvider(InsuranceProvider insuranceProvider) {
        this.insuranceProvider = insuranceProvider;
    }

}
