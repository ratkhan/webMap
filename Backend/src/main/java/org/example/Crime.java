package org.example;

import lombok.Data;
import java.util.Date;

@Data
public class Crime {
    private final CrimeType crimeType;
    private final Date occurrenceDate;
    private final Location location;
}
