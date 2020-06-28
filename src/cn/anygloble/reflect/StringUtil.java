package cn.anygloble.reflect;

public class StringUtil {
    /**
     * 首字母大写
     */
    public static String initcap(String str){
        //空值判断
        if (str ==null || "".equals(str)){
            return str;
        }
        if (str.length()==1){
            return str.toUpperCase();
        } else {
            return str.substring(0,1).toUpperCase() + str.substring(1);
        }
    }
}
