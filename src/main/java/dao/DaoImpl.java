package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {
    @Override
    public double getValue() {
        // Valeur fixe de 100.0
        return 100.0;
    }
}