public class InternetDevice{
    String name;
    boolean isConnected;
    static int connectedDevices;
    
    void displayConnections(){
    System.out.println("Status:");
    }
    void displayStatus(){
        System.out.println("Status:");
        System.out.println("Name of the Device: " + name);
        System.out.println("Is it connected? " + isConnected);
    };
    
    void isConnectedStatus(){
        System.out.println("Status:");
        System.out.println("Is it connected? " + isConnected);
    };
    
    public static void main(String[] args) {
        InternetDevice device1=new InternetDevice("Phone");
        device1.displayStatus();
        device1.connect();
        InternetDevice device2=new InternetDevice("Washing Machine");
        device2.displayStatus();
        device2.connect();
        InternetDevice device3=new InternetDevice("Computer");
        device3.displayStatus();
        device3.connect();
        InternetDevice device4=new InternetDevice("Laptop");
        device4.displayStatus();
        InternetDevice device5=new InternetDevice("TV");
        device5.displayStatus();
    }
    
    void connect(){
    isConnected=true;
    }
    void disconnect(){
    isConnected=false;
    }
    
    InternetDevice(String name){
        this.name = name;
    }
}