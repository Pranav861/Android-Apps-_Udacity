package com.example.android.soonami;

/**
 * {@Event} represents an tsunami event. It holds the details
 * of that event such as title (which contains magnitude and location
 * of the tsunami), as well as time, and whether or not a tsunami
 * alert was issued during the tsunami.
 */
public class Event {

    /** Title of the tsunami event */
    public final String title;

    /** Time that the tsunami happened (in milliseconds) */
    public final long time;

    /** Whether or not a tsunami alert was issued (1 if it was issued, 0 if no alert was issued) */
    public final int tsunamiAlert;

    /**
     * Constructs a new {@link Event}.
     *
     * @param eventTitle is the title of the tsunami event
     * @param eventTime is the time the tsunami happened
     * @param eventTsunamiAlert is whether or not a tsunami alert was issued
     */
    public Event(String eventTitle, long eventTime, int eventTsunamiAlert) {
        title = eventTitle;
        time = eventTime;
        tsunamiAlert = eventTsunamiAlert;
    }
}
