import java.util.Scanner;

public class LinearSearch
{

    public static int searchItem(String[] arr, String x)
    {
        for (int i = 0;i<arr.length;i++)
        {
            if (arr[i].equals(x))
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        System.out.print("Enter the Size of Array : ");
        Scanner scanner = new Scanner(System.in);
        int size_array = scanner.nextInt();

        String[] arr = new String[size_array];
        System.out.println("Enter the  Array : ");

        for(int i = 0;i<size_array;i++)
        {
            arr[i] = scanner.next();
        }

        System.out.println("Entered array is : ");
        for (String s : arr)
        {
            System.out.println(s);
        }

        System.out.println("Enter element to search from array : ");
        String x = scanner.next();

        int position = searchItem(arr,x);
        if (position == -1)
        {
            System.out.println("Element isn't present in array !!");
        }
        else
        {
            System.out.println("Element is present at index: " + position + ", Element is : " + arr[position] );
        }
    }
}
