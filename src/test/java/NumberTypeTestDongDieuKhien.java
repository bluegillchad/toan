import org.junit.Assert;
import org.junit.Test;

public class NumberTypeTestDongDieuKhien {
    @Test
    public void TestPrintTypes1(){
        NumberType test = new NumberType();
        Assert.assertEquals("fail PrintTypes 1", "Số nguyên này là số chẵn.", test.printTypes(Integer.MIN_VALUE));
    }

    @Test
    public void TestPrintTypes2(){
        NumberType test = new NumberType();
        Assert.assertEquals("fail PrintTypes 2", "Số nguyên này là số lẻ, chính phương, đối xứng.", test.printTypes(9));
    }

    @Test
    public void TestPrintTypes3(){
        NumberType test = new NumberType();
        Assert.assertEquals("fail PrintTypes 1", "Số nguyên này là số lẻ, nguyên tố.", test.printTypes(1381));
    }
}
