package edu.kis.vh.nursery;

/**
 * First in first out type rhymer
 */
public class FIFORhymer extends DefaultCountingOutRhymer {


    /**
     * Temporary rhymer used to reverse order
     */
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * @return returns first value in contradiction to other rhymers which return last value
     */
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
