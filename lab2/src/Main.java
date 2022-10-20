import java.math.*;

public class Main {
    public static void main(String[] args) {
        BigInteger Wheat = BigInteger.valueOf(1);
        for(int i=1;i<=64;i++){
            Wheat = Wheat.multiply(BigInteger.valueOf(2));
        }
    }
}