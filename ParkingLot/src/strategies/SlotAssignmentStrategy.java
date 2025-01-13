package strategies;

import Models.ParkingLot;
import Models.Slot;
import Models.VehicleType;

public interface SlotAssignmentStrategy {
    Slot assignSlot(ParkingLot parkingLot,VehicleType vehicleType);
}
