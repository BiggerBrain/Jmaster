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
package algorithm.tree;

import base.TreeNode;

/**
 * @author lishixiong
 * @version $Id: MaxPathSum.java, v 0.1 2023-05-08 10:48 lishixiong Exp $$
 */
public class MaxPathSum {
    public static void main(String[] args) {

    }

    static class Solution {
        private int res = Integer.MIN_VALUE;

        public int maxPathSum(TreeNode root) {
            if (root == null) {
                return 0;
            }
            dfs(root);
            return res;
        }

        public int dfs(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int l = dfs(root.left);
            int r = dfs(root.right);
            res = Math.max(res, l + r + root.val);
            return Math.max(Math.max(l, r) + root.val, 0);
        }
    }
}



