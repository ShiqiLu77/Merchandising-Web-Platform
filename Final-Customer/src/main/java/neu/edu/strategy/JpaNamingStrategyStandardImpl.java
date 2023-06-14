package neu.edu.strategy;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

import lombok.Setter;

public class JpaNamingStrategyStandardImpl extends PhysicalNamingStrategyStandardImpl {
    @Setter
    private static int mode = 0;

    @Override
    public Identifier toPhysicalColumnName(Identifier name, JdbcEnvironment context) {
        if (mode == 1) {
            if (name.isQuoted()) {
                return name;
            } else {
                return Identifier.toIdentifier("`" + name.getText() + "`", true);
            }
        } else {
            return name;
        }
    }
}
