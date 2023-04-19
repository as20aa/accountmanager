package com.as.accountmanager.util.sequence.logic;

import com.as.accountmanager.util.sequence.dao.SequenceDAO;
import com.as.accountmanager.util.sequence.dao.vo.SequenceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SequenceLogic {
    @Autowired
    private SequenceDAO sequenceDAO;
    public SequenceVO getSequence(String name) {
        return sequenceDAO.getSequence(name);
    }

    public void resetSequence(String name) {
        sequenceDAO.resetSequence(name);
    }

    public void addSequence(SequenceVO sequenceVO) {
        sequenceDAO.addSequence(sequenceVO);
    }
}
