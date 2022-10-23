package thirdhometask.thirdpart.task4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Dog {
    private String nickName;
    private ArrayList<Double> ratings = new ArrayList<>();
    private Double avgRating;

    public Dog(String nickName) {
        this.nickName = nickName;
        this.avgRating = calculateAvgRating();
    }

    public String getNickName() {
        return nickName;
    }

    public Double getAvgRating() {
        return avgRating;
    }

    public void addRate(Double rate) {
        this.ratings.add(rate);
        this.avgRating = calculateAvgRating();
    }

    private Double calculateAvgRating() {
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
