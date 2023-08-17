package book3.chapter3;

public class CountTestApp {
    public static void main(String[] args) {

            CountTest c1 = new CountTest();
        System.out.println(CountTest.getInstanceCount());
            CountTest c2 = new CountTest();
            System.out.println(CountTest.getInstanceCount());
        }
    }



class CountTest {
    private static int instanceCount = 0;

    public CountTest() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}

