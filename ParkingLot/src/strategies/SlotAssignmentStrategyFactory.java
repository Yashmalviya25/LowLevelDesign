package strategies;

import Models.SlotAssignmentStrategyType;

public class SlotAssignmentStrategyFactory {
    public static SlotAssignmentStrategy getSlotAssignmentStrategyByType(SlotAssignmentStrategyType type){
        if(type == SlotAssignmentStrategyType.RANDOM){
            return  new RandomSlotAssignmentStrategy();
        }
        return  null;
    }
}
