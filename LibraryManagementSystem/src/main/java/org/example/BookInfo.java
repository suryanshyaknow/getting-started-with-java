package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

//@Data
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BookInfo {

    String issuedTo;
    LocalDateTime issuedOn;
    LocalDateTime returnedOn;
}
