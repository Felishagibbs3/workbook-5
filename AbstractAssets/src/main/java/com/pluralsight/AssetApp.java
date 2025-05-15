package com.pluralsight;

import java.util.ArrayList;

public class AssetApp {
    Cash stash = new Cash("Money Mattress", "2025-03-01", 350);


    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        // array list to create and store homes and vehicles

        System.out.println("    Asset Manager   ");
        assets.add(new House("Main house", "2021-09-02", 150000, "365 IT Circle Dallas,TX 12345", 2, 2000, 4000));
        assets.add(new House("Production Studio House", "2024-02-20",250000,"100 Creatives Drive Seattle, WA 45678", 1, 2500, 5000 ));
        assets.add(new Vehicle("Work Truck", "2020-3-15", 28000, "GMC Sierra Denali", 2018, 28000));
        assets.add(new Vehicle("Fun toy", "2025-01-05", 5000, "Kawasaki Ninja 400", 2023, 2000 ));
        // created cash class and added it as an asset
        assets.add(new Cash("Money Stash", "2025-03-01", 350));

        // for every asset that's in the asset inventory, make print line grabbing previously made properties
        for (Asset asset : assets) {
            System.out.println("-----------------------------------");
            System.out.println("Description Name: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());


            // if the asset created is an instance of the child class, House, that is an extent of Parent class, Asset
            if (asset instanceof House) {
                House h = (House) asset;
                System.out.println("Address: " + h.getAddress());
                System.out.println("-----------------------------------");
            } else if (asset instanceof Vehicle) {
                Vehicle v = (Vehicle) asset;
                System.out.println("Year/Make and Model: " + v.getYear() + "|" + v.getMakeModel());
                System.out.println("-----------------------------------");
            }
        }

    }
}
