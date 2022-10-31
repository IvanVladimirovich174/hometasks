package basicmodule.thirdhometask.thirdpart.task4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Dog {
    private String nickName;
    private List<Double> ratings = new ArrayList<>();

    public Dog(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void addRate(Double rate) {
        this.ratings.add(rate);
    }

    public Double getAvgRating() {
        Double sum = (double) 0;

        for (Double rate : ratings) {
            sum += rate;
        }

        if (sum != 0) {
            BigDecimal dogAvgRating = new BigDecimal(sum / ratings.size());
            dogAvgRating = dogAvgRating.setScale(1, RoundingMode.DOWN);
            return dogAvgRating.doubleValue();
        }
        return (double) 0;
    }
}
