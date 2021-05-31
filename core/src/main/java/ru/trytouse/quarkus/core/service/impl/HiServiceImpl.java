package ru.trytouse.quarkus.core.service.impl;

import ru.trytouse.quarkus.core.service.HiService;

public class HiServiceImpl implements HiService {

    @Override
    public String getGreeting() {
        return "Hello Good developer";
    }
}
