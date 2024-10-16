package com.example;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class WrapperTime {

    @JsonFormat( pattern = "yyyy:MM:dd--:HH:mm:ss:SSS", locale = "ru")
    private LocalDateTime time;

    public WrapperTime(LocalDateTime time) {
        this.time = time;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
