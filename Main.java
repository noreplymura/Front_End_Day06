import java.util.*;
// int to String 
//skip the Numbers 
// 10 20 30 40 50 60 70 80 90 100 110

//index is 0+2+5+9

//10+30+60+100=200

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        int a[] = new int[arr.length];
        int i;
        for (i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }
        System.out.print("Sum Array Is :");
        int temp = 1;
        int res=0;
        for (i = 0; i < a.length; i+= temp) {
            res += a[i];
            temp++;
        }
        System.out.println(res);
    }
}
