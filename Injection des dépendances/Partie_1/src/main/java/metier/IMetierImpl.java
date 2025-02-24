package metier;

import dao.Idao;
import dao.IdaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// Servives Comme Component mais pour cauche Services
@Service("metier")

public class IMetierImpl implements IMetier {

    private Idao idao;

    public IMetierImpl(@Qualifier("daoV2") Idao idao) {
        this.idao = idao;
    }


    public void setIdao(Idao idao) {
        this.idao = idao;
    }

    @Override
    public double Calcul() {
        double data = idao.getData();
        double result = data * 1.0;
        return result;
    }

}
