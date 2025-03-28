package com.hasan.estateapp.repository;

import com.hasan.estateapp.model.House;
import com.hasan.estateapp.model.SummerHouse;
import com.hasan.estateapp.model.Villa;

import java.util.ArrayList;
import java.util.List;

public class HouseRepository {
    private List<House> houseList = new ArrayList<>();
    private List<Villa> villaList = new ArrayList<>();
    private List<SummerHouse> summerHouseList = new ArrayList<>();

    public HouseRepository() {
        houseList.add(new House(3500000,120,3,1));
        houseList.add(new House(4500000,160,4,1));
        houseList.add(new House(5750000,200,4,2));

        villaList.add(new Villa(20000000,250,5,2));
        villaList.add(new Villa(40000000,350,6,2));
        villaList.add(new Villa(58000000,420,7,2));

        summerHouseList.add(new SummerHouse(4500000,200,3,1));
        summerHouseList.add(new SummerHouse(5500000,190,4,1));
        summerHouseList.add(new SummerHouse(8500000,380,3,1));
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public List<Villa> getVillaList() {
        return villaList;
    }

    public List<SummerHouse> getSummerHouseList() {
        return summerHouseList;
    }

    public List<House> getAllHouses(){
        List<House> all = new ArrayList<>();
        all.addAll(houseList);
        all.addAll(villaList);
        all.addAll(summerHouseList);
        return all;
    }
}
