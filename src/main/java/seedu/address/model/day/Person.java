package seedu.address.model.day;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private List<Day> days;

    public Person() {
        this.days = new ArrayList<>();
    }

    public List<Day> getDays() {
        return days;
    }

    public void setDays(List<Day> days) {
        this.days = days;
    }
}
