package dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("dao2")
@Profile("prod")
public class DaoImpl2 implements IDao {
    @Override
    public double getValue() {
        // 150.0
        return 150.0;
    }
}

