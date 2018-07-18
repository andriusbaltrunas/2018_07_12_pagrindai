package days.fifth;

import java.util.EnumSet;

/**
 * Created by andriusbaltrunas on 7/18/2018.
 */
public enum Week {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7), DEFAULT(0);

    private int id;

    Week(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static Week getDayById(int numb) {
        Week result = DEFAULT;
        for (Week week : Week.values()) {
            if (week.getId() == numb) {
                result = week;
                break;
            }
        }
        return result;
    }
}
