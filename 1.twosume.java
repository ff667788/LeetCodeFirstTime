public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] tempstore=new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            tempstore[i]=numbers[i];
        }
        Arrays.sort(tempstore);
        int [] result=new int[2];
        int signBreak=0;
        for(int i=0;i<tempstore.length;i++){
            for(int j=i+1;j<tempstore.length;j++){
                int plus=tempstore[i]+tempstore[j];
                if(plus==target){
                    result[0]=tempstore[i];
                    result[1]=tempstore[j];
                    signBreak=1;
                }
            }
            if(signBreak==1)
            break;
        }
           int [] indexResult=new int[2];
           int increment=0;
           for(int i=0;i<numbers.length;i++){
               if(numbers[i]==result[0]||numbers[i]==result[1]){
               indexResult[increment]=i+1;
               increment++;
               }
           }
           Arrays.sort(indexResult);
          return indexResult;
    }
    
  
}