package com.seyed.twilliosendsms.payload;

import lombok.Data;

@Data
public class SMSRequest {
    private String to;
    private String message;
}