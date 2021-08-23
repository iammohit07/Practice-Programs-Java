import java.util.Scanner;

public class MaximumDifferenceBetweenTwoNum
{
    public static void main(String[] args)
    {
        System.out.print("Enter the Size of Array : ");
        Scanner scanner = new Scanner(System.in);
        int size_array = scanner.nextInt();

        int[] arr = new int[size_array];
        System.out.println("Enter the  Array : ");

        for (int i = 0; i < size_array; i++)
        {
            arr[i] = scanner.nextInt();
        }

        System.out.println();

        System.out.print("Entered array is : ");
        for (Integer s : arr)
        {
            System.out.print(s + " ");

        }
        System.out.println();
        maxDifferenceBtwTwoElement(arr);
    }

    public static void maxDifferenceBtwTwoElement(int[] arr)
    {
        int difference = 0,max_difference = 0;
        for (int i :arr)
        {
            for (int k : arr)
            {
                if (k>i)
                {
                    difference = k - i;
                }

            }
            if (difference>max_difference)
            {
                max_difference = difference;
            }
        }
        if (max_difference!=0)
        {
            System.out.println("Max difference is : " + max_difference);
        }
        else
        {
            System.out.println("Max difference is zero ");
        }
    }
}
