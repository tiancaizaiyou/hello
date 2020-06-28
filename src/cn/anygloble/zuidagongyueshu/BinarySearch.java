package cn.anygloble.zuidagongyueshu;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] whiteList = {122,3423,321,453,4333,2125,333,222,11,2,2,44};
        Arrays.sort(whiteList);
        for (int i = 0; i < whiteList.length; i++) {
            int key = whiteList[i];
            if(rank(key,whiteList)==-1){
                System.out.println(key);
            }
        }
    }

    private static int rank(int key, int[] whiteList) {
        int lo = 0;
        int hi = whiteList.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if (key<whiteList[mid]) hi = mid-1;
            else if (key>whiteList[mid]) lo = mid+1;
            else return mid;
        }
        return -1;
    }
}
