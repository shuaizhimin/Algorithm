### 合并两个排序的链表
输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。

输入：1->2->4, 1->3->4

输出：1->1->2->3->4->4

### 二叉树的镜像

* 递归

1.终止条件：当root节点为空时，则返回null

2.递归工作：

   1.初始化节点tmp,用于暂存root的左节点

   2.开启递归右节点,并将返回值作为root的左子节点

   3.开启递归左节点,并将返回值作为root的右子节点

3.返回值：返回当前节点root   

* 辅助栈

1.特例处理：当root为空，直接返回null

2.初始化：栈，加入根节点root

3.循环交换：当栈 stackstack 为空时跳出;
   
   1.出栈：记为node;
   
   2.添加子节点：将node左和右子节点入栈
   
   3.交换：交换node的左/右子节点
   
4.返回值：返回根节点root
   
### 对称的二叉树

* L.val=R.val ：即此两对称节点值相等。
* L.left.val=R.right.val ：即 L 的 左子节点 和 R 的 右子节点 对称；
* L.right.val=R.left.val ：即 L 的 右子节点 和 R 的 左子节点 对称

### 顺时针打印矩阵
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。

输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
输出：[1,2,3,6,9,8,7,4,5]
   
   
### 包含min函数的栈

定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。

### 数组中出现次数超过一半的数字

* 哈希表统计法
* 数组排序法
* 摩尔投票法

### 最小的k个数
* 排序
* 堆
* 快排思想

### 扑克牌中的顺子
输入: [1,2,3,4,5]
输出: True

### 二叉树的最近公共祖先