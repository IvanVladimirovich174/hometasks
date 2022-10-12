package thirdhometask.firstpart.task8;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Atm {
    public static int atmCounter = 0;
    private double rubToUsd;
    private double usdToRub;

    public Atm(double rubToUsd, double usdToRub) {
        if (!isAmountMoneyValid(rubToUsd, usdToRub)) {
            throw new IllegalArgumentException("Amount of money should be positive number!");
        }
        atmCounter++;
        this.rubToUsd = rubToUsd;
        this.usdToRub = usdToRub;
    }

    public static int getAtmCounter() {
        return atmCounter;
    }

    public double convertRubToUsd(double rub) {
        BigDecimal rubToUsdSub = BigDecimal.valueOf(this.rubToUsd).setScale(2, RoundingMode.HALF_UP);
        BigDecimal rubSub = BigDecimal.valueOf(rub).setScale(2, RoundingMode.HALF_UP);

        BigDecimal amountUsdAfterConversion = rubSub.divide(rubToUsdSub, 2, RoundingMode.HALF_UP);

        return amountUsdAfterConversion.doubleValue();
    }

    public double convertUsdToRub(double usd) {
        BigDecimal usdToRubSub = BigDecimal.valueOf(this.usdToRub).setScale(2, RoundingMode.HALF_UP);
        BigDecimal usdSub = BigDecimal.valueOf(usd).setScale(2, RoundingMode.HALF_UP);

        BigDecimal amountRubAfterConversion = usdSub.multiply(usdToRubSub).setScale(2, RoundingMode.HALF_UP);

        return amountRubAfterConversion.doubleValue();
    }

    private boolean isAmountMoneyValid(double rubToUsd, double usdToRub) {
        return !((rubToUsd < 0) || (usdToRub < 0));
    }
}