public class IndexedTest {
  private int[] dataSet = { 1, 2, 3, 4, 5, 6 };

  public IndexedTest() {
  }

  public void setDataSet(int[] x) {
    dataSet = x;
  }

  public void setDataSet(int index, int x) {
    dataSet[index] = x;
  }

  public int[] getDataSet() {
    return dataSet;
  }
}
