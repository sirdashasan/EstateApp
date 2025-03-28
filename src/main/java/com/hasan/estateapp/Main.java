package com.hasan.estateapp;


import com.hasan.estateapp.repository.HouseRepository;
import com.hasan.estateapp.service.HouseService;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        HouseRepository repository = new HouseRepository();
        HouseService service = new HouseService(repository);

        NumberFormat nf = NumberFormat.getInstance(new Locale("tr", "TR"));

        System.out.println("Total price of Houses: " + nf.format(service.getTotalPriceOfHouses()) + " TL");
        System.out.println("Total price of Villas: " + nf.format(service.getTotalPriceOfVillas()) + " TL");
        System.out.println("Total price of Summer Houses: " + nf.format(service.getTotalPriceOfSummerHouses()) + " TL");
        System.out.println("Total price of All Houses: " + nf.format(service.getTotalPriceOfAllHouses()) + " TL");

        System.out.println("###############################");

        System.out.printf("Average square meters of Houses: %.2f m²\n", service.getAverageSquareMetersOfHouses());
        System.out.printf("Average square meters of Villas: %.2f m²\n", service.getAverageSquareMetersOfVillas());
        System.out.printf("Average square meters of Summer Houses: %.2f m²\n", service.getAverageSquareMetersOfSummerHouses());
        System.out.printf("Average square meters of All Houses: %.2f m²\n", service.getAverageSquareMetersOfAllHouses());


        System.out.println("###############################");

        System.out.println("Filtered houses with 4 rooms and 1 living room:");
        service.filterHousesByRoomAndLivingRoom(3, 1)
                .forEach(h -> System.out.println("Price: " + nf.format(h.getPrice()) +" TL" + ", m²: " + h.getSquareMeters()));
    }
}
