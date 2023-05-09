/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package algorithm.array;

/**
 * @author lishixiong
 * @version $Id: findMedianSortedArrays.java, v 0.1 2023-05-08 17:12 lishixiong Exp $$
 */
public class FindMedianSortedArrays {
    public static void main(String[] args) {

    }

    static class Solution1 {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int length1 = nums1.length, length2 = nums2.length;
            int totalLength = length1 + length2;
            if (totalLength % 2 == 1) {
                int midIndex = totalLength / 2 + 1;
                double median = getKthElement(nums1, nums2, midIndex);
                return median;
            } else {
                int midIndex1 = totalLength / 2 + 1, midIndex2 = totalLength / 2;
                double median = (getKthElement(nums1, nums2, midIndex1) + getKthElement(nums1, nums2, midIndex2)) / 2.0;
                return median;
            }
        }

        public int getKthElement(int[] nums1, int[] nums2, int k) {
            int length1 = nums1.length, length2 = nums2.length;
            int index1 = 0, index2 = 0;
            while (true) {
                // 边界情况
                if (index1 == length1) {
                    return nums2[index2 + k - 1];
                }
                if (index2 == length2) {
                    return nums1[index1 + k - 1];
                }
                if (k == 1) {
                    return Math.min(nums1[index1], nums2[index2]);
                }

                // 正常情况
                int half = k / 2;
                int newIndex1 = Math.min(index1 + half, length1) - 1;
                int newIndex2 = Math.min(index2 + k - half, length2) - 1;
                int pivot1 = nums1[newIndex1], pivot2 = nums2[newIndex2];
                if (pivot1 <= pivot2) {
                    k -= (newIndex1 - index1 + 1);
                    index1 = newIndex1 + 1;
                } else {
                    k -= (newIndex2 - index2 + 1);
                    index2 = newIndex2 + 1;
                }
            }
        }
    }

    class Solution2 {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int l1 = nums1.length;
            int l2 = nums2.length;
            int n = l1 + l2;
            if (n % 2 == 1) {
                return getKth(nums1, 0, nums2, 0, (n + 1) / 2) * 1.0;
            } else {
                int a = getKth(nums1, 0, nums2, 0, n / 2);
                int b = getKth(nums1, 0, nums2, 0, n / 2 + 1);
                return (a + b) / 2.0;
            }
        }

        public int getKth(int[] nums1, int i1, int[] nums2, int i2, int k) {
            int l1 = nums1.length;
            int l2 = nums2.length;
            if (l1 == i1) {
                return nums2[i2 + k - 1];
            }
            if (l2 == i2) {
                return nums1[i1 + k - 1];
            }
            if (k == 1) {
                return Math.min(nums1[i1], nums2[i2]);
            }
            int half = k / 2;
            int k1 = Math.min(i1 + half, l1) - 1;
            int k2 = Math.min(i2 + k - half, l2) - 1;
            if (nums1[k1] <= nums2[k2]) {
                return getKth(nums1, k1 + 1, nums2, i2, k - (k1 - i1 + 1));
            } else {
                return getKth(nums1, i1, nums2, k2 + 1, k - (k2 - i2 + 1));
            }
        }
    }
}
