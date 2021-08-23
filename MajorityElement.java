import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.print("Enter the Size of Array : ");
        Scanner scanner = new Scanner(System.in);
        int size_array = scanner.nextInt();

        int[] arr = new int[size_array];
        System.out.print("Enter the  Array : ");

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
        //occurrenceOfElementNbyTwoTimes(arr);
        majorityElementByHashmap(arr);
    }


    //Bruteforce method or simple method
    public static void occurrenceOfElementNbyTwoTimes(int[] arr)
    {
        int index = -1, max_count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            int count = 0;
            for (int k : arr)
            {
                if (arr[i] == k) {
                    count++;
                }
            }
            if (count > max_count)
            {
                max_count = count;
                index = i;
            }
        }
        if (max_count > (arr.length / 2))
        {
            System.out.println("Element : " + arr[index] + " occurred " + max_count + " times");
            System.out.println("Or Majority occurring element is : " + arr[index]);
            System.out.println("Or Item occurring n/2 times is : " + arr[index]);
        }
        else
        {
            System.out.println("There is not any majority element");
        }
    }

    //By Hashmap
    public static void majorityElementByHashmap(int[] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0;i < arr.length;i++)
        {

            int count = 0;
            if (map.containsKey(arr[i]))
            {
                count = map.get(arr[i]) + 1;    //updating value of count by getting previous value of key arr[i] by get method
                if (count > arr.length / 2)
                {
                    System.out.println("Majority occurring element is : " + arr[i]);
                    System.out.println("Or Item occurring n/2 times is : " + arr[i]);
                    return;
                }
                else
                {
                    map.put(arr[i],count );
                }
            }
            else
            {
                count = 1;
                map.put(arr[i],count);
            }
        }
        System.out.println("No majority element ");
    }

}
