package com.as.accountmanager.util.sequence.dao.vo;

public class SequenceVO {
    private String name;
    private int currValue;
    private int initValue;
    private int step;
    private int maxValue;
    private String indStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrValue() {
        return currValue;
    }

    public void setCurrValue(int currValue) {
        this.currValue = currValue;
    }

    public int getInitValue() {
        return initValue;
    }

    public void setInitValue(int initValue) {
        this.initValue = initValue;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public String getIndStatus() {
        return indStatus;
    }

    public void setIndStatus(String indStatus) {
        this.indStatus = indStatus;
    }

    @Override
    public String toString() {
        return "SequenceVO{" +
                "name='" + name + '\'' +
                ", currValue=" + currValue +
                ", initValue=" + initValue +
                ", step=" + step +
                ", maxValue=" + maxValue +
                ", indStatus='" + indStatus + '\'' +
                '}';
    }
}
