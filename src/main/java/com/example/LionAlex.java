package com.example;

public class LionAlex extends Lion {
    private final static boolean hasMane = true;
    public LionAlex(){
        getHasMane();
        }

    private final static String friends = "Зебра Марти, бегемотиха Глория, жираф Мелман";
    private final static String place = "Нью-Йоркский зоопарк";
    public String getFriends(){
        return friends;
    }

    public String getPlaceOfLiving(){
        return place;
    }
    private static boolean getHasMane() {
        return true;
    }
    @Override
    public int getKittens(){
        return 0;
    }

}
