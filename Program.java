public class Program {
    public static void main(String args[]){

        int arr[][]=new int[4][4];

        arr[0][0]=1;
        arr[1][0]=2;
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
            
        }

    }
    
}
