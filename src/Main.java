public class Main
{
    public static void main(String[] args)
    {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray()
    {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
            return arr;
    }
    public static void task1()
    {
        System.out.println("Task 1");
        int[] arr = generateRandomArray();
        int totalCosts=0;

        for(int dayCosts:arr)
        {
            totalCosts+=dayCosts;
        }
        System.out.println("Total costs of this month amounted to "+totalCosts+" rubles.");
        System.out.println();
    }
    public static void task2()
    {
        System.out.println("Task 2");
        int[] arr = generateRandomArray();
        int minCosts=arr[0];
        int maxCosts=arr[0];

        for(int dayCosts: arr)
        {
            if(dayCosts>maxCosts)
                maxCosts=dayCosts;
            else if(dayCosts<minCosts)
                minCosts=dayCosts;
        }

        System.out.println("Minimal day costs amounted to "+minCosts+" rubles");
        System.out.println("Maximum day costs amounted to "+maxCosts+" rubles");
        System.out.println();
    }
    public static void task3()
    {
        System.out.println("Task 3");
        int[] arr = generateRandomArray();
        float averageCosts=0.0f;
        for(int dayCosts:arr)
        {
            averageCosts+=dayCosts;
        }
        averageCosts/=arr.length;
        System.out.println("Average day costs amounted to "+averageCosts+" rubles");
        System.out.println();
    }
    public static void task4()
    {
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char temp;

        for(int i=0, j=(reverseFullName.length-1); i<=(reverseFullName.length/2); i++, j--)
        {
            temp=reverseFullName[i];
            reverseFullName[i]=reverseFullName[j];
            reverseFullName[j]=temp;
        }
        for(char letter:reverseFullName)
        {
            System.out.print(letter);
        }
    }
}
