package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_ARRAY_LENGTH = 12;
    public static final int EMPTY = -1;
    public static final int EMPTY_RETURN_VALUE = -1;
    private final int[] numbers = new int[MAX_ARRAY_LENGTH];

    public int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == MAX_ARRAY_LENGTH - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_RETURN_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_RETURN_VALUE;
        return numbers[total--];
    }

}
