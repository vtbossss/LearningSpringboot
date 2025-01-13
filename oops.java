import java.util.*;

class Class1{
     int method(int par1){

        par1=par1*par1;

        return par1;


     }
     int method(int par1,int par2){
        int res=par1*par2;

        return res;
     }
}

public class oops{
    public static void main(String[] args) {


        Class1 obj=new Class1();

       
        int b=obj.method(2,3);

      
        System.out.println(b);


       
        
        
    }
}