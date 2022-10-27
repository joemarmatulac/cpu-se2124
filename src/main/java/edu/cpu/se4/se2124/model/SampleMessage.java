package edu.cpu.se4.se2124.model;

import lombok.Data;

@Data
public class SampleMessage {
    private String message;
    private String sender;

    public SampleMessage() {
    }
}
