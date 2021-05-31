package ru.trytouse.quarkus.app;

import ru.trytouse.quarkus.common.HiFacade;
import ru.trytouse.quarkus.core.HiFacadeImpl;
import ru.trytouse.quarkus.core.service.HiService;
import ru.trytouse.quarkus.core.service.impl.HiServiceImpl;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class Configuration {

    @Produces
    HiService hiService() {
        return new HiServiceImpl();
    }

    @Produces
    HiFacade hiFacade(HiService hiService) {
        return new HiFacadeImpl(hiService);
    }

}
