import java.util.Scanner;

public class BinarySearch
{
    public static int searchItemByIteration(int item, int[] arr)
    {
        int low = 0,high = arr.length - 1;
        while (low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid] == item)
            {
                return mid;
            }
            else if (item>arr[mid])
            {
                //element is in right side
                low = mid + 1;
            }
            else if (item<arr[mid])
            {
                //element is in left side
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int searchItemRecursively(int item, int[] arr,int low,int high)
    {
        if (low > high)
        {
            return -1;
        }
        int mid = (low + high)/2;
        if (arr[mid] == item)
        {
            return mid;
        }
        if (item>arr[mid])
        {
            //element is in right side
            return searchItemRecursively(item,arr,mid + 1,high);
        }
        if (item<arr[mid])
        {
            //element is in left side
            return searchItemRecursively(item,arr,low,mid-1);
        }
        return -1;
    }

    public static void main(String[] args)
    {
        System.out.print("Enter the Size of Array : ");
        Scanner scanner = new Scanner(System.in);
        int size_array = scanner.nextInt();

        int[] arr = new int[size_array];
        System.out.println("Enter the  sorted Array : ");

        for(int i = 0;i<size_array;i++)
        {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Entered array is : ");
        for (int s : arr)
        {
            System.out.println(s);
        }

        System.out.println("Enter element to search from array : ");
        int x = scanner.nextInt();

        /*By Iteration
        int position = searchItemByIteration(x, arr);
        if (position == -1)
        {
            System.out.println("Element isn't present in array !!");
        }
        else
        {
            System.out.println("Element is present at index: " + position + ", Element is : " + arr[position] );
        }*/

        //By Recursion
        int low = 0,high = arr.length-1;
        int position = searchItemRecursively(x, arr,low,high);
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
