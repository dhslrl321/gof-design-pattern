package p0;

public class Main {
    public static void main(String[] args) {
        Meeting firstMeeting = new Meeting("강남 아지트");
        Meeting secondMeeting = new Meeting("안국 아지트");

        Club club = new Club();

        club.addMeeting(firstMeeting);
        club.addMeeting(secondMeeting);
    }
}
