import java.util.Comparator;
import java.util.*;

public class Plane {

    //Planeseat[] seatsobject;
    int numEmptySeat;

    Planeseat[] seat = new Planeseat[12];
    
    public Plane(){
        for(int i=0;i<seat.length;i++){
            seat[i] = new Planeseat(i+1);
        }
    }

    Planeseat[] sortSeats(){
        
        Planeseat[] sortedseat;
        sortedseat = seat;

        Arrays.sort(sortedseat,new Comparator<Planeseat>() {
            public int compare(Planeseat a, Planeseat b)
            {
                if(a.seatId > b.seatId){
                    return 1;
                }
                else if(a.seatId < b.seatId){
                    return -1;
                }
                else{
                    return 0;
                }
                
            }
            
        });
        return sortedseat;
    }


    void showNumEmptySeats(){

        int count = 0;
        for(int i=0;i<seat.length;i++)
        {
                if(seat[i].isOccupied() == false){
                    count++;
                }
        }

        System.out.println("Number of Empty Seats are: " + count);
    }

    void showEmptySeats(){
        
        System.out.println("List of empty seats: ");
        for(int i=0;i<seat.length;i++){
            if(seat[i].isOccupied() == false){
                
                System.out.println(seat[i].seatId);
            }
            
        }
    }

    void showAssignedSeats(boolean byseatid){

        
        if(byseatid == true){
            Arrays.sort(seat,new Comparator<Planeseat>() {
                public int compare(Planeseat a, Planeseat b)
                {
                    if(a.seatId > b.seatId){
                        return 1;
                    }
                    else if(a.seatId < b.seatId){
                        return -1;
                    }
                    else{
                        return 0;
                    }
                    
                }
                
            });
        }
        else{
            Arrays.sort(seat,new Comparator<Planeseat>() {
                public int compare(Planeseat a, Planeseat b)
                {
                    if(a.CustomerId > b.CustomerId){
                        return 1;
                    }
                    else if(a.CustomerId < b.CustomerId){
                        return -1;
                    }
                    else{
                        return 0;
                    }
                    
                }
                
            });
        }
        

        for(int i=0;i<seat.length;i++){
            if(seat[i].isOccupied() == true){
                System.out.println("seatID " + seat[i].seatId + " assigned to customer ID" + seat[i].CustomerId);
            }
        }

        
    }

    void assignSeat(int seatID, int cust_id){

        
        for(int i=0;i<seat.length;i++){
            if(seat[i].seatId == seatID){
                if(seat[i].isOccupied() == false){
                    seat[i].CustomerId = cust_id;
                    seat[i].seatId = seatID;
                    seat[i].assign(cust_id);
                    System.out.println("Seat assigned!");
                }
                else{
                    System.out.println("Seat is already assigned!");
                    return;
                }
            
            
            
        }
        }
    }

    void unAssignSeat(int seatID){
        for(int i=0;i<seat.length;i++){
            if(seat[i].seatId == seatID){
                seat[i].unassign();
                System.out.println("Seat unassigned!");
            }
        }
    }

    

    


    
}
