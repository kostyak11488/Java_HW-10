public class Radio {
    public int currentStation;
    public int currentVolume;
    public int stationCount;

    public Radio() {
        this.stationCount = 10;

    }
    public Radio(int stationCount) {
        this.stationCount = stationCount;

    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextCurrentStation() {
        if (currentStation == stationCount - 1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void previosCurrentStation() {
        if (currentStation == 0) {
            currentStation = stationCount - 1;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation > stationCount - 1) {
            return;
        }
        if (newStation < 0) {
            return;
        }
        currentStation = newStation;
    }

}