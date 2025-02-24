package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// Lors de lancement De App Spring creer objet de cette classe nomme dao
// Repository comme Component mais pour indiquer appartient au cauche dao
@Repository("dao")
public class IdaoImpl implements Idao {
    @Override
    public double getData() {
        System.out.println("Version  BD");
        Double Press = 10.1 ;
        return Press;
    }
}
