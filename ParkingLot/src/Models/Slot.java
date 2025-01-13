package Models;

public class Slot {
    private int slotNo;
    private SlotStatus slotStatus;
    private  VehicleType vehicleType;
    private  Floor floor;

    public int getSlotNo() {
        return slotNo;
    }
    public void setSlotNo(int slotNo) {
        this.slotNo = slotNo;
    }
    public SlotStatus getSlotStatus() {
        return slotStatus;
    }
    public void setSlotStatus(SlotStatus slotStatus) {
        this.slotStatus = slotStatus;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
    public Floor getFloor() {
        return floor;
    }
    public void setFloor(Floor floor) {
        this.floor = floor;
    }

}
