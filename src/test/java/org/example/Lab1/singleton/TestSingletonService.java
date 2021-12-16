package org.example.Lab1.singleton;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSingletonService {

    @Test
    void exec() {
        Connection connection1 = Connection.getInstance();
        Connection connection2 = Connection.getInstance();
        Assert.assertEquals(connection2, connection1);
    }
}