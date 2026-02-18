public class primitiveDataTypes {

    public static void main(String[] args) {

        byte age = 30;
        System.out.printf("%d%n", age);

        short quantityOfBags = 10000;
        System.out.printf("The quantity of bags ordered is %d%n", quantityOfBags);

        long nigeriaPopulation = 200000000L;
        System.out.printf("The population of Nigeria is %d%n", nigeriaPopulation);

        long worldsPopulation = 9000000000L;
        System.out.printf("The world's population is %d%n", worldsPopulation);

        float myBalance = 6945.6000057f;
        System.out.printf("My Account balance is %.2f%n", myBalance);

        double CBNBalance = 9874466464.904;
        System.out.printf("CBN account balance is %.2f%n", CBNBalance);

        char symbol = '$';
        System.out.printf("My Account balance is %c%.2f%n", symbol, myBalance);

        boolean isJavaFun = true;
        System.out.printf("Do you love learning Java? %b%n", isJavaFun);
    }
}
