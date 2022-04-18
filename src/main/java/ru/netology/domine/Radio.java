package ru.netology.domine;

public class Radio {
    private int currentStation;// Номер текущей радиостанции
    private int currentVolume;//  Текущий уровень звука

    public int getCurrentStation() { //получить номер текущей станции
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {  //установить текущую станцию
        this.currentStation = currentStation;
    }

    public void inputStation(int currentStation) {  //установить номер станции
        if (currentStation < 0) { //не может быть отрицательной
            return;
        }
        if (currentStation > 9) {//не может быть больше 9
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {  //следующая станция
        this.currentStation = currentStation + 1;
        if (currentStation > 9) {//станций 0-9 >= 10
            this.currentStation = 0;
        }
    }

    public void previous() {  //предыдущая станция
        this.currentStation = currentStation - 1;
        if (currentStation == -1) {//было 0 стало -1 =9
            this.currentStation = 9;
        }
    }

    public int getCurrentVolume() { //получить уровень звука
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) { //установить уровень звука
        this.currentVolume = currentVolume;
    }

    public void volumePlus() { //громкость > максимального
        this.currentVolume = currentVolume + 1;
        if (currentVolume >= 10) { //(в пределах от 0 до 10)
            this.currentVolume = 10;
        }
    }

    public void volumeMinus() {//громкость < минимального
        this.currentVolume = currentVolume - 1;
        if (currentVolume <= 0) { //(в пределах от 0 до 10)
            this.currentVolume = 0;
        }
    }
}



