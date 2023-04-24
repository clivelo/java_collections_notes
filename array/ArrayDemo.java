package array;

public class ArrayDemo {
    public static void main(String[] args) {
        // Define array with data
        String[] str1 = {"Java", "Is", "Cool"};

        // Define empty array with size of 10 integers
        int[] nums1 = new int[10];
        for (int i = 0; i < 10; i++) {
            nums1[i] = i * 10;
        }
        
        // Define empty array with size of 5 generic objects
        Object[] obj1 = new Object[5];
        for (int i = 0; i < 5; i++) {
            obj1[i] = new DummyClass(i * 10);
        }
    }
}