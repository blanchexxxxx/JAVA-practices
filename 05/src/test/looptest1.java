package test;

public class looptest1 {
    public static void main(String[] args) {
        
        for (int j = 1; j <=100; j++) {
            if (j%7==0||j%10==7||j/10%10==7) {
                System.out.println("过");
                continue;
            }
            System.out.println(j);
        }
            
        }
    }
