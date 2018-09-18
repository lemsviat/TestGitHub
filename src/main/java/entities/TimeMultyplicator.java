package entities;

import java.util.Date;

public class TimeMultyplicator {
    private Date date = new Date();

    public long multyply() {
        return date.getTime() * 2;
    }

}
