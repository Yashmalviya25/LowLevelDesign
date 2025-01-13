package Models;

import java.sql.Date;
import java.sql.Time;

public class Ticket extends BaseEntity {
    private  Slot slot;
    private Date entryTime;
    private  Vehicle vehicle;
    private Operator operator;
    private  Gate gate;

    public Slot getSlot() {
        return slot;
    }
    public void setSlot(Slot slot) {
        this.slot = slot;
    }
    public Date getEntryTime() {
        return entryTime;
    }
    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Operator getOperator() {
        return operator;
    }
    public void setOperator(Operator operator) {
        this.operator = operator;
    }
    public Gate getGate() {
        return gate;
    }
    public void setGate(Gate gate) {
        this.gate = gate;
    }
}
