package m_mehdi;
import java.time.LocalDateTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        ClockDisplay clock = new ClockDisplay(now.getHour(),now.getMinute(),now.getSecond());
        MyFrame myFrame = new MyFrame(clock);

    }
}
