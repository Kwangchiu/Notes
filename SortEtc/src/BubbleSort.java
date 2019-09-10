/*
基本思想：两个数比较大小，较大的数下沉，较小的数冒起来。

过程：

    比较相邻的两个数据，如果第二个数小，就交换位置。
    从后向前两两比较，一直到比较最前两个数据。最终最小数被交换到起始的位置，这样第一个最小数的位置就排好了。
    继续重复上述过程，依次将第2.3...n-1个最小数排好位置。


平均时间复杂度：O(n2)

 */
public class BubbleSort {
    public void BubbleSort1(int[] arr) {
        if(arr.length <= 1) return;//只有一个元素就不需要排序
        int temp;//临时变量
        for (int i = 0; i < arr.length - 1; i++) {//表示趟数，一共arr.length-1次
            boolean flag = false;//提前退出冒泡循环的标志位，即一次循环中没有交换任何元素
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag = true;
                }
            }
            if(!flag) break;
        }
    }
    public static void main(String []args){
        int[] arr= {1, 3, 4, 2, 8, 7};
        BubbleSort bs = new BubbleSort();
        bs.BubbleSort1(arr);
        for(int a:arr){
            System.out.println("排序后：" + a);
        }
    }
}


