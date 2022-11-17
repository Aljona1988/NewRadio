public class Radio {
    private int stationNum;
    private int volume;

    public int getStationNum() {
        return stationNum;
    }

    public void setStationNum(int newStationNum) {
        if (newStationNum > 9) {
            return;
        }
        if (newStationNum < 0) {
            return;
        }
        stationNum = newStationNum;

    }

    public void nextStation() {
        if (stationNum == 9) {
            stationNum = 0;
        } else {
            stationNum++;
        }

    }

    public void previousStation() {
        if (stationNum == 0) {
            stationNum = 9;
        } else {
            stationNum--;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        volume = newVolume;
    }

    public void plusVolume() {
        if (volume == 10) {
            volume = volume;
        } else {
            volume++;
        }

    }

    public void minusVolume() {
        if (volume == 0) {
            volume = volume;
        } else {
            volume--;
        }
    }
}
