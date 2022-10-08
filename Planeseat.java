public class Planeseat {
    int seatId;
    boolean assigned;
    int CustomerId;

    public Planeseat(int seatId){
        this.seatId = seatId;
        assigned = false;
        CustomerId = -1;
    }

    int getSeatID(){
        return seatId;
    }

    int getCustomerId(){
        return CustomerId;
    }

    boolean isOccupied(){
        return assigned;
    }

    void assign(int cust_id){
        CustomerId = cust_id;
        assigned = true;
    }

    void unassign(){
        CustomerId = 0;
        assigned = false;
    }
}
