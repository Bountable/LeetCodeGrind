class Solution {


    public int diagonalPrime(int[][] nums) {
        

        int biggestPrime = 0;

        for(int i =0; i<= nums.length-1; i++){

           if(isPrime(nums[i][i]) && nums[i][i] >biggestPrime ){
                biggestPrime = nums[i][i];
           }    


        }

        for (int i = 0; i < nums.length; i++) {
            int j = nums.length - 1 - i; 
            if (isPrime(nums[i][j]) && nums[i][j] > biggestPrime) {
                biggestPrime = nums[i][j];
            }
        }


        return biggestPrime;

    }
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i * i <= number; i++) { 
            if (number % i == 0) {
                return false; // Not prime
            }
        }
        return true;
    }
}