/*
 * Created by Rohit Kumar Chandaluri on 2019.05.01  * 
 * Copyright © 2019 Rohit Kumar Chandaluri. All rights reserved. * 
 */
package edu.vt.controllers;

import edu.vt.globals.Methods;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.primefaces.json.JSONArray;
import org.primefaces.json.JSONObject;

/**
 *
 * @author Rohit
 */

@SessionScoped
@Named(value = "searchController")
public class SearchController implements Serializable {
    /*
    ===============================
    Instance Variables (Properties)
    ===============================
     */
    // Provided by the User
    private String searchString;

    private String location;
    private String speciality;
    private String numberFieldString;
    private String healthplans;
    private List<String> insuranceList = new ArrayList<>();
    private List<String> specialityList = new ArrayList<>();

    public SearchController() {
        Methods.preserveMessages();
        String insuranceAPI = "https://api.betterdoctor.com/2016-03-01/insurances?fields=name&user_key=ccfba705090b826c18231b02c7d7c1ab";
        String specialityAPI = "https://api.betterdoctor.com/2016-03-01/specialties?fields=name&user_key=ccfba705090b826c18231b02c7d7c1ab";
        try {
            // Obtain the JSON file from the searchApiUrl
            String insuranceResults = Methods.readUrlContent(insuranceAPI);
            System.out.println(insuranceResults);
            String specialityResults = Methods.readUrlContent(specialityAPI);
          
            // It is a JSON object
            JSONObject insuranceJsonObject = new JSONObject(insuranceResults);
            JSONArray insuranceArray = insuranceJsonObject.getJSONArray("data");
            
            JSONObject specialityJsonObject = new JSONObject(specialityResults);
            JSONArray specialityArray = specialityJsonObject.getJSONArray("data");
    
            for(int i=0; i<insuranceArray.length();i++) {
                JSONObject insurance = insuranceArray.getJSONObject(i);
                insuranceList.add(insurance.optString("name",""));
            }
            
            System.out.println(insuranceArray.length());
            
            for(int i=0; i<specialityArray.length();i++) {
                JSONObject speciality1 = specialityArray.getJSONObject(i);
                specialityList.add(speciality1.optString("name",""));
            }

            System.out.println(specialityArray.length());

            // if the return result is 0 then we need to show no results message
            if(insuranceArray.length() == 0 || specialityArray.length()== 0) {
                throw new Exception();
            }
               
               
            }
            catch (Exception e) {
            Methods.showMessage("Information", "No Results!",
                    e.getMessage());
        }
    }
    
    public String getHealthplans() {
        return healthplans;
    }

    public void setHealthplans(String healthplans) {
        this.healthplans = healthplans;
    }
    
    
    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getNumberFieldString() {
        return numberFieldString;
    }

    public void setNumberFieldString(String numberFieldString) {
        this.numberFieldString = numberFieldString;
    }
    
    public List<String> specialityList(String query) {
        
        List <String> specialityResult = new ArrayList<>();
        String queryLower = query.toLowerCase();
        for(String temp: specialityList) {
            String temp1 = temp.toLowerCase();
            if(temp1.contains(queryLower)) {
                specialityResult.add(temp);
            }
        }
        
        return specialityResult;
    }
    
    public List<String> insuranceList(String query) {
        
        List <String> insuranceResult = new ArrayList<>();
        String queryLower = query.toLowerCase();
        
        for(String temp: insuranceList) {
            String temp1 = temp.toLowerCase();
            if(temp1.contains(queryLower)) {
                insuranceResult.add(temp);
            }
        }
        
        
        return insuranceResult;
    }
    
    public void performSearch() {
    
    }
    
    public void clear() {
    
    }
}
