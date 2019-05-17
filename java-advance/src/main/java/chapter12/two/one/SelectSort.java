package chapter12.two.one;

import java.util.Arrays;

/**
 * 直接选择排序
 */
public class SelectSort {
    public static void selectSort(DataWrap[] data) {
        System.out.println("开始排序");
        int arrayLength = data.length;
        // 依次进行n-1趟比较，第i趟比较将第i大的值选出来放在i位置上
        for (int i = 0; i < arrayLength - 1; i++) {
            // 第i个数据只需和它后面的数据比较
            for (int j = i + 1; j < arrayLength; j++) {
                // 如果第i位置的数据>j位置的数据，交换它们
                if (data[i].compareTo(data[j]) > 0) {
                    DataWrap tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
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
        selectSort(data);
        System.out.println("排序之后：\n" + Arrays.toString(data));
    }
}
