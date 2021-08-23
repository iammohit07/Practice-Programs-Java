import java.util.ArrayList;
import java.util.Scanner;

public class ElementOccurringNbyTwoTimes
{
    public static void main(String [] args)
    {
        System.out.print("Enter the Size of Array : ");
        Scanner scanner = new Scanner(System.in);
        int size_array = scanner.nextInt();

        int[] arr = new int[size_array];
        System.out.print("Enter the  Array : ");

        for(int i = 0;i<size_array;i++)
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

        ArrayList<ElementDetails> list;
        list = occurrenceOfElementNbyTwoTimes(arr);
        ElementDetails details = new ElementDetails();

        for (int i=0;i<list.size();i++)
        {
            System.out.println("Element : " + list.get(i).getElementValue() + " occurred " + list.get(i).getOccurrence() + "times");
        }
    }

    public static ArrayList<ElementDetails> occurrenceOfElementNbyTwoTimes(int[] arr)
    {
        int index=-1,max_count=0;
        ElementDetails details = new ElementDetails();
        ArrayList<ElementDetails> list;
        list = new ArrayList();

        for (int i = 0;i<arr.length;i++)
        {
            int count=0;
            for (int k : arr)
            {
                if (arr[i] == k)
                {
                    count++;
                }
            }
            if (count>max_count)
            {
                max_count = count;
                index = i;
            }
        }
        if (max_count>(arr.length/2))
        {
            details.setElementValue(arr[index]);
            details.setOccurrence(max_count);
            list.add(details);
        }
        return list;
    }
}

class ElementDetails
{
    private int elementValue;
    private int occurrence;

    public int getElementValue()
    {
        return elementValue;
    }

    public void setElementValue(int elementValue)
    {
        this.elementValue = elementValue;
    }

    public int getOccurrence()
    {
        return occurrence;
    }

    public void setOccurrence(int occurrence)
    {
        this.occurrence = occurrence;
    }
}


