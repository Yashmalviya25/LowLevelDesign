package Models;

public class Vehicle extends BaseEntity {
    private String vehicle_name;
    private VehicleType vehicle_type;
    private String vehicleNo;

    public String getVehicle_name() {
        return vehicle_name;
    }
    public void setVehicle_name(String vehicle_name) {
        this.vehicle_name = vehicle_name;
    }
    public VehicleType getVehicle_type() {
        return vehicle_type;
    }
    public void setVehicle_type(VehicleType vehicle_type) {
        this.vehicle_type = vehicle_type;
    }
    public String getVehicleNo() {
        return vehicleNo;
    }
    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }
}
