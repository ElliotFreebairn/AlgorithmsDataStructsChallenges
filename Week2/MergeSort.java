
public class MergeSort {
  public static void main(String[] args) {
    int[] unsorted = {5, 10, 1 , 7, 100, 50, 23 ,32};
    MergeSort sorting = new MergeSort();
    sorting.mergeSort(unsorted, 0, unsorted.length);
    for(int i = 0; i < unsorted.length; i++) {
      System.out.println(unsorted[i]);
    }
  }

  public void mergeSort(int[] a, int l, int r) {
    if(l < r) {
      int middle = (l + r) / 2;
      System.out.println("left: " + l + ",right: " + r + ",middle: " + middle);
      mergeSort(a, l, middle);
      mergeSort(a, middle + 1, r);
      merge(a, l, middle, r);
    }
  }

  public void merge(int[] a, int l, int m, int r) {
    int n1 = m - l + 1;
    int n2 = r - m + 1;

    System.out.println("n1 " + n1 + ", n2 " + n2);

    int[] leftA = new int[n1 + 1];
    int[] rightA = new int[n2 + 1];

    System.out.println("left a size: " + leftA.size + " right a size: " + rightA.size);

    for(int i = 0; i < n1; i++) {
      leftA[i] = a[l + i];
      System.out.println(leftA[i] + ":");
    }

    for(int j = 0; j < n2; j++) {
      rightA[j] = a[m + j];
      System.out.println(rightAi] + ":");
    }

    leftA[n1] = Integer.MAX_VALUE;
    rightA[n2] = Integer.MAX_VALUE;

    int i = 0;
    int j = 0;
    for(int k = l; k < r; k++) {
      if(leftA[i] <= rightA[j]) {
        a[k] = leftA[i];
        i = i + 1;
      } else {
        a[k] = rightA[j];
        j = j + 1;
      }
    }


  }
}
