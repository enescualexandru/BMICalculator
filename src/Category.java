public enum Category {
    VERY_SEVERELY_UNDERWEIGHT(15.0),
    SEVERELY_UNDERWEIGHT(16.0),
    UNDERWEIGHT(18.4),
    NORMAL_WEIGHT(24.9),
    OVERWEIGHT(29.9),
    MODERATELY_OBESE(34.9),
    SEVERELY_OBESE(39.9),
    VERY_SEVERELY_OBESE(1000);

    private double upperLimit;

    Category(double upperLimit) {
        this.upperLimit = upperLimit;
    }

    public double getLimit() {
        return upperLimit;
    }
}
