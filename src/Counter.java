public class Counter {
    public static void main(String[] args) {
        try {
            count(1, 2);
        } catch (InvalidParametersException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void count(int num1, int num2) throws InvalidParametersException {
        if (num1 < 0 || num2 < 0) throw new InvalidParametersException();
        if (num1 > num2) throw new InvalidParametersException("O primeiro argumento deve ser maior que o segundo");
    }
}
