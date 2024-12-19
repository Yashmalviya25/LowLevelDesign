package Models;

public class Slot {
    private int slotNo;
    private SlotType slotType;
    private SlotStatus slotStatus;

    public int getSlotNo() {
        return slotNo;
    }
    public void setSlotNo(int slotNo) {
        this.slotNo = slotNo;
    }
    public SlotType getSlotType() {
        return slotType;
    }
    public void setSlotType(SlotType slotType) {
        this.slotType = slotType;
    }
    public SlotStatus getSlotStatus() {
        return slotStatus;
    }
    public void setSlotStatus(SlotStatus slotStatus) {
        this.slotStatus = slotStatus;
    }

}
