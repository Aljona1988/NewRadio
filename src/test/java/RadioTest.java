import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setStationNum(8);

        int expected = 8;
        int actual = radio.getStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetHigher() {
        Radio radio = new Radio();
        radio.setStationNum(10);

        int expected = 0;
        int actual = radio.getStationNum();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetLower() {
        Radio radio = new Radio();
        radio.setStationNum(-1);

        int expected = 0;
        int actual = radio.getStationNum();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncrease() {
        Radio radio = new Radio();
        radio.setStationNum(6);
        radio.nextStation();

        int expected = 7;
        int actual = radio.getStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecrease() {
        Radio radio = new Radio();
        radio.setStationNum(6);
        radio.previousStation();

        int expected = 5;
        int actual = radio.getStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncrease2() {
        Radio radio = new Radio();
        radio.setStationNum(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecrease2() {
        Radio radio = new Radio();
        radio.setStationNum(0);
        radio.previousStation();

        int expected = 9;
        int actual = radio.getStationNum();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(8);

        int expected = 8;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseV() {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.plusVolume();

        int expected = 6;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseV() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.plusVolume();

        int expected = 10;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseV() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.minusVolume();

        int expected = 9;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotDecreaseV() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.minusVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}


