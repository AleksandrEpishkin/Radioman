package ru.netology.statistic;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;


    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setNextStation() {
        if (currentRadioStation < 9) {
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
            currentRadioStation = 9;
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
        if (currentVolume < 9) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


}
