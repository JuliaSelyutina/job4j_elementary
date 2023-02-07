package ru.job4j.type;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

public class RightTriangleTest {

        @Test
        public void whenA3B4C5ThenPerimeter12Area6() {
            ByteArrayInputStream in = new ByteArrayInputStream("3 4 5".getBytes());
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));
            System.setIn(in);
            RightTriangle.main(null);
            StringJoiner expected = new StringJoiner(System.lineSeparator()).add("12.0").add("6.0");
            assertThat(out.toString(), is(expected.toString()));
        }

        @Test
        public void whenA6B8C10ThenPerimeter24dot6Area24() {
            ByteArrayInputStream in = new ByteArrayInputStream("6 8 10".getBytes());
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));
            System.setIn(in);
            RightTriangle.main(null);
            StringJoiner expected = new StringJoiner(System.lineSeparator()).add("24.0").add("24.0");
            assertThat(out.toString(), is(expected.toString()));
        }
}
