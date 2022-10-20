import java.lang.Math;
import java.util.ArrayList;

public class NumberType {
    /**
     * Trả về String miêu tả các kiểu của số nguyên được nhập vào:
     * Chẵn/lẻ, nguyên tố, chính phương, đối xứng
     *
     * @param a số nguyên cần kiểm tra
     * @return String miêu tả số nguyên đó
     */
    public String printTypes(int a) {
        String returnStatement = "Số nguyên này là số ";
        if (checkEven(a)) {
            returnStatement += "chẵn";
        } else {
            returnStatement += "lẻ";
        }
        if (checkPrime(a)) {
            returnStatement += ", nguyên tố";
        }
        if (checkSquare(a)) {
            returnStatement += ", chính phương";
        }
        if (checkPalindromic(a)) {
            returnStatement += ", đối xứng";
        }
        returnStatement += '.';
        return returnStatement;
    }

    private boolean checkEven(int a) {
        if (Math.abs(a) % 2 == 0) return true;
        return false;
    }

    private boolean checkPrime(int a) {
        if (a < 2) return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean checkSquare(int a) {
        if (Math.sqrt(a) == (int) Math.sqrt(a)) {
            return true;
        }
        return false;
    }

    private boolean checkPalindromic(int a) {
        if (a == Integer.MIN_VALUE) return false;
        a = Math.abs(a);
        ArrayList<Integer> digits = new ArrayList<>();
        do {
            digits.add(a % 10);
            a /= 10;
        } while (a > 0);
        for (int i = 0; i < digits.size() / 2; i++) {
            if (digits.get(i) != digits.get(digits.size() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        NumberType nu = new NumberType();
        System.out.println(nu.printTypes(1381));
    }
}
