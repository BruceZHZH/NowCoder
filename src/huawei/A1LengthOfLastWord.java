package huawei;

import java.util.Scanner;

/**
 * Created by zhzh4 on 2016/11/11.
 * 计算字符串最后一个单词的长度，单词以空格隔开。
 */
public class A1LengthOfLastWord {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toString();
        int lastIndex =input.lastIndexOf(" ");
    }
}
