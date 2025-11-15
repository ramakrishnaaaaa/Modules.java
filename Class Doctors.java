// Base class
class Doctor {
    void consultationFee() {
        System.out.println("General Doctor Consultation Fee: Rs. 300");
    }
}

// Subclass 1
class Dentist extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Dentist Consultation Fee: Rs. 500");
    }
}

// Subclass 2
class Cardiologist extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Cardiologist Consultation Fee: Rs. 800");
    }
}

// Subclass 3
class Surgeon extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Surgeon Consultation Fee: Rs. 1000");
    }
}

// Main class
public class DoctorTest {
    public static void main(String[] args) {

        Doctor d1 = new Doctor();
        Doctor d2 = new Dentist();
        Doctor d3 = new Cardiologist();
        Doctor d4 = new Surgeon();

        d1.consultationFee();
        d2.consultationFee();
        d3.consultationFee();
        d4.consultationFee();
    }
}
