package ext;

import dao.Idao;
import org.springframework.stereotype.Component;

@Component("daoV2")
public class IdaoImplV2  implements Idao {

    @Override
    public double getData() {
        System.out.println("Version Web Services");
        double press = 15.2 ;
        return  press;
    }
}
