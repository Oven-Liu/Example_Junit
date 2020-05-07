package junit5.constructorAndMethodDependence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

/**
 * @author Administrator
 * @date 2020-05-07 15:48
 */
public class RepetitionInfoTests {

    @RepeatedTest(5)
    void testRepeat() {

    }

    @AfterEach
    void testRepetitionInfo(RepetitionInfo repetitionInfo) {
        System.out.println("当前重复次数：" + repetitionInfo.getCurrentRepetition());
        System.out.println("总共重复次数：" + repetitionInfo.getTotalRepetitions());
    }
}
