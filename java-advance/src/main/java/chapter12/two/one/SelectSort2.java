package chapter12.two.one;

import java.util.Arrays;

/**
 * 直接选择排序
 * 时间效率为O(n^2)
 * 空间效率为O(1)
 */
public class SelectSort2 {
    public static void selectSort(DataWrap[] data) {
        System.out.println("开始排序");
        int arrayLength = data.length;
        // 依次进行n-1趟比较，第i趟比较将第i大的值选出来放在i位置上
        for (int i = 0; i < arrayLength - 1; i++) {
            // minIndex永远保留本趟比较中最小值的索引
            int minIndex = i;
            // 第i个数据只需和它后面的数据比较
            for (int j = i + 1; j < arrayLength; j++) {
                // 如果第minIndex位置的数据>j位置的数据
                if (data[i].compareTo(data[j]) > 0) {
                    minIndex = j;
                }
            }
            // 每趟比较最多交换一次
            if (minIndex != i) {
                DataWrap tmp = data[i];
                data[i] = data[minIndex];
                data[minIndex] = tmp;
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
