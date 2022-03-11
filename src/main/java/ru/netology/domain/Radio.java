package ru.netology.domain;

public class Radio {
    private int numberOfRadioStations = 9;
    private int currentRadioStation;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > numberOfRadioStations) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        if (currentRadioStation < numberOfRadioStations) {
            currentRadioStation += +1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevStation() {
        if (currentRadioStation > 0) {
            currentRadioStation += -1;
        } else {
            currentRadioStation = numberOfRadioStations;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume += +1;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume += -1;
        } else {
            currentVolume = 0;
        }
    }
}