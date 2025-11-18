package test;

public class test2 {
    public static void main(String[] args) {
        //判断101~200之间有多少个质数，并输出所有质数
        int count = 0;
        for (int i = 101; i <=200 ; i++) {
            boolean prime = true;
            
            for (int j = 2; j <=Math.sqrt(i); j++) {
                if (i%j==0) {
                    
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(i+" ");
                count++;
            }
        }
            System.out.println("一共有"+count+"个质数");
        }
    }

