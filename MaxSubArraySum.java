///////////////////////////////////////////////////////////////
//
//      Program : Finds the largest sum of a contiguous subarray 
//      Logic : Kadane’s Algorithm
//      Input : Array Arr[] of n integer
//      output: The largest sum of Contiguous subarray
//
//////////////////////////////////////////////////////////////////


class KadaneAlgorithm
{
    public static int MaxContinuosSubArray(int[] Arr)
    {
        int Max = Arr[0];
        int Current = Arr[0];
        
        for(int i = 0; i < Arr.length; i++)
        {
             Current = Math.max(Arr[i], Current + Arr[i]);

               Max = Math.max(Max, Current);
        }

        return Max;
    }
    
}

class MaxSubArraySum
{
    public static void main(String A[])
    {
        int Arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int iRet = 0;

        iRet =KadaneAlgorithm.MaxContinuosSubArray(Arr);
        System.out.println("Maximum Continuous Subarray Sum is: "+iRet);
    }
}