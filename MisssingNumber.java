///////////////////////////////////////////////////////////////
//
//      Program : Find Missing Number
//      Logic : n * n + 1/2
//      Input : 1   2   3   4   6   7   8
//      output: 5
//////////////////////////////////////////////////////////////////
class Notepad
{
    public static void main(String A[])
    {
        int Arr[] = {1,2,3,4,6,7};

        int iSum = 0;
        int iTotal = 0;

        int n = Arr.length + 1;

        iTotal = n * (n + 1)/2;

        for(int num : Arr)
        {
            iSum = iSum + num;
        }

        int iMisNum = iTotal - iSum;

        System.out.println("Missing Number are: "+iMisNum);
    }
}