public class ArrayOps {

  public static String arrToString(int[] arr){
    String result = "{";
    if(arr.length < 1){
      return "{}";
    }
    for(int i = 0; i < arr.length-1; i++){
      result += arr[i] + ", ";
    }
    result += arr[arr.length-1] + "}";
    return result;
  }

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

  public static  int[] largestInRows(int[][] matrix){
    int[] result;
    result = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      result[i] = largest(matrix[i]);
    }
    return result;
  }

  public static int[] sumCols(int[][] matrix){
    int[] result;
    int counter = 0;
    result = new int[matrix[0].length];
    for (int i = 0; i < matrix[0].length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        counter += matrix[j][i];
      }
      result[i] = counter;
      counter = 0;
    }
    return result;
  }

  public static boolean isRowMagic(int[][] matrix){
    for(int i = 0; i < sumRows(matrix).length; i++){
      if(sumRows(matrix)[i] != sumRows(matrix)[0]){
        return false;
      }
    }
    return true;
  }

  public static boolean isColMagic(int[][] matrix){
    for(int i = 0; i < sumCols(matrix).length; i++){
      if(sumCols(matrix)[i] != sumCols(matrix)[0]){
        return false;
      }
    }
    return true;
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col){
    int rowSum = sum(matrix[row]);
    int colSum = 0;
    for(int i = 0; i < matrix.length; i++){
      colSum += matrix[i][col];
    }
    return rowSum == colSum;
  }

  // public static void main(String[] args) {
  //   int[] arr1 = {};
  //   int[] arr2 = {1,2};
  //   int[] arr3 = {1,2,3};
  //   int[] arr4 = {1,2,3,4};
  //   int[] arr5 = {1,2,3,4,5};
  //   int[][] a = {arr3, arr5};
  //   int[][] b = {arr1, arr2, arr3, arr4, arr5};
  //   int[][] c = {arr4, arr4, arr4};
  //   System.out.println(sum(arr5));
  //   System.out.println(largest(arr5));
  //   System.out.println(arrToString(sumRows(b)));
  //   System.out.println(arrToString(largestInRows(a)));
  //   System.out.println(arrToString(sumCols(c)));
  //   System.out.println(isRowMagic(b));
  //   System.out.println(isRowMagic(c));
  //   System.out.println(isColMagic(c));
  //   System.out.println(isLocationMagic(c, 2, 3));
  // }
}
