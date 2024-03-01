package Tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Classes.Appointment;

import static org.junit.Assert.*;
import java.util.Date;

public class AppointmentTest {

    @Test
    public void testAppointmentCreation() {
        // Test appointment creation
        Appointment appointment = new Appointment("A123456789", new Date(), "Sample Appointment");
        assertNotNull(appointment);
    }
    
    @Test
	public void testAppointmentTooLong(){
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
		Appointment appointment = new Appointment("A123456789000", new Date(), "Sample Appointment");
		assertNotNull(appointment);
		});
		
}
}
