package com.as.accountmanager.util.sequence.service;

import com.as.accountmanager.common.Response;
import com.as.accountmanager.common.ResponseVO;
import com.as.accountmanager.util.sequence.dao.vo.SequenceVO;
import com.as.accountmanager.util.sequence.logic.SequenceLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/sequence")
public class SequenceService {
    @Autowired
    private SequenceLogic sequenceLogic;

    @RequestMapping(method= RequestMethod.POST, value="addSequence")
    public ResponseVO addSequence(@RequestBody SequenceVO sequenceVO) {
        sequenceLogic.addSequence(sequenceVO);
        return Response.Ok();
    }
}
