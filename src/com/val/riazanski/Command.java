package com.val.riazanski;

public abstract class Command {
    //fields
    Runnable action;
    ExtendStringBuilder stringBuilder;
    //constructors
    public Command(ExtendStringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }
    //methods
    public void unDo() {
        this.action.run();
    }
    public void setAction(Runnable action) {
        this.action = action;
    }
}

class UnDeleteCommand extends Command {
    //fields
    private final ExtendStringBuilder stringBuilder;
    String deleted;
    private int start;
    //constructors
    public UnDeleteCommand(ExtendStringBuilder stringBuilder) {
        super(stringBuilder);
        this.stringBuilder = stringBuilder;
    }
    //methods
 }
class UnAppend extends Command {
    private final ExtendStringBuilder stringBuilder;
    private int stringLength;
    //constructions
    public UnAppend(ExtendStringBuilder stringBuilder) {
        super(stringBuilder);
        this.stringBuilder = stringBuilder;
    }
}

class UnReverse extends Command {
    //fields
    private final ExtendStringBuilder stringBuilder;
    //constructors
    public UnReverse(ExtendStringBuilder stringBuilder) {
        super(stringBuilder);
        this.stringBuilder = stringBuilder;
    }
    //methods
 }
class UnInsert extends Command {
    //fields
    private final ExtendStringBuilder stringBuilder;
    private int start;
    private String str;
    //constructors
    public UnInsert(ExtendStringBuilder stringBuilder) {
        super(stringBuilder);
        this.stringBuilder = stringBuilder;
    }
}
class UnReplace extends Command {
    //fields
    private final ExtendStringBuilder stringBuilder;
    private int start;
    private int end;
    private String str;
    //constructors
    public UnReplace(ExtendStringBuilder stringBuilder) {
        super(stringBuilder);
        this.stringBuilder = stringBuilder;
    }
    //methods
}
