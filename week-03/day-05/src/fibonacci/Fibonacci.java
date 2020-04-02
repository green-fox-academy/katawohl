package fibonacci;

import com.sun.jdi.event.ExceptionEvent;

public class Fibonacci {

  public long fiboCompute(int indexInQuestion) throws Exception {

    long[] fiboSequence = new long[indexInQuestion];

    int seqStart = 0;
    int seqStart2 = 1;
    fiboSequence[0] = seqStart;
    fiboSequence[1] = seqStart2;

    if (indexInQuestion < 50) {
      for (int i = 2; i < indexInQuestion; i++) {
        long nextNumber = fiboSequence[i - 1] + fiboSequence[i - 2];
        fiboSequence[i] = nextNumber;
      }
      return fiboSequence[indexInQuestion - 1];
    } else {
      throw new Exception("Number is too high to process");
    }
  }

}

