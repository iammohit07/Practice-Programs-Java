import java.util.HashSet;
import java.util.Scanner;

public class SumGreaterThanZero
{
    public static void findPairsUsingHashset(int [] arr)
    {
        HashSet<Integer> hashSet = new HashSet<>();
        int count=0;
        for (int j : arr)
        {
            int temp_val = 0-j;
            if (hashSet.contains(temp_val))
            {
                if (temp_val + j > 0)
                {
                    count++;
                }
            }
            else
            {
                hashSet.add(j);
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args)
    {
        System.out.print("Enter the Size of Array : ");
        Scanner scanner = new Scanner(System.in);
        int size_array = scanner.nextInt();

        int[] arr = new int[size_array];
        System.out.println("Enter the  Array : ");

        for(int i = 0;i<size_array;i++)
        {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("Entered array is : ");
        for (Integer s : arr)
        {
            System.out.print(s + " ");
        }
        System.out.println();
        //findPairByNestedLoop(arr,sum);
        findPairsUsingHashset(arr);

    }
}
