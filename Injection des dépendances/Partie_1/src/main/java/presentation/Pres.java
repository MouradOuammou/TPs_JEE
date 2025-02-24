package presentation;

import dao.IdaoImpl;
import metier.IMetierImpl;

public class Pres{
    public static void main(String[] args) {
        IdaoImpl idao = new IdaoImpl();
        IMetierImpl metier = new IMetierImpl(idao);
        System.out.println("Res ="+metier.Calcul());
    }
}
