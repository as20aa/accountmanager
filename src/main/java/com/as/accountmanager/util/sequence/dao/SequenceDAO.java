package com.as.accountmanager.util.sequence.dao;

import com.as.accountmanager.util.sequence.dao.vo.SequenceVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SequenceDAO {

    public void getValue(SequenceVO sequenceVO);
    /**
     * getSequence
     * @param name
     * @return
     */
    public SequenceVO getSequence(String name);

    /**
     * resetSequence
     * @param name
     */

    public void resetSequence(String name);

    public void addSequence(SequenceVO sequenceVO);
}
