public class statistics
{
    int rangeS;
    int rangeE;
    int sum=0;
    int howManyElements(){
     return(rangeE-rangeS-1);
    };
    
    int sumOfElements(){
    sum=0; 
     for(int i=rangeS+1;i<rangeE;i++){
        sum=i+sum;
        
        }
    return sum;
    };
    void meanOfElements(){
     sum=sumOfElements();
     int hme=howManyElements();
     System.out.print(sum/hme);
    };
}
