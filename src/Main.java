public class Main {
    public static void main(String[] args) {
        Bmiservice service = new Bmiservice();
        int index = service.calculate(70, 1.72);
        System.out.println(index);
    }
}