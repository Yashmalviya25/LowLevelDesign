package repositories;

import Models.Gate;
import Models.Operator;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
    private  final Map<Integer, Gate> gates = new TreeMap<>();
    public  GateRepository(){

    }
    public Optional<Gate> findGateById(int id){
        Gate gate = gates.getOrDefault(id,null);
        return Optional.ofNullable(gate);
    }

}
