package junit4.entity;

/**
 * @author Liu Xudong
 * @date 2020-05-04 13:25
 */
public class PrimeNumberChecker {

    public Boolean validate(final Integer primeNumber) {
        for (int i = 2; i < (primeNumber / 2); i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
