class Solution{


    public int minimumMoves(String s){

        int movesRequired = 0;
        int set3 = 0;


        StringBuilder sb = new StringBuilder(s);
        System.out.print(sb);
        System.out.print(sb.length());


        // 0    1   2   3
        // O    X   O   X

        //lenght = 3\

        //OXOX

        for(int i =0; i <= sb.length()-1; i++){


            if(sb.charAt(i) == 'X'){
                movesRequired  +=1;
                i +=2;
            }
        
        
           


        }





        return movesRequired;
    }



    //OOXXXOXOXX

}