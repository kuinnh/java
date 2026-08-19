package cn.kuinn.dataStructures;

public class spareArray {
    public static void main(String[] args) {
        int[][] array = {{0, 0, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        int sum = 0; // 统计数组中非零元素的个数
        for(int[] row : array){
            for(int val : row){
                if(val != 0){
                    sum ++;
                }
            }
        }

        //创建稀疏数组并记录元数据
        int[][] spareArr = new int[sum + 1][3];
        spareArr[0][0] = array.length;
        spareArr[0][1] = array[0].length;
        spareArr[0][2] = sum;
        // 遍历原数组，将非零元素的坐标和值存入稀疏数组
        int l = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] != 0){
                    spareArr[l][0] = i;
                    spareArr[l][1] = j;
                    spareArr[l][2] = array[i][j];
                    l++;
                }
            }
        }
        //将稀疏数组转换为原数组
        int[][] array01 = new int[spareArr[0][0]][spareArr[0][1]];
        for (int i = 1; i < spareArr.length; i++) {
            int row = spareArr[i][0];
            int col = spareArr[i][1];
            int val = spareArr[i][2];
            array01[row][col] = val;
        }
        //输出原数组
        System.out.println("===================");
        for(int[] row : array01){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }

}
