package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {


    @ParameterizedTest
    @CsvFileSource(resources = {"/testDataStations.csv"})
    public void manualStationSelection(int StationNumber, int expected) {
        Radio manuel = new Radio();

        manuel.setCurrentRadioStation(StationNumber);

        int actual = manuel.getCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/testDataNextStations.csv"})
    public void nextStationSelection(int StationNumber, int expected) {
        Radio next = new Radio();
        next.nextStation(StationNumber);
        int actual = next.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/testDataPrevStations.csv"})
    public void prevStationSelection(int StationNumber, int expected) {
        Radio prev = new Radio();
        prev.prevStation(StationNumber);
        int actual = prev.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/testDataVolumeUp.csv"})
    public void increaseVolume(int levelVolume, int expected) {
        Radio up = new Radio();
        up.setCurrentVolume(levelVolume);
        up.increaseVolume();
        int actual = up.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/testDataVolumeDown.csv"})
    public void decreaseVolume(int levelVolume, int expected) {
        Radio down = new Radio();
        down.setCurrentVolume(levelVolume);
        down.decreaseVolume();
        int actual = down.getCurrentVolume();

        assertEquals(expected, actual);
    }

}
