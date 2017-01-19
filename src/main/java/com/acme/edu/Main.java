package com.acme.edu;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        Controller c = new Controller(
            new XXxWriter(),
            new XxxReader()
        );
        c.doEtl();
        c.doEtl();

        //Scope: request, session, aaplication, ....
        c = new Controller(
            new XXxWriter(),
            new XxxReader()
        );
        c.doEtl();

        c = new Controller() {
            new xxxWriter(),
            new ReaderFactory(),
        }

    }
}

@Component
@Bean
@Scope
class Controller {
    @Inject @Named("") private Writer eriter;
    @Autowired("ds_name") private DataSrouce ds;

    @PostConstruct

}

<beans>
    <bean id = "jhdkg" type =CsvWrter>
        <constructor-arg>3
    </b>
</b>
