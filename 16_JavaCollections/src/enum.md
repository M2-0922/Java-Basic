```
public static final int MONDAY = 1;
public static final int TUESDAY = 2;
public static final int WEDNESDAY = 3;
public static final int THURSDAY = 4;
public static final int FRIDAY = 5;
public static final int SATURDAY = 6;
public static final int SUNDAY = 7;

OR

public enum Days{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

<!-- int day = 1; -->
Days day = Days.MONDAY

switch(day){
    case MONDAY:
    case TUESDAY:
    case WEDNESDAY:
    case THURSDAY:
    case FRIDAY:
    case SATURDAY:
    case SUNDAY:
}