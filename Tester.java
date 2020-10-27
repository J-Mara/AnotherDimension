public class Tester {
  public static void main(String[] args) {
    int[] arr1 = {};
    int[] arr2 = {1,2};
    int[] arr3 = {1,2,3};
    int[] arr4 = {1,2,3,4};
    int[] arr5 = {1,2,3,4,5};
    int[][] a = {arr3, arr5};
    int[][] b = {arr1, arr2, arr3, arr4, arr5};
    int[][] c = {arr4, arr4, arr4};
    System.out.println(ArrayOps.sum(arr5));
    System.out.println(ArrayOps.largest(arr5));
    System.out.println(ArrayOps.arrToString(ArrayOps.sumRows(b)));
    System.out.println(ArrayOps.arrToString(ArrayOps.largestInRows(a)));
    System.out.println(ArrayOps.arrToString(ArrayOps.sumCols(c)));
    System.out.println(ArrayOps.isRowMagic(b));
    System.out.println(ArrayOps.isRowMagic(c));
    System.out.println(ArrayOps.isColMagic(c));
    System.out.println(ArrayOps.isLocationMagic(c, 2, 3));
  }
}
