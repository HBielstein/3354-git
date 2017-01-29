package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide integers to add");
        }
    }

    private static int addArguments(String[] args) {
        int result = 0;
        int i = 0;
        if (args[0].equals("-")) {
            i = 1;
            mod = -1;
        }
        for (; i < args.length(); i++){
            result += (Integer.valueOf(args[i]) * mod);
        }
        return result;
    }
}
