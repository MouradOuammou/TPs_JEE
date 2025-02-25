package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAvecInnotation {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("ext","dao","metier");
        IMetier metier = (IMetier) context.getBean("metier");
        System.out.println("Res = "+metier.Calcul());
    }

}
