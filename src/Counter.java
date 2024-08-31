public class Counter {
    public static void main(String[] args) {
        try {
            count(1, 500);
        } catch (InvalidParametersException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void count(int num1, int num2) throws InvalidParametersException {
        if (num1 < 0 || num2 < 0) throw new InvalidParametersException();
        if (num1 > num2) throw new InvalidParametersException("O primeiro argumento deve ser maior que o segundo");

        int counter = num2 - num1;

        for (int i = 1; i <= counter; i++) {
            System.out.println(i);
        }
    }
}
