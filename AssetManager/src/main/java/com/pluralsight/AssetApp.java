package com.pluralsight;

import java.util.ArrayList;

public class AssetApp {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("Main house", "2021-09-02", 150000, "365 IT Cirlce", 2, 2000, 4000));
        assets.add(new House("Production Studio House", "2024-02-20",250000,"100 Creatives Drive", 1, 2500, 5000 ));
        assets.add(new Vehicle("Work Truck", "2020-3-15", 28000, "GMC Sierra Denali", 2018, 28000));
        assets.add(new Vehicle("Fun toy", "2025-01-05", 5000, "Kawaski Ninja 400", 2023, 2000 ));

        for (Asset asset : assets) {
            System.out.println("Description Name: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());


            if (asset instanceof House) {
                House h = (House) asset;
                System.out.println("Address: " + h.getAddress());
                System.out.println("-----------------------------------");
            } else if (asset instanceof Vehicle) {
                Vehicle v = (Vehicle) asset;
                System.out.println("Year/Make and Model: " + v.getYear() + " " + v.getMakeModel());
                System.out.println("-----------------------------------");
            }
        }

    }
}
