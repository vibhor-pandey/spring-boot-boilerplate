package spring.boiler.plate.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
public class Author {
    private final String firstName;
    private final String lastName;
    private final LocalDate birthday;
    private final String country;
    private final int writingHoursPerDay;
}
