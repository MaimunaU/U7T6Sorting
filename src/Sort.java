import java.util.ArrayList;

public class Sort
{
  public static void selectionSort(int[] elements)
  {
    int count = 0;
    for (int j = 0; j < elements.length - 1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {
        count++;
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;
    }
    System.out.println("Selection Sort iterations: " + count);
  }

  public static void insertionSort(int[] elements)
  {
    int count = 0;
    for (int j = 1; j < elements.length; j++)
    {
      int temp = elements[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
      {
        count++;
        elements[possibleIndex] = elements[possibleIndex - 1];
        possibleIndex--;
      }
      elements[possibleIndex] = temp;
    }
    System.out.println("Insertion Sort iterations: " + count);
  }

  public static void selectionSortWordList(ArrayList<String> words)
  {
    int count = 0;
    for (int j = 0; j < words.size() - 1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < words.size(); k++)
      {
        count++;
        if (words.get(k).compareTo(words.get(minIndex)) < 0)
        {
          minIndex = k;
        }
      }
      String temp = words.get(j);
      words.set(j, words.get(minIndex));
      words.set(minIndex, temp);
    }
    System.out.println("Selection Sort iterations: " + count);
  }

  public static void insertionSortWordList(ArrayList<String> words)
  {
    int count = 0;
    for (int j = 1; j < words.size(); j++)
    {
      String temp = words.get(j);
      int possibleIndex = j;
      while (possibleIndex > 0 && temp.compareTo(words.get(possibleIndex - 1)) < 0)
      {
        count++;
        words.set(possibleIndex, words.get(possibleIndex - 1));
        possibleIndex--;
      }
      words.set(possibleIndex, temp);
    }
    System.out.println("Insertion Sort iteration: " + count);
  }
}