import org.junit.Assert;
import org.junit.jupiter.api.Test;
class BinsTest {
    @Test
    void BinTest() {
        Bins bins = new Bins(2,12);
        bins.incrementBin(2);
        int expected = 1, actual= bins.getBin(2);
        Assert.assertEquals(expected,actual);
    }

    @Test
    void BinTest1() {
        Bins bins = new Bins(2,12);
        bins.incrementBin(3);
        bins.incrementBin(3);
        int expected = 2, actual= bins.getBin(3);
        Assert.assertEquals(expected,actual);
    }

    @Test
    void BinTest2() {
        Bins bins = new Bins(2,12);
        bins.incrementBin(5);
        int expected = 1, actual= bins.getBin(5);
        Assert.assertEquals(expected,actual);
    }

    @Test
    void BinTest3() {
        Bins bins = new Bins(2,12);
        bins.incrementBin(6);
        int expected = 1, actual= bins.getBin(6);
        Assert.assertEquals(expected,actual);
    }

    @Test
    void BinTest4() {
        Bins bins = new Bins(2,12);
        bins.incrementBin(7);
        bins.incrementBin(7);
        int expected = 2, actual= bins.getBin(7);
        Assert.assertEquals(expected,actual);
    }
}