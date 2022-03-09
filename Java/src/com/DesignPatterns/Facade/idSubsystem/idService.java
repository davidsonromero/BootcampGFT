package com.DesignPatterns.Facade.idSubsystem;

public class idService {
    private idService(){
        super();
    }

    public static void saveClient(String name, String postCode, String city, String region) {
        System.out.println("Saving client: " + name + " " + postCode + " " + city + " " + region);
    }
}
