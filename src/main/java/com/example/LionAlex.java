package com.example;

public class LionAlex extends Lion {
    public LionAlex(){
        hasMane = true;
        }

    private String friends = "Зебра Марти, бегемотиха Глория, жираф Мелман";
    private String place = "Нью-Йоркский зоопарк";
    public String getFriends(){
        return friends;
    }

    public String getPlaceOfLiving(){
        return place;
    }

    @Override
    public int getKittens(){
        return 0;
    }

}
