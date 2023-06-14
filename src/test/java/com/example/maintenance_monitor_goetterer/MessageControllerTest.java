package com.example.maintenance_monitor_goetterer;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

class MessageControllerTest {

        @Test
        void setNewMessageTest() {
            // Arrange
            MessageController controller = new MessageController();
            String newMessage = "Service checks: No power until 5:00 pm";

            // Act
            controller.setMessage(newMessage);
            String message = controller.getMessage();

            // Assert
            assertEquals(message, newMessage);
        }

    @Test
    void receiveDataTest() {
        // Arrange
        String defaultMessage = "Everything works as expected!";
        MonitorMessage monitorMessage = new MonitorMessage(defaultMessage);

        // Act
        String message = monitorMessage.getMessage();

        // Assert
        assertEquals(message, defaultMessage);
    }

}

