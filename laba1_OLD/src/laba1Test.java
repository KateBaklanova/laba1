public class laba1Test {
    public static void main(String[] args)
    {
        System.out.println("11. Вывести на экран сумму чисел массива с помощью циклов for, while, do while.");
        System.out.print("\nСуммы через for, while, do while\n");

        laba1 l = new laba1();
        l.setArray();
        l.For();
        l.While();
        l.doWhile();

    }
}
