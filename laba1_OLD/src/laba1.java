public class laba1
{
        private int array[];

        public laba1(){};

        public void setArray()
        {
            array = new int[10];
            System.out.print("Сгенерированный массив - ");

            for (int i = 0; i < array.length; i++)
            {
                array[i] = ((int) (Math.random() * 10));
                System.out.print(array[i] + " ");
            }
        }


        public void For() {
            int sum = 0;

            for (int i : array) {
                sum += i;
            }
            System.out.println("\n" + sum);
        }


    public void While() {
        int l = array.length;
        int sum = 0;
        while (l != 0) {
            sum += array[l - 1];
            l -= 1;
        }
        System.out.println(sum);
    }

    public void doWhile() {
        int sum = 0;
        int l = 0;
        do
        {
            sum += array[l];
            l ++;
        } while (l < array.length);
        System.out.println(sum);
    }

}

