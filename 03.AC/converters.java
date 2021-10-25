public class converters
{
    double temK;
    double temC;
    double temF;
    
    
    void fToK(){
    temK = (temK-273.15)+32;
    }
   
    void kToF(){
    temF = 1.8*(temK-273.15)+32;
    }
    
    void cToF(){
    temF=1.8*(temC)+32;
    }
    
    void fToC(){
    temC=0.5555*(temF-32); 
    }
    
    void cToK(){
    temK=temC+273;
    }
  
    void kToC(){
    temC=temK-273;
    }
    
}

