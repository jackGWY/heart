package wk.entity;

public class Chat {
    private String patient;
    private String message;
    private String doctor;

    public Chat(String patient, String message, String doctor) {
        this.patient = patient;
        this.message = message;
        this.doctor = doctor;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
}
