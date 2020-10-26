public class ArrayOps {

  public static int sum(int[] arr){
    int result = 0;
    for(int i = 0; i < arr.length; i++){
      result += arr[i];
    }
    return result;
  }

  public static  int largest(int[] arr){
    int largest = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] > largest){
        largest = arr[i];
      }
    }
    return largest;
  }

  public static int[] sumRows(int[][] matrix){
    int[] result;
    result = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      result[i] = sum(matrix[i]);
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr1 = {};
    int[] arr2 = {1,2};
    int[] arr3 = {1,2,3};
    int[] arr4 = {1,2,3,4};
    int[] arr5 = {1,2,3,4,5};
    int[][] a = {arr3, arr5};
    int[][] b = {arr1, arr2, arr3, arr4, arr5};
    System.out.println(sum(arr5));
    System.out.println(largest(arr5));
    System.out.println(sumRows(b));
  }
}
