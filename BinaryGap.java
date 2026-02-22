public class BinaryGap {
    public static int binaryGap(int n) {
        int prev = -1;
        int maxDist = 0;
        int position = 0;
        
        while(n > 0){
            
            if((n & 1) == 1){   // if current bit is 1
                
                if(prev != -1){
                    maxDist = Math.max(maxDist, position - prev);
                }
                
                prev = position;
            }
            
            n = n >> 1;
            position++;
        }
        
        return maxDist;
    }

    public static void main(String[] args) {
        int n = 22;
        System.out.println(binaryGap(n));
    }
}
