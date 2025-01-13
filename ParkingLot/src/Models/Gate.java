package Models;

public class Gate  extends  BaseEntity{
    private GateType gateType;
    private  int gateNumber;
    private GateStatus gateStatus;
    private  Operator operator;

    public GateStatus getGateStatus() {
        return gateStatus;
    }
    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
    public Operator getOperator() {
        return operator;
    }
    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateType getGateType() {
        return gateType;
    }
    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
    public int getGateNumber() {
        return gateNumber;
    }
    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

}
