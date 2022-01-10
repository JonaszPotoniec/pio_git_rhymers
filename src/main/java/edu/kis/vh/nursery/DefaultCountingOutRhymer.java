package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int ARRAY_LENGTH = 12;
    public static final int EMPTY = -1;
    private int[] numbers = new int[ARRAY_LENGTH];

    public int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == ARRAY_LENGTH - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}
