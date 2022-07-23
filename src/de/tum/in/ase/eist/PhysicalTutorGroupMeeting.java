package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.List;

public class PhysicalTutorGroupMeeting extends TutorGroupMeeting {
    private static final int NUMBER_OF_HOMEWORK_PRESENTATIONS = 3;
    private final String room;


    public PhysicalTutorGroupMeeting(TimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractice, String room) {
        super(timeSlot, tutorGroup, skillToPractice);
        this.room = room;
    }

    public String getRoom() {
        return room;
    }

    @Override
    public void stepOne() {

        getTutorGroup().getTutor().say("Welcome to the physical tutor meeting");
        getTutorGroup().getTutor().say("Thank you for coming to " + room + " today.");
    }
    @Override
    public void stepFive() {


		getTutorGroup().getTutor().say("Thank you that you have participated in " + room + " today.");
    }

}
