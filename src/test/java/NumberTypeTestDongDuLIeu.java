import org.junit.Assert;
import org.junit.Test;

public class NumberTypeTestDongDuLIeu {
    @Test
    public void TestPrintTypes1(){
        NumberType test = new NumberType();
        Assert.assertEquals("fail path 1", "Số nguyên này là số chẵn.", test.printTypes(42));
    }

    @Test
    public void TestPrintTypes2(){
        NumberType test = new NumberType();
        Assert.assertEquals("fail path 2", "Số nguyên này là số lẻ.", test.printTypes(51));
    }

    @Test
    public void TestPrintTypes3(){
        NumberType test = new NumberType();
        Assert.assertEquals("fail path 3", "Số nguyên này là số chẵn, nguyên tố, đối xứng.", test.printTypes(2));
    }

    @Test
    public void TestPrintTypes4(){
        NumberType test = new NumberType();
        Assert.assertEquals("fail path 4", "Số nguyên này là số chẵn, chính phương.", test.printTypes(16));
    }

    @Test
    public void TestPrintTypes5(){
        NumberType test = new NumberType();
        Assert.assertEquals("fail path 5", "Số nguyên này là số chẵn, đối xứng.", test.printTypes(2121212));
    }

    @Test
    public void TestPrintTypes6(){
        NumberType test = new NumberType();
        Assert.assertEquals("fail path 6", "Số nguyên này là số lẻ, nguyên tố.", test.printTypes(17));
    }

    @Test
    public void TestPrintTypes7(){
        NumberType test = new NumberType();
        Assert.assertEquals("fail path 7", "Số nguyên này là số lẻ, chính phương, đối xứng.", test.printTypes(9));
    }

    @Test
    public void TestPrintTypes8(){
        NumberType test = new NumberType();
        Assert.assertEquals("fail path 8", "Số nguyên này là số lẻ, đối xứng.", test.printTypes(111));
    }
}
