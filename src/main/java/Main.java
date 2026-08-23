public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height = 1.69;
        double weight = 76;
        int bmi = service.calculate(height, weight);

        System.out.println("Индекс массы тела: " + bmi);
    }
}
