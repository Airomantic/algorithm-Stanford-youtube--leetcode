package PascalTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: interviewQuestion
 * @description: 帕斯卡的三角形
 * @author: jiangzq
 * @create: 2019-08-19 20:40
 **/
public class Solution_PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle =new ArrayList();
        if(numRows==0) return triangle;

        List<Integer> first_row = new ArrayList<Integer>();
        first_row.add(1);
        triangle.add(first_row);

        for(int i=1;i<numRows;i++){
            List<Integer> prev_row=triangle.get(i-1);
            List<Integer> row = new ArrayList<Integer>();

            row.add(1);

            for(int j=1;j<i;j++){
                row.add(prev_row.get(j-1)+prev_row.get(j));
            }

            row.add(1);
            triangle.add(row);
        }
        return triangle;

    }
}
