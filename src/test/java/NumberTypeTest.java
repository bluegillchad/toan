import org.junit.Assert;
import org.junit.Test;

public class NumberTypeTest {
    @Test
    public void TestBienMin(){
        int min = Integer.MIN_VALUE;
        NumberType test = new NumberType();
        Assert.assertEquals("fail min", "Số nguyên này là số chẵn.", test.printTypes(min));
    }

    @Test
    public void TestBienMinCong(){
        int minCong = Integer.MIN_VALUE + 1;
        NumberType test = new NumberType();
        Assert.assertEquals("fail min+", "Số nguyên này là số lẻ.", test.printTypes(minCong));
    }

    @Test
    public void TestBienMax(){
        int max = Integer.MAX_VALUE;
        NumberType test = new NumberType();
        Assert.assertEquals("fail max", "Số nguyên này là số lẻ, nguyên tố.", test.printTypes(max));
    }

    @Test
    public void TestBienMaxTru(){
        int maxTru = Integer.MAX_VALUE - 1;
        NumberType test = new NumberType();
        Assert.assertEquals("fail max-", "Số nguyên này là số chẵn.", test.printTypes(maxTru));
    }

    @Test
    public void TestBienNom(){
        int nom = 0;
        NumberType test = new NumberType();
        Assert.assertEquals("fail min-", "Số nguyên này là số chẵn, chính phương, đối xứng.", test.printTypes(nom));
    }

    @Test
    public void TestLopChan(){
        NumberType test = new NumberType();
        Assert.assertEquals("fail chẵn", "Số nguyên này là số chẵn.", test.printTypes(42));
    }

    @Test
    public void TestLopLe(){
        NumberType test = new NumberType();
        Assert.assertEquals("fail lẻ", "Số nguyên này là số lẻ.", test.printTypes(51));
    }

    @Test
    public void TestLopLeNguyenTo(){
        NumberType test = new NumberType();
        Assert.assertEquals("fail lẻ nguyên tố", "Số nguyên này là số lẻ, nguyên tố.", test.printTypes(17));
    }

    @Test
    public void TestLopChanChinhPhuong(){
        NumberType test = new NumberType();
        Assert.assertEquals("fail chẵn chính phương", "Số nguyên này là số chẵn, chính phương.", test.printTypes(16));
    }

    @Test
    public void TestLopLeChinhPhuong(){
        NumberType test = new NumberType();
        Assert.assertEquals("fail lẻ chính phương", "Số nguyên này là số lẻ, chính phương.", test.printTypes(25));
    }

    @Test
    public void TestLopChanDoiXung(){
        NumberType test = new NumberType();
        Assert.assertEquals("fail chẵn đối xứng", "Số nguyên này là số chẵn, đối xứng.", test.printTypes(212));
    }

    @Test
    public void TestLopLeDoiXung(){
        NumberType test = new NumberType();
        Assert.assertEquals("fail lẻ đối xứng", "Số nguyên này là số lẻ, đối xứng.", test.printTypes(111));
    }

    @Test
    public void TestLopChanNguyenToDoiXung(){
        NumberType test = new NumberType();
        Assert.assertEquals("fail chẵn nguyên tố đối xứng", "Số nguyên này là số chẵn, nguyên tố, đối xứng.", test.printTypes(2));
    }

    @Test
    public void TestLopLeNguyenToDoiXung(){
        NumberType test = new NumberType();
        Assert.assertEquals("fail lẻ nguyên tố đối xứng", "Số nguyên này là số lẻ, nguyên tố, đối xứng.", test.printTypes(3));
    }

    @Test
    public void TestLopChanChinhPhuongDoiXung(){
        NumberType test = new NumberType();
        Assert.assertEquals("fail chẵn chính phương đối xứng", "Số nguyên này là số chẵn, chính phương, đối xứng.", test.printTypes(4));
    }

    @Test
    public void TestLopLeChinhPhuongDoiXung(){
        NumberType test = new NumberType();
        Assert.assertEquals("fail lẻ chính phương đối xứng", "Số nguyên này là số lẻ, chính phương, đối xứng.", test.printTypes(9));
    }
}
