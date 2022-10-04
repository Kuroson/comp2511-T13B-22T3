package unsw.training;

import java.util.List;

/**
 * A trainer that runs in person seminars.
 *
 * @author Robert Clifton-Everest
 *
 */
public class Trainer {
    private String name;
    private String room;

    private List<Seminar> seminars;

    public List<Seminar> getSeminars() {
        return seminars;
    }

    public LocalDate book(String employee, List<LocalDate> availablity) {
        for (Seminar seminar : seminars) {
            LocalDate booked = seminar.book(employee, availablity);
            if (booked != null)
                return booked;
        }
        return null;
    }
}
