// TODO:
//  https://ained.ttu.ee/javadoc/method/index.html#meetodi-ulesehitus

public class MethodsDemo {

    public static void main(String[] args) {
        String personName = "Mari-Liis";
        printGreeting(personName);

        PrintToConsoleService printToConsoleService = new PrintToConsoleService();
        printToConsoleService.printGreeting(personName);
        printToConsoleService.printGreetingInEstonian(personName);

        multiplyByTwo(2);

        int x = multiplyByTwo(3);
//        int y = multiplyByThree(3);

    }

    private static void printGreeting(String someName) {
        System.out.println("Hello, my name is " + someName);
    }

    private static int multiplyByTwo(int i) {
        return i * 2;
    }

    private static void multiplyByThree(int i) {
       i = i * 2;
    }

}
