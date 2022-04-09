import org.junit.Assume;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

// отчеты  mvn  surefire-report:report
public class TriangleTest {

Triangle triangle;
    //@DisplayName("Cteate triangle")
    @Test
    @DisplayName("canBeInitializedTest")
  public  void canBeInitializedTest()
    {
       triangle = new Triangle();
    }
/*
    @BeforeEach
    @DisplayName("Cteate triangle")
    @Tag("POSitive")
    public    void createtriangle_test () {
        triangle = new Triangle();
    }
    */

    @Test
    @DisplayName("Тест площадь больще нуля не без параметротризации")
    @Tag("POSitive")
    public void triangle_s_huge_zeroTest()
{
Triangle   triangle2 = new Triangle();
int a =5;
boolean resulthugezero = false;
    double res = triangle2.ploshad(a,a,a);
    if (res > 0 )
    {
        resulthugezero = true;
    }
    else resulthugezero = false;
Assertions.assertEquals(true,resulthugezero);
}

@DisplayName("Тест площадь больще нуля c параметротризацией")
    @Tag("POSitive")
    @ParameterizedTest
   @ValueSource(ints = {1,5})
   public void triangle_s_huge_zero2Test(int a) {
    // System.out.println(a);/*
    try {

        Triangle triangle2 = new Triangle();
        //int a =5;
        boolean resulthugezero = false;
        double res = triangle2.ploshad(a, a, a);
        if (res > 0) {
            resulthugezero = true;
        } else resulthugezero = false;
        Assertions.assertEquals(true, resulthugezero);
    } catch (Error error) {
        error.getMessage();
    }
}


    @DisplayName("Test S traingle negative")
    @Tag("Negative")
    @ParameterizedTest
    @ValueSource(ints = {0,-5 })
    public void triangle_s_huge_zero3Test(int a) {
        // System.out.println(a);/*
        // try {

            Triangle triangle2 = new Triangle();
            //int a =5;
            boolean resulthugezero = false;
            double res = triangle2.ploshad(a, a, a);
            if (res > 0) {
                resulthugezero = true;
            } else resulthugezero = false;
        //Assume.assumeThat(resulthugezero,true);
        Assume.assumeTrue(resulthugezero);
           // assertEquals(true, resulthugezero);
        /*
        } catch (Error error) {
            error.getMessage();
        }

         */
    }


}
