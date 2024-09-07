package ArrayProblems;

public class Insertion {
  public void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        //Your code here, Geeks
         for (int i = sizeOfArray - 1; i > index; i--) {
        arr[i] = arr[i - 1];
    }
    // Insert the element
    arr[index] = element;
        
    
    }
}
