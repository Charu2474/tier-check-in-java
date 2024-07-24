import java.io.*;
import java.util.*;


public class Solution {

public static void main(String[] args)
{
    Scanner sh=new Scanner(System.in);
    int str1=sh.nextInt();
    int str2=sh.nextInt();
    int str3=sh.nextInt();
    int des=sh.nextInt();
    System.out.println("Front-left : "+ (str1<33? "Inflate":(str1> 33? "Deflate": "Untouched")));
    System.out.println("Rear-left : "+(str2<33? "Inflate":(str2> 33?"Deflate": "Untouched")));
    System.out.println("Rear-right : "+(str3<33? "Inflate":(str3>33? "Deflate" : "Untouched")));
    System.out.println("Front-right : " +(des<33 ?"Inflate":(des>33? "Deflate": "Untouched")));
                   }
                   }
                   
