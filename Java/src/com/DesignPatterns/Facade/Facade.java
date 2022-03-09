package com.DesignPatterns.Facade;

import com.DesignPatterns.Facade.postCodeSubsystem.postCodeAPI;
import com.DesignPatterns.Facade.idSubsystem.idService;

public class Facade {
    public void MigrateClient(String name, String postCode){
        String city = postCodeAPI.getInstance().findCity(postCode);
        String region = postCodeAPI.getInstance().findRegion(postCode);
        idService.saveClient(name, postCode, city, region);
    }
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.MigrateClient("John", "12345ABC");
    }
}
