/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author marcc
 */
public class MyException extends Exception {
    
    public static final int NUMBER_ARGUMENTS = 0;
    public static final int ROOM_EXIST = 1;
    public static final int WRONG_SERVICE = 2;
    public static final int WORKER_ALREADY_EXIST = 3;
    public static final int ANY_ROOM_AVAILABLE = 4;

    private int code;

    private List<String> messages = Arrays.asList(
            "[ Wrong number of arguments ]",
            "[ Room already exists ]",
            "[ Wrong command ]",
            "[ Wrong command ]"
            );

    public MyException(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return messages.get(code);
    }

}