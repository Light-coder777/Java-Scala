class Display {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6};
    int count = 0;
    for(int i=0;i<arr.length/2;i++)
    {
      for(int j=0;j<=i;j++)
      {
        System.out.print(arr[count] + "  ");
        count += 1;
      }
      System.out.println();
    }
  }
}
