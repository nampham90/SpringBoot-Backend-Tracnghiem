package com.bezkoder.springjwt.common.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ErrorDto {
    private String id;
    private String msg;
}
