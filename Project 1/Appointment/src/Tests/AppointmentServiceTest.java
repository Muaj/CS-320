package Tests;

import org.junit.Test;

import Classes.Appointment;
import Classes.AppointmentService;

import static org.junit.Assert.*;
import java.util.Date;

public class AppointmentServiceTest {

    @Test
    public void testAddAndDeleteAppointment() {
        // Test adding and deleting appointments
        AppointmentService appointmentService = new AppointmentService();
        Appointment appointment = new Appointment("A123456789", new Date(), "Sample Appointment");

        appointmentService.addAppointment(appointment);
        assertNotNull(appointmentService.getAppointment("A123456789"));

        appointmentService.deleteAppointment("A123456789");
        assertNull(appointmentService.getAppointment("A123456789"));
    }
}

