package strategies;

import Models.Floor;
import Models.ParkingLot;
import Models.Slot;
import Models.VehicleType;

public class RandomSlotAssignmentStrategy implements SlotAssignmentStrategy {
    public Slot assignSlot(ParkingLot parkingLot, VehicleType vehicleType) {
        for(Floor floor : parkingLot.getFloors()) {
            for(Slot slot: floor.getSlot()){
                if(slot.getVehicleType() == vehicleType){
                    return slot;
                }
            }
        }
        return null;
    }
}
