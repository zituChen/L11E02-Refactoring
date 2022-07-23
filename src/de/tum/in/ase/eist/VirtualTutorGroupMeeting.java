package de.tum.in.ase.eist;

import java.net.URL;

public class VirtualTutorGroupMeeting extends TutorGroupMeeting{
	private static final int NUMBER_OF_HOMEWORK_PRESENTATIONS = 3;
	private final URL url;

	public VirtualTutorGroupMeeting(TimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractice, URL url) {
		super(timeSlot, tutorGroup, skillToPractice);
		this.url = url;
	}
	public URL getUrl() {
		return url;
	}

	@Override
	public void stepOne() {

		getTutorGroup().getTutor().say("Welcome to the virtual tutor meeting");
		getTutorGroup().getTutor().say("Thank you for joining using " + url.toString() + " today.");
		getTutorGroup().getTutor().say("Please turn on your cameras");
	}

	@Override
	public void stepFive() {


		getTutorGroup().getTutor().say("Thank you that you have participated using the " + url + " today.");
	}

}
