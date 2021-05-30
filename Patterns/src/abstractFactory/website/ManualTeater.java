package abstractFactory.website;

import abstractFactory.Tester;

public class ManualTeater implements Tester {
    @Override
    public void testCode() {
        System.out.println("manual tester tests website");
    }
}
