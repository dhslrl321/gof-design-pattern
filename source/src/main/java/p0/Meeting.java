package p0;

import java.time.LocalDateTime;

public class Meeting {
    private String location;
    private LocalDateTime dateTime;

    public Meeting(String location) {
        this.location = location;
        dateTime = LocalDateTime.now();
    }

    public void describe() {
        System.out.println("location = " + location);
        System.out.println("dateTime = " + dateTime.toString());
    }
}
