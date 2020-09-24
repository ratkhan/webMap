package org.example;
import lombok.ToString;
import lombok.Value;

@ToString
@Value
public class Location {
    private final double latitude;
    private final double longitude;

}
