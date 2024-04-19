package refactorizacion;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort.bubbleSort(arr);

        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        assertArrayEquals(expected, arr);
    }
}
