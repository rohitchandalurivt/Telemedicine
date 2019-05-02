/*
 * Created by Rohit Kumar Chandaluri on 2019.05.01  * 
 * Copyright © 2019 Rohit Kumar Chandaluri. All rights reserved. * 
 */
package edu.vt.controllers;

import edu.vt.PersistenceAPI.DoctorSearch.Datum;
import edu.vt.PersistenceAPI.DoctorSearch.DoctorSearchAPI;
import edu.vt.PersistenceAPI.InsauranceSearch.Example;
import edu.vt.globals.Methods;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

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
    private List<String> insuranceList;
    private List<String> specialityList;
    private List<Datum> doctorDataList;
    private Datum selected;

    public SearchController() {
        insuranceList = new ArrayList<String>();
        specialityList = new ArrayList<String>();
//        performDoctorSearch();
        performInsauranceSearch();
//        performpecialitySearch();
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

        List<String> specialityResult = new ArrayList<>();
        String queryLower = query.toLowerCase();
        for (String temp : specialityList) {
            String temp1 = temp.toLowerCase();
            if (temp1.contains(queryLower)) {
                specialityResult.add(temp);
            }
        }

        return specialityResult;
    }

    public List<String> insuranceList(String query) {

        List<String> insuranceResult = new ArrayList<>();
        String queryLower = query.toLowerCase();

        for (String temp : insuranceList) {
            String temp1 = temp.toLowerCase();
            if (temp1.contains(queryLower)) {
                insuranceResult.add(temp);
            }
        }

        return insuranceResult;
    }

    public void performSearch() {

    }

    public void clear() {

    }

    public void performInsauranceSearch() {
        Methods.preserveMessages();
        String insuranceAPI = "https://api.betterdoctor.com/2016-03-01/insurances?fields=name&user_key=ccfba705090b826c18231b02c7d7c1ab";
        Methods.preserveMessages();

        try {
            // Obtain the JSON file from the searchApiUrl
            System.out.println("start");

            String searchResults = Methods.readUrlContent(insuranceAPI);
            System.out.println(searchResults);
            Example obj = (Example) Methods.getJsonObject(Example.class, searchResults);
            if(obj.getData().size()==0){
                throw new Exception("No Insaurance List Found!");
            }
            fillInsaurnaceList(obj);
        } catch (Exception e) {
            Methods.showMessage("Information", "No Results!",
                    e.getMessage());
//            Methods.showMessage("Information", "No Results!",
//                    "No Recipe Found for the Search Query!");
        }

    }
    
    private void fillInsaurnaceList(Example obj){
        List<edu.vt.PersistenceAPI.InsauranceSearch.Datum> dataInsauranceList = obj.getData();
        insuranceList = new ArrayList<String>();
        for(int i=0;i<dataInsauranceList.size();i++){
            insuranceList.add(dataInsauranceList.get(i).getName());
        }
    }
    
    public void performpecialitySearch() {
        String specialityAPI = "https://api.betterdoctor.com/2016-03-01/specialties?fields=name&user_key=ccfba705090b826c18231b02c7d7c1ab";
         Methods.preserveMessages();

        try {
            // Obtain the JSON file from the searchApiUrl
            String searchResults = Methods.readUrlContent(specialityAPI);
            System.out.println(searchResults);
            edu.vt.PersistenceAPI.SpecialitySearch.Example obj = (edu.vt.PersistenceAPI.SpecialitySearch.Example) Methods.getJsonObject(edu.vt.PersistenceAPI.SpecialitySearch.Example.class, searchResults);
            if(obj.getData().size()==0){
                throw new Exception("No Insaurance List Found!");
            }
            fillSpecialitySearch(obj);
        } catch (Exception e) {
            Methods.showMessage("Information", "No Results!",
                    e.getMessage());
//            Methods.showMessage("Information", "No Results!",
//                    "No Recipe Found for the Search Query!");
        }

    }
    
    private void fillSpecialitySearch(edu.vt.PersistenceAPI.SpecialitySearch.Example obj){
        List<edu.vt.PersistenceAPI.SpecialitySearch.Datum> dataSpecialityList = obj.getData();
        specialityList = new ArrayList<String>();
        for(int i=0;i<dataSpecialityList.size();i++){
            specialityList.add(dataSpecialityList.get(i).getName());
        }
    }

    public void performDoctorSearch() {
//        double loc_lati, double loc_longi, int loc_range,double user_lati, double user_ongi, int user_range, int limit
        String url = "https://api.betterdoctor.com/2016-03-01/doctors?location=37.773%2C-122.413%2C100&user_location=37.773%2C-122.413&skip=0&limit=2&user_key=ccfba705090b826c18231b02c7d7c1ab";
        /*
        Redirecting to show a JSF page involves more than one subsequent requests and
        the messages would die from one request to another if not kept in the Flash scope.
        Since we will redirect to show the search Results page, we invoke preserveMessages().
         */
        Methods.preserveMessages();
        /*
        JSON uses the following notation:
        { }    represents a JavaScript object as a Dictionary with Key:Value pairs
        [ ]    represents Array
        [{ }]  represents an Array of JavaScript objects (dictionaries)
          :    separates Key from the Value
         */
        try {
            // Obtain the JSON file from the searchApiUrl
            String searchResults = Methods.readUrlContent(url);
            DoctorSearchAPI obj = (DoctorSearchAPI) Methods.getJsonObject(DoctorSearchAPI.class, searchResults);
            
        } catch (Exception e) {
            Methods.showMessage("Information", "No Results!",
                    "No Recipe Found for the Search Query!");
            if (doctorDataList != null) {
                doctorDataList.clear();
            }
        }

        // Reset search queries
        searchString = "";
        numberFieldString = "";
    }
}
