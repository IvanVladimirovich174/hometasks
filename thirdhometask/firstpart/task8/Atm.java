package thirdhometask.firstpart.task8;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Atm {
    public static int atmCounter = 0;
    private double rubToUsd;
    private double usdToRub;

    public Atm(double rubToUsd, double usdToRub) {
        if ((rubToUsd < 0) || (usdToRub < 0)) {
            throw new IllegalArgumentException("Exchange rate should be positive number!");
        }
        atmCounter++;
        this.rubToUsd = rubToUsd;
        this.usdToRub = usdToRub;
    }

    public static int getAtmCounter() {
        return atmCounter;
    }

    public double convertRubToUsd(double rub) {
        if (rub < 0) {
            throw new IllegalArgumentException("Amount of rubles should be positive number!");
        }

        //foolproof
        BigDecimal rubToUsdSub = BigDecimal.valueOf(this.rubToUsd).setScale(2, RoundingMode.DOWN);
        BigDecimal rubSub = BigDecimal.valueOf(rub).setScale(2, RoundingMode.DOWN);

        BigDecimal amountUsdAfterConversion = rubSub.divide(rubToUsdSub, 2, RoundingMode.HALF_UP);

        return amountUsdAfterConversion.doubleValue();
    }

    public double convertUsdToRub(double usd) {
        if (usd < 0) {
            throw new IllegalArgumentException("Amount of dollars should be positive number!");
        }

        //foolproof
        BigDecimal usdToRubSub = BigDecimal.valueOf(this.usdToRub).setScale(2, RoundingMode.DOWN);
        BigDecimal usdSub = BigDecimal.valueOf(usd).setScale(2, RoundingMode.DOWN);

        BigDecimal amountRubAfterConversion = usdSub.multiply(usdToRubSub).setScale(2, RoundingMode.HALF_UP);

        return amountRubAfterConversion.doubleValue();
    }
}