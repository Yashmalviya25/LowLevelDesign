package Models;

import java.util.List;

public class Floor {
    private int floorNo;
    private List<Slot>  slot;
    private FloorStatus status;

    public int getFloorNo() {
        return floorNo;
    }
    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }
    public List<Slot> getSlot() {
        return slot;
    }
    public void setSlot(List<Slot> slot) {
        this.slot = slot;
    }
    public FloorStatus getStatus() {
        return status;
    }
    public void setStatus(FloorStatus status) {
        this.status = status;
    }
}
