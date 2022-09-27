import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/date.csv")


    public void shouldCalculateForRegisteredAndUnderLimit(long amount, boolean registered, long expected) {

        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }


}


