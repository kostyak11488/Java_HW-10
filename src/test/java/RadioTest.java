import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetVolumeUp() {
        Radio radio = new Radio();
        radio.currentVolume = 34;
        radio.increaseVolume();
        int expected = 35;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeDown() {
        Radio radio = new Radio();
        radio.currentVolume = 34;
        radio.decreaseVolume();
        int expected = 33;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationNextBorder() {
        Radio radio = new Radio();
        radio.currentStation = 9;
        radio.nextCurrentStation();
        int expected = 0;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationNext() {
        Radio radio = new Radio();
        radio.currentStation = 5;
        radio.nextCurrentStation();
        int expected = 6;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationPreviosBorder() {
        Radio radio = new Radio();
        radio.currentStation = 0;
        radio.previosCurrentStation();
        int expected = 9;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationPrevios() {
        Radio radio = new Radio();
        radio.currentStation = 5;
        radio.previosCurrentStation();
        int expected = 4;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationWright() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationWrong() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationNegativWrong() {
        Radio radio = new Radio();
        radio.setCurrentStation(-10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}
