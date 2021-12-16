package org.example.Lab1.fabric;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestFabricMethodService {

    @Test
    void exec() {
        Configuration configuration1 = Configuration.initMob();
        Configuration configuration2 = Configuration.initWeb();

        Assert.assertEquals("MOB", configuration1.getPlatform());

        Assert.assertEquals("WEB", configuration2.getPlatform());
    }
}