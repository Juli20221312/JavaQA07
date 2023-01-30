import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/number.csv")
    public void TestsSQR(int expected, int x, int y) {
        SQRService service = new SQRService();
        int actual = service.calcSQR(x, y);

        Assertions.assertEquals(expected, actual);

    }
}
