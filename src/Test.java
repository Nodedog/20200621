public class Test {


    public static void main(String[] args) {
        String str1="They are students";
        String str2="aeiou";
        String[] str = str1.split(" ");                //以空格为切割，然后返回一个切割后的字符串数组
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }


}
