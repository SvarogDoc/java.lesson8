package ru.netology.domine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    private int currentStation;

    @Test
    void station() {// показать актуальную станцию
        Radio radio = new Radio();
        int actual = radio.getCurrentStation();
        System.out.println(actual);
    }

    @Test
    void setCurrentStation() {  //задать номер станции (1-9)
        Radio radio = new Radio();
        int currentStation = 7;
        int expected = 7;
        radio.setCurrentStation(currentStation);//обращение к setCurrentStation
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationMax() {  // если станция 9+1=0
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.next();//обращение к next
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationMin() {  // если станция 0-1 = 9
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.previous();//обращение к previous
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationInput() {  //задать номер станции (1-9)
        Radio radio = new Radio();
        int currentStation = 5;
        int expected = 5;
        radio.inputStation(currentStation);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void currentVolume() {  //получить уровень звука
        Radio radio = new Radio();
        int expected = 0;
        radio.getCurrentVolume();//обращение к getCurrentVolume
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void stationVolumePlus() {  // если громкость 10+1=10
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.volumePlus();//обращение к volumePlus
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void stationVolumeMinus() {// если громкость 0-1=0
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.volumeMinus();//обращение к volumeMinus
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void stationInputLessThanTheMinimum() {  //задать номер станции меньше нижней границы значения
        Radio rad = new Radio();
        int currentStation = -1;
        int expected = 0;
        rad.inputStation(currentStation);
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationInputMoreThanTheMaximum() {//задать номер станции больше верхней границы значения
        Radio rad = new Radio();
        int currentStation = 10;
        int expected = 0;
        rad.inputStation(currentStation);
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }






}