package com.example.maintenance_monitor_goetterer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonitorMessageTest {

    @Test
    public void testSetMessage() {
        String expected = "New message";
        MonitorMessage message = new MonitorMessage("Old message");

        message.setMessage(expected);

        String result = message.getMessage();

        assertEquals(expected, result);
    }

    @Test
    public void testGetMessage() {
        String expected = "Getting message!";
        MonitorMessage message = new MonitorMessage(expected);

        String result = message.getMessage();

        assertEquals(expected, result);
    }
}