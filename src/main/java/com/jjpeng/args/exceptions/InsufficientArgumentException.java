package com.jjpeng.args.exceptions;

public class InsufficientArgumentException extends RuntimeException{
    private String option;

    public InsufficientArgumentException(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }
}
