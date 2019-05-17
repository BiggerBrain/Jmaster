package chapter12.four.one;

import chapter12.two.one.DataWrap;

import java.util.Arrays;

/**
 * 直接插入排序
 */
public class InsertSort {
    public static void insertSort(DataWrap[] data) {
        System.out.println("开始排序：\n");
        int arrayLength = data.length;
        for (int i = 1; i < arrayLength; i++) {
            // 当整体后移时，保证data[i]的值不会丢失
            DataWrap tmp = data[i];
            // i索引的值已经比前面所有值都大，表明已经有序，无需插入
            // (i-1索引处的数据已经是有序的，i-1索引处元素的值就是最大值）
            if (data[i].compareTo(data[i - 1]) < 0) {
                int j = i - 1;
                // 整体后移一格
                for (; j >= 0 && data[j].compareTo(tmp) > 0; j--) {
                    data[j + 1] = data[j];
                }
                // 最后将tmp的值插入合适位置
                data[j + 1] = tmp;
            }
            System.out.println(Arrays.toString(data));
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
        insertSort(data);
        System.out.println("排序之后：\n" + Arrays.toString(data));
    }
}
