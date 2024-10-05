public class FirstApp {
    public static void main (String[] args) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
private void compareNumbers() {
    System.out.println("метод compareNumbers()");
    int a=10,b=20;
    if (a>=b)  System.out.println("a >= b");
    else System.out.println("a < b");
    System.out.println();
}

private void printColor() {
    System.out.println("метод printColor()");
    int value=1;
    if (value <=0) System.out.println("Красный");
    else if (value >0 && value<=100) System.out.println("Желтый");
    else System.out.println("Зеленый");
    System.out.println();
}


public static void checkSumSign()
{
    System.out.println("метод checkSumSign()");
    int a=10,b=16;
    int c= a + b;
    if (c>=0) System.out.println("Сумма положительная");
    else System.out.println("Сумма отрицательная");
    System.out.println();
}
    static boolean doThree(int a, int b) {
        System.out.println("\nЗадание 3.");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }
    static void doFour(int a) {
        System.out.println("\nЗадание 6.");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }
    static boolean doFive(int a) {
        System.out.println("\nЗадание 7.");
        if (a < 0) return true;
        return false;
    }
}
