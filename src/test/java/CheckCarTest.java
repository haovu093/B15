import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class CheckCarTest {

    @Test
    void testChuoiXeHoi() {
        CheckCar c2 = new CheckCar();
        String c23 = c2.checkXeHoi();
        assertThat(c23).isNotNull()
                .endsWith("Toyota");

    }

}