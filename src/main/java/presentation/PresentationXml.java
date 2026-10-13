package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Récupère le bean métier configuré en XML
        IMetier metier = context.getBean("metier", IMetier.class);

        // résultat
        System.out.println("Résultat (via XML) = " + metier.calcul());
    }
}