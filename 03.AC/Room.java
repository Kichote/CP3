public class Room
{
    int number;
    int beds;
    boolean occupied;
    String guestName;
    
    Room(int number){
    this.number=number;
    this.beds=2;
    this.occupied=true;
    }
    
    Room(int number,int beds){
    this.number=number;
    this.beds=beds;
    this.occupied=true;
    }
    
    void checkIn(String guestName){
    this.guestName=guestName;
    }
    
    void checkOut(){
    guestName="";
    }
    
    void isOccupied(){
    if(occupied==true){
    System.out.println("Yes, room is occupied");
    }
    else{
    System.out.println("No, room is not occupied");
    }
    }
    
    
    
    void displayStatus(){
    System.out.println("Status: ");
    System.out.println("Room Number: " + number);
    System.out.println("Number of beds: " + beds);
    System.out.println("Status: ");
    System.out.println("Is it occupied? " + occupied);
    if(occupied==true){
    System.out.println("Guest Name: " + guestName);
    }
    }
    
    
    public static void main(String[] args) {
        Room rooms[] = new Room[6];
        rooms[1] = new Room(1);
        rooms[2] = new Room(2);
        rooms[3] = new Room(3);
        rooms[4] = new Room(4,3);
        rooms[5] = new Room(5,1);
    }
    
    static void listOfRooms(Room rooms[]){
    for(int i=0;i<rooms.length;i++){
    rooms[i].displayStatus();
    }
    }
}
