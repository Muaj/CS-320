package Classes;
import java.util.HashMap;
import java.util.Map;

public class AppointmentService {
    private final Map<String, Appointment> appointments;

    public AppointmentService() {
        this.appointments = new HashMap<>();
    }

    public void addAppointment(Appointment appointment) {
        appointments.put(appointment.getAppointmentID(), appointment);
    }

    public void deleteAppointment(String appointmentID) {
        appointments.remove(appointmentID);
    }

    public Appointment getAppointment(String appointmentID) {
        return appointments.get(appointmentID);
    }
}
