package timefall.winterprogram.lessons.completed.introtooop.practice;

public enum Foods {
    BEEF(13.5f, true, false);

    private final double weightValue;
    private final boolean isMeat;
    private final boolean isPlant;

    Foods(double weightValue, boolean isMeat, boolean isPlant) {
        this.weightValue = weightValue;
        this.isMeat = isMeat;
        this.isPlant = isPlant;
    }

    public double getWeightValue() {
        return weightValue;
    }

    public boolean isMeat() {
        return isMeat;
    }

    public boolean isPlant() {
        return isPlant;
    }
}
