import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 = {-7, -5, -20, 0, 0, -4, 3, 4, 12, 12, 13, 6, 12, 14, 40, 19, 20, 54, 77, 77, 89, 100, 86, 100, 101};
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {-7, -5, -20, 0, 0, -4, 3, 4, 12, 12, 13, 6, 12, 14, 40, 19, 20, 54, 77, 77, 89, 100, 86, 100, 101};
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}
