package chapter12.three;

import chapter12.two.one.DataWrap;

import java.util.Arrays;

/**
 * 冒泡排序
 * 空间效率很高，空间复杂度O(1)
 */
public class BubbleSort {
    public static void bubbleSort(DataWrap[] data) {
        System.out.println("开始排序");
        int arrayLength = data.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arrayLength - 1 - i; j++) {
                // 如果j索引处的元素大于j+1索引处的元素
                if (data[j].compareTo(data[j + 1]) > 0) {
                    // 交换
                    DataWrap tmp = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = tmp;
                    flag = true;
                }
            }
            System.out.println(Arrays.toString(data));
            // 如果某趟没有发生交换，则表明已处于有序状态
            if (!flag) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        DataWrap[] data = {
            new DataWrap(21, ""),
            new DataWrap(30, ""),
            new DataWrap(49, ""),
            new DataWrap(30, "*"),
            new DataWrap(16, ""),
            new DataWrap(9, "")
        };
        System.out.println("排序之前：\n" + Arrays.toString(data));
        bubbleSort(data);
        System.out.println("排序之后：\n" + Arrays.toString(data));
    }
}
