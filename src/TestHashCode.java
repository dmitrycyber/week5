public class TestHashCode {
    private int i;
    private int j;
    private int k;
    private String name;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestHashCode that = (TestHashCode) o;

        if (i != that.i) return false;
        if (j != that.j) return false;
        if (k != that.k) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = i;
        result = 31 * result + j;
        result = 31 * result + k;
        result = 31 * result + name.hashCode();
        return result;
    }

    public static void main(String[] args) {
        TestHashCode testHashCode = new TestHashCode();
        testHashCode.name = "JJJ";
        testHashCode.i = 1;
        testHashCode.j = 1;
        testHashCode.k = 1;
        TestHashCode testHashCode1 = new TestHashCode();
        System.out.println(testHashCode.hashCode());

    }


}
