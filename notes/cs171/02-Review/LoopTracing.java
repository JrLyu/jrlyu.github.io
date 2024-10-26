public class LoopTracing {
    public static void main(String[] args) {
        int sum = 1;
        for ( int i = 0; i <= 5; sum = sum + i++ );      
        
        System.out.print(sum); // 16 = 1+0+1+2+3+4+5
    }
}
