package ru.netology.statistic;

public class Radio {

    private int quantityRadioStation;
    private int currentRadioStation;
    private int maxVolume;
    private int currentVolume;


    public Radio() {
        this.quantityRadioStation = 10;
        this.maxVolume = 100;
    }

    public Radio(int quantityRadioStation) {
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

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
