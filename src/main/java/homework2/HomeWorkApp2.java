package homework2;

public class HomeWorkApp2 {
    public static void main(String[] args) {}
        public static boolean main ( int x1, int x2){
            int sum = x1 + x2;
            if (sum > 10 && sum < 20) {
                return true;
            } else return false;
        }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительная");
        } else {
            System.out.println("Отрицательная");
        }
    }

    public static boolean isNegative(int x) {
        if (x >= 0) {
            return true;
        }
        else return false;
        }

    public static void printWordNTimes(String string, int num) {
        for (int i = 0;i < 6;i++) {
            System.out.println("[" + i + "]" + " " + string);
        }
    }
}

