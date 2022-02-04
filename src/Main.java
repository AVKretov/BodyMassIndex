public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 74;
        float high = 1.72F;
        float bmi = service.calculate(mass, high);
        System.out.println(bmi);
    }
}



