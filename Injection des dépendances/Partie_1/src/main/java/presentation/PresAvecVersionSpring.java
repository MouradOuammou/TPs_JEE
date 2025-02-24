package presentation;
import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class PresAvecVersionSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configSpring.xml");
        IMetier metier =  context.getBean(IMetier.class);
        System.out.println("Res = "+metier.Calcul());
    }
}
