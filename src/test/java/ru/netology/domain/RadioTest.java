package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void selectStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(8);

        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void selectStationUnderLimit() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(11);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void selectStationBelowLimit() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    public void switchToNextStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(8);
        rad.nextStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void switchFromLastToNextStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void switchToPrevStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(1);
        rad.prevStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void switchFromFirstToPrevStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);
        rad.prevStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    public void increaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(5);
        rad.increaseVolume();

        int expected = 6;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeFromMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.decreaseVolume();

        int expected = 9;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolumeFromMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);

    }

}



