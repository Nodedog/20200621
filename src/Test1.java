
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        //创建一个从键盘输入对象
        String s = scan.nextLine();                    //保存输入的字符串
        String[] str = s.split(" ");                //以空格为切割，然后返回一个切割后的字符串数组
        int len = str.length;                        //计算字符串数组的长度
        String string = "";                            //定义最后要保存到的字符串
        for (int i = len - 1; i >= 0; i--) {            //循环遍历字符串数组
            if (i != 0) {                            //判断字符串数组是否循环到最后一个字符串
                string = string + str[i] + " ";        //把一个个字符串拼接起来，中间再用空格隔开
            } else {                                    //这里表示已经循环到最后一个字符串
                string = string + str[i];            //最后一个字符串拼接不用再加空格
            }
        }
        System.out.println(string);                    //将结果输出到控制台

    }

}