package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Operators");
        final int MAX_COUNT = 100;
        System.out.println("MAX_COUNT ->" + MAX_COUNT);
        int count = 0;
        System.out.println("count value is" + count);

        count = count + 3;
        System.out.println("count is " + count);

        count+= 3;
        System.out.println("count += 3 ->" + count);

        count = count -7;
        System.out.println("count = count is" + count);

        count -=  7;
        System.out.println("count = count is" + count);

        count = count * 10;
// count is now -80
        System.out.println("count = count * 10 -> " + count);

        count *= -1;
// count is now 80
        System.out.println("count *= -1 -> " + count);

        count = count / 10;
// count is now 8
        System.out.println("count = count / 10 -> " + count);

        count /= 2;
// count is now 4
        System.out.println("count /= 2 -> " + count);

        int remainder = 10 % 5;
// remainder is 0
        System.out.println("remainder = 10 % 5 -> " + remainder);

        remainder = 10 % 6;
        System.out.println("remainder = 10 % 6 -> " + remainder);

        int index = 11;
        System.out.println("index = 11 -> " + index);

        index = -index;
        System.out.println("index = 11 -> " + index);

        ++index;
        System.out.println("++index ->" + index);

        index++;
        System.out.println("index++ ->" + index);

        --index;
// index is -10
        System.out.println("--index -> " + index);

        index--;
// index is -11
        System.out.println("index-- -> " + index);


        boolean flag = false;
        System.out.println(flag);

        flag = !flag;
        System.out.println(flag);

        flag = 3 ==4;
        System.out.println(flag);

        flag = 3 !=4;
        System.out.println(flag);


        flag = 3 > 4;
// flag is false
        System.out.println("3 > 4 -> " + flag);

        flag = 3 >= 4;
// flag is false
        System.out.println("3 >= 4 -> " + flag);

        flag = 3 < 4;
// flag is true
        System.out.println("3 < 4 -> " + flag);

        flag = 3 <= 4;
// flag is true
        System.out.println("3 <= 4 -> " + flag);

        flag = 3 > 4 && 10 % 2 == 0;
        System.out.println("3 > 4 && 10 % 2 == 0 -> " + flag);

        flag = 3 > 4 || 10 % 2 == 0;
        System.out.println("3 > 4 || 10 % 2 == 0 -> " + flag);






    }
}
