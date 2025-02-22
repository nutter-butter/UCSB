    public class QuickSort
    {
        int partition(int a[], int low, int high)
        {
            int pivot = a[high]; 
            int i = (low-1);
            for (int j=low; j<high; j++)
            {
                // If current element is smaller than or
                // equal to pivot
                if (a[j] <= pivot)
                {
                    i++;
    
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
    
            int temp = a[i+1];
            a[i+1] = a[high];
            a[high] = temp;
    
            return i+1;
        }

}