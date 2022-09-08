package runner;

import org.testng.annotations.Test;
import pages.Prueba;

import java.io.IOException;

public class Prueba_Test {
    ThreadLocal<Prueba> pruebaTest;

    @Test
    private void testLogin(){
        pruebaTest = ThreadLocal.withInitial(Prueba::new);
        pruebaTest.get().navigateToLoginPage();
        pruebaTest.get().enterCredentials();
    }

    @Test
    private void testFilter(){
        pruebaTest = ThreadLocal.withInitial(Prueba::new);
        pruebaTest.get().navigateToLoginPage();
        pruebaTest.get().enterCredentials();
        pruebaTest.get().selectFilter();
    }

    @Test
    private void testaddtoCart() {
        pruebaTest = ThreadLocal.withInitial(Prueba::new);
        pruebaTest.get().navigateToLoginPage();
        pruebaTest.get().enterCredentials();
        pruebaTest.get().selectFilter();
        pruebaTest.get().addtoCart();
    }

    @Test
    private void testshopingCart() {
        pruebaTest = ThreadLocal.withInitial(Prueba::new);
        pruebaTest.get().navigateToLoginPage();
        pruebaTest.get().enterCredentials();
        pruebaTest.get().selectFilter();
        pruebaTest.get().addtoCart();
        pruebaTest.get().shopingCart();
    }

    @Test
    private void testremoveElements() {
        pruebaTest = ThreadLocal.withInitial(Prueba::new);
        pruebaTest.get().navigateToLoginPage();
        pruebaTest.get().enterCredentials();
        pruebaTest.get().selectFilter();
        pruebaTest.get().addtoCart();
        pruebaTest.get().shopingCart();
        pruebaTest.get().removeElements();
    }

    @Test
    private void testcheckoutButton() {
        pruebaTest = ThreadLocal.withInitial(Prueba::new);
        pruebaTest.get().navigateToLoginPage();
        pruebaTest.get().enterCredentials();
        pruebaTest.get().selectFilter();
        pruebaTest.get().addtoCart();
        pruebaTest.get().shopingCart();
        pruebaTest.get().removeElements();
        pruebaTest.get().checkoutButton();
    }

    @Test
    private void testcheckoutInformation() {
        pruebaTest = ThreadLocal.withInitial(Prueba::new);
        pruebaTest.get().navigateToLoginPage();
        pruebaTest.get().enterCredentials();
        pruebaTest.get().selectFilter();
        pruebaTest.get().addtoCart();
        pruebaTest.get().shopingCart();
        pruebaTest.get().removeElements();
        pruebaTest.get().checkoutButton();
        pruebaTest.get().checkoutInformation();
    }

    @Test
    private void testcontinueButton() {
        pruebaTest = ThreadLocal.withInitial(Prueba::new);
        pruebaTest.get().navigateToLoginPage();
        pruebaTest.get().enterCredentials();
        pruebaTest.get().selectFilter();
        pruebaTest.get().addtoCart();
        pruebaTest.get().shopingCart();
        pruebaTest.get().removeElements();
        pruebaTest.get().checkoutButton();
        pruebaTest.get().checkoutInformation();
        pruebaTest.get().buttonContinue();
    }

    @Test
    private void testextractText() {
        pruebaTest = ThreadLocal.withInitial(Prueba::new);
        pruebaTest.get().navigateToLoginPage();
        pruebaTest.get().enterCredentials();
        pruebaTest.get().selectFilter();
        pruebaTest.get().addtoCart();
        pruebaTest.get().shopingCart();
        pruebaTest.get().removeElements();
        pruebaTest.get().checkoutButton();
        pruebaTest.get().checkoutInformation();
        pruebaTest.get().buttonContinue();
        pruebaTest.get().extractText();
    }

    @Test
    private void testbuttonFinish() throws IOException {
        pruebaTest = ThreadLocal.withInitial(Prueba::new);
        pruebaTest.get().navigateToLoginPage();
        pruebaTest.get().enterCredentials();
        pruebaTest.get().selectFilter();
        pruebaTest.get().addtoCart();
        pruebaTest.get().shopingCart();
        pruebaTest.get().removeElements();
        pruebaTest.get().checkoutButton();
        pruebaTest.get().checkoutInformation();
        pruebaTest.get().buttonContinue();
        pruebaTest.get().extractText();
        pruebaTest.get().buttonFinish();
    }
}
