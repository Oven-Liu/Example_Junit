package junit5.InterfaceContracts;

/**
 * @author Liu Xudong
 * @date 2020-05-05 15:58
 */
public class StringTests implements ComparableContract<String>, EqualsContract<String> {

    @Override
    public String createValue() {
        return "foo";
    }

    @Override
    public String createSmallerValue() {
        return "bar"; // 'b' < 'f' in "foo"
    }

    @Override
    public String createNotEqualValue() {
        return "baz";
    }
}
