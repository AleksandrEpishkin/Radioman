package ru.netology.statistic;

public class RadioVol {

    private int currentVolume;
    private int maxVolume;


    public RadioVol(){
    }

    public RadioVol(int maxVolume) {
       this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
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
