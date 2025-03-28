package com.hasan.estateapp.service;

import com.hasan.estateapp.model.House;
import com.hasan.estateapp.repository.HouseRepository;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HouseService {
private final HouseRepository houseRepository;

public HouseService(HouseRepository repository){
    this.houseRepository = repository;
}

public int getTotalPriceOfHouses(){
    return houseRepository.getHouseList().stream().mapToInt(House::getPrice).sum();
}

public int getTotalPriceOfVillas(){
    return houseRepository.getVillaList().stream().mapToInt(House::getPrice).sum();
}

public int getTotalPriceOfSummerHouses() {
    return houseRepository.getSummerHouseList().stream().mapToInt(House::getPrice).sum();
}

public int getTotalPriceOfAllHouses() {
    return houseRepository.getAllHouses().stream().mapToInt(House::getPrice).sum();
}

public double getAverageSquareMetersOfHouses() {
    return houseRepository.getHouseList().stream().mapToInt(House::getSquareMeters).average().orElse(0);
}

public double getAverageSquareMetersOfVillas() {
    return houseRepository.getVillaList().stream().mapToInt(House::getSquareMeters).average().orElse(0);
}

public double getAverageSquareMetersOfSummerHouses() {
    return houseRepository.getSummerHouseList().stream().mapToInt(House::getSquareMeters).average().orElse(0);
}

public double getAverageSquareMetersOfAllHouses() {
    return houseRepository.getAllHouses().stream().mapToInt(House::getSquareMeters).average().orElse(0);
}

public List<House> filterHousesByRoomAndLivingRoom(int numberOfRooms, int numberOfLivingRooms){
    return houseRepository.getAllHouses().stream()
            .filter(h-> h.getNumberOfRooms() == numberOfRooms && h.getNumberOfLivingRooms() == numberOfLivingRooms)
            .collect(Collectors.toList());
}
}
