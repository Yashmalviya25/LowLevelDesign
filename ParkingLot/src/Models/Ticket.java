package Models;

import java.sql.Time;

public class Ticket extends BaseEntity {
    private  Slot slot;
    private Time entryTime;
    private  Vehicle vehicle;

    public Slot getSlot() {
        return slot;
    }
    public void setSlot(Slot slot) {
        this.slot = slot;
    }
    public Time getEntryTime() {
        return entryTime;
    }
    public void setEntryTime(Time entryTime) {
        this.entryTime = entryTime;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
