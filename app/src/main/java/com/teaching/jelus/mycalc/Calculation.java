package com.teaching.jelus.mycalc;

public class Calculation {
    private double firstArgument;
    private double secondArgument;
    private TypeOfOperation typeOfOperation;

    public Calculation(double firstArgument, double secondArgument) {
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
        this.typeOfOperation = TypeOfOperation.NULL;
    }

    public double getFirstArgument() {
        return firstArgument;
    }

    public void setFirstArgument(double firstArgument) {
        this.firstArgument = firstArgument;
    }

    public double getSecondArgument() {
        return secondArgument;
    }

    public void setSecondArgument(double secondArgument) {
        this.secondArgument = secondArgument;
    }

    public double additionOperation(){
        return firstArgument + secondArgument;
    }

    public TypeOfOperation getTypeOfOperation() {
        return typeOfOperation;
    }

    public void setTypeOfOperation(TypeOfOperation typeOfOperation) {
        this.typeOfOperation = typeOfOperation;
    }

    public double subtractionOperation(){
        return firstArgument - secondArgument;

    }

    public double multiplicationOperation(){
        return firstArgument * secondArgument;
    }

    public double divideOperation(){
        return firstArgument / secondArgument;
    }


}
