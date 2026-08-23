public class BmiService {
    public int calculate(double heightMeters, double weightKg) {
        double bmi = weightKg / (heightMeters * heightMeters);
        return (int) bmi; // приведение к целому числу
    }
}
