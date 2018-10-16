package com.company;

public class Gift {

    private String giftType;
    private String gender;
    private String price;
    private String ageGroup;

    public Gift() {
    }

    public Gift(String giftType, String gender, String price, String ageGroup) {
        this.giftType = giftType;
        this.gender = gender;
        this.price = price;
        this.ageGroup = ageGroup;
    }

    public Gift(String s) {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getGiftType() {
        return giftType;
    }

    public void setGiftType(String gift) {
        this.giftType = gift;
    }
    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }




}


