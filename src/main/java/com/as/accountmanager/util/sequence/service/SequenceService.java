package com.as.accountmanager.util.sequence.service;

import com.as.accountmanager.common.Response;
import com.as.accountmanager.common.ResponseVO;
import com.as.accountmanager.util.Log;
import com.as.accountmanager.util.sequence.dao.vo.SequenceVO;
import com.as.accountmanager.util.sequence.logic.SequenceLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/***
 * test service for sequence
 */

@RestController
@RequestMapping(value="/sequence")
public class SequenceService {
    @Autowired
    private SequenceLogic sequenceLogic;

    @RequestMapping(method=RequestMethod.POST,  value="addSequence")
    public ResponseVO addSequence(SequenceVO sequenceVO) {
        sequenceLogic.addSequence(sequenceVO);
        return Response.Ok();
    }

    @RequestMapping(method=RequestMethod.POST, value="/getValue")
    public ResponseVO getValue(@RequestBody SequenceVO sequenceVO) {
        int value = sequenceLogic.getValue(sequenceVO.getName());
        Log.info(getClass(), "the sequence is: " + String.valueOf(value));
        return Response.Ok(String.valueOf(value));
    }

    @RequestMapping(method=RequestMethod.POST, value="/resetSequence")
    public ResponseVO resetSequence(@RequestBody SequenceVO sequenceVO) {
        sequenceLogic.resetSequence(sequenceVO.getName());
        return Response.Ok();
    }
}
