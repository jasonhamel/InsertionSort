import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(44);
        numbers.add(6);
        numbers.add(2);
        numbers.add(1);
        numbers.add(5);
        numbers.add(63);
        numbers.add(87);
        numbers.add(283);
        numbers.add(4);
        numbers.add(0);

        insertionSort(numbers);
    }

    public static void insertionSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < list.get(0)) {
                int temp = list.get(i);
                for (int j = i; j > 0; j--) {
                    list.set(j, list.get(j -1));
                }
                list.set(0, temp);
            } else {
                for (int j = 1; j < i; j++) {
                    if (list.get(i) < list.get(j)) {
                        int temp = list.get(i);
                        for (int k = i; k > j; k--) {
                            list.set(k, list.get(k - 1));
                        }
                        list.set(j, temp);
                        break;
                    }
                }
            }
        }
    }
}