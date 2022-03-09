package com.DesignPatterns.Facade.postCodeSubsystem;

public class postCodeAPI {
    private static postCodeAPI instance = new postCodeAPI();
    
    private postCodeAPI(){
        super();
    }

    public static postCodeAPI getInstance(){
        return instance;
    }

    public String findCity(String postCode){
        System.out.println("Finding city for post code: " + postCode);
        return "City";
    }

    public String findRegion(String postCode){
        System.out.println("Finding region for post code: " + postCode);
        return "Region";
    }
}
