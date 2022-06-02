package ru.netology.statistic;

public class Radio {

    private int currentRadioStation;
    private int quantityRadioStation = 10;


    public Radio() {
    }

    public Radio(int quantityRadioStation) {
        this.currentRadioStation = currentRadioStation;
        this.quantityRadioStation = quantityRadioStation;
    }


    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > quantityRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setNextStation() {
        if (currentRadioStation < quantityRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public int getNextStation() {
        return currentRadioStation;
    }

    public void setPrevStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = quantityRadioStation;
            this.currentRadioStation = currentRadioStation;
        } else {
            currentRadioStation = currentRadioStation - 1;
            this.currentRadioStation = currentRadioStation;
        }
    }

    public int getPrevStation() {
        return currentRadioStation;
    }


}
