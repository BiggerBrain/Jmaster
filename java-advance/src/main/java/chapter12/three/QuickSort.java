package chapter12.three;


import chapter12.two.one.DataWrap;

import java.util.Arrays;

public class QuickSort {
    // 交换data数组总i,i两个索引处的元素
    private static void swap(DataWrap[] data, int i, int j) {
        DataWrap tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    // 对data数组中从start-end索引范围的子序列进行处理
    // 使之满足所有小于分界值的放在左边，所有大于分界值的放在右边
    private static void subSort(DataWrap[] data, int start, int end) {
        // 需要排序
        if (start < end) {
            // 以第一个元素作为分界值
            DataWrap base = data[start];
            // i从左边开始搜索，搜索大于分界值的元素的索引
            int i = start;
            // j从右边开始搜索，搜索小于分界值的元素的索引
            int j = end + 1;
            while (true) {
                // 找到大于分界值的元素的索引，或者i已经到了end处
                while (i < end && data[++i].compareTo(base) <= 0) ;
                // 找到小于分界值的元素的索引，或者j已经到了start处
                while (j > start && data[--j].compareTo(base) >= 0) ;
                if (i < j) {
                    swap(data, i, j);
                } else {
                    break;
                }
            }
            swap(data, start, j);
            // 递归左子序列
            subSort(data, start, j - 1);
            // 递归右边子序列
            subSort(data, j + 1, end);
        }
    }

    public static void quickSort(DataWrap[] data) {
        subSort(data, 0, data.length - 1);
    }

    public static void main(String[] args) {
        DataWrap[] data = {
            new DataWrap(21, ""),
            new DataWrap(-30, ""),
            new DataWrap(49, ""),
            new DataWrap(30, "*"),
            new DataWrap(-16, ""),
            new DataWrap(9, "")
        };
        System.out.println("排序之前：\n" + Arrays.toString(data));
        quickSort(data);
        System.out.println("排序之后：\n" + Arrays.toString(data));
    }
}
