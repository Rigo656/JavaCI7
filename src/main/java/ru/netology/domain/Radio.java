package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int CurrentRadioStation) {
        this.currentRadioStation = CurrentRadioStation;
    }

    public void setCurrentVolume(int CurrentVolume) {
        this.currentVolume = CurrentVolume;
    }

    public void nextStation() {
        if (currentRadioStation < 9) {
            currentRadioStation += +1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevStation() {
        if (currentRadioStation > 0) {
            currentRadioStation += -1;
        } else {
            currentRadioStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume += +1;
        } else {
            currentVolume = 10;
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