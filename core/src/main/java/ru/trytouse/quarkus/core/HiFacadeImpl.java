package ru.trytouse.quarkus.core;

import ru.trytouse.quarkus.common.HiFacade;
import ru.trytouse.quarkus.core.service.HiService;

public class HiFacadeImpl implements HiFacade {

    private HiService hiService;

    public HiFacadeImpl(HiService hiService) {
        this.hiService = hiService;
    }

    @Override
    public String getHiWord() {
        return hiService.getGreeting();
    }
}
