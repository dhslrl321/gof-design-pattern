package p0;

import java.util.ArrayList;
import java.util.List;

public class Club {
    private String name;
    private List<Meeting> meetings = new ArrayList<>();

    public void showMeetings() {
        meetings.stream()
                .forEach(meeting -> meeting.describe());
    }

    public void addMeeting(Meeting meeting) {
        meetings.add(meeting);
    }

    public void removeMeeting(Meeting meeting) {
        meetings.remove(meeting);
    }
}
