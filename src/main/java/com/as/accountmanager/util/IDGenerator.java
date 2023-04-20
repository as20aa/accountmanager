package com.as.accountmanager.util;

import com.as.accountmanager.util.sequence.logic.SequenceLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * IDGenerator
 * @date 20230419
 * @author as
 * @version 1
 * @description use to generate user id for every new user
 */
@Component
public class IDGenerator {

    @Autowired
    private SequenceLogic sequenceLogic;
    public String getID() throws Exception {
        int value = sequenceLogic.getValue(Constants.ID_NAME);
        return String.format("%010d", value);
    }
}
