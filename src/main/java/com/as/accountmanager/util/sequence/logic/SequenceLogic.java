package com.as.accountmanager.util.sequence.logic;

import com.as.accountmanager.util.Log;
import com.as.accountmanager.util.sequence.dao.SequenceDAO;
import com.as.accountmanager.util.sequence.dao.vo.SequenceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class SequenceLogic {
    @Autowired
    private SequenceDAO sequenceDAO;
    @Transactional
    public int getValue(String name) throws Exception {
        SequenceVO sequenceVO = getSequence(name);
        Log.info(this.getClass(), sequenceVO);
        if (sequenceVO == null) {
            Log.info(this.getClass(), "sequence: " + name + " is not exist!");
            Log.info(this.getClass(), "add a new sequence");

            sequenceVO = new SequenceVO();
            sequenceVO.setName(name);
            sequenceVO.setInitValue(0);
            sequenceVO.setCurrValue(0);
            sequenceVO.setStep(1);
            sequenceVO.setMaxValue(1000000000);
            sequenceVO.setIndStatus("1");
            addSequence(sequenceVO);
        }
        sequenceDAO.getValue(sequenceVO);
        int value = sequenceVO.getCurrValue();
        int maxValue = sequenceVO.getMaxValue();
        if (value>=maxValue) {
            throw new Exception("the curr_value is larger than limit: "+ maxValue);
        }

        return value;
    }

    @Transactional
    public SequenceVO getSequence(String name) {
        return sequenceDAO.getSequence(name);
    }

    @Transactional
    public void resetSequence(String name) {
        sequenceDAO.resetSequence(name);
    }

    @Transactional
    public void addSequence(SequenceVO sequenceVO) {
        sequenceDAO.addSequence(sequenceVO);
    }
}
