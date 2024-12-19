package Models;

public class Operator  extends  BaseEntity{
    private String operatorName;
    private Gate gate;

    public String getOperatorName() {
        return operatorName;
    }
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
    public Gate getGate() {
        return gate;
    }
    public void setGate(Gate gate) {
        this.gate = gate;
    }
}
