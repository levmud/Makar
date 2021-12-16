package org.example.Lab2.bridge;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestBridgeService {

    @Test
    void testDevice() {
        Device device1 = new Tv();
        BasicRemote basicRemote = new BasicRemote(device1);
        Assert.assertEquals(30, device1.getVolume());
        basicRemote.volumeDown();
        Assert.assertEquals(20, device1.getVolume());

        Device device2 = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(device2);
        Assert.assertEquals(1, device2.getChannel());
        advancedRemote.channelUp();
        Assert.assertEquals(2, device2.getChannel());

        Device device3 = new Radio();
        AdvancedRemote advancedRemoteMute = new AdvancedRemote(device3);
        Assert.assertEquals(30, device3.getVolume());
        advancedRemoteMute.mute();
        Assert.assertEquals(0, device3.getVolume());
    }

}