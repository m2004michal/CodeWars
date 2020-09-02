package CodeWars.SortTheOdd;



import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kata {
    private static int[] sortArray(int[] array) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        Arrays.stream(array).forEach(queue::offer);

        PriorityQueue<Integer> collect = queue
                        .stream()
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toCollection(PriorityQueue::new));

        Stream
                .iterate(0, n -> n + 1)
                .limit(array.length)
                .forEach(i -> {
                    if (array[i] % 2 != 0)
                        array[i] = collect.remove();
                });

        return array;
    }

//best solution
//    public static int[] sortArray(final int[] array) {
//
//        // Sort the odd numbers only
//        final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();
//
//        // Then merge them back into original array
//        for (int j = 0, s = 0; j < array.length; j++) {
//            if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
//        }
//
//        return array;
//    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(Kata.sortArray(new int[]{5, 3, 2, 8, 1, 4})));
        System.out.println(Arrays.toString(Kata.sortArray(new int[]{5, 3, 1, 8, 0})));
        System.out.println(Arrays.toString(Kata.sortArray(new int[]{})));
    }
}
