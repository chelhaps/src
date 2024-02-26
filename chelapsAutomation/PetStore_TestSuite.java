package chelapsAutomation;

// import org.junit.runner.JUnitCore;
// import org.junit.runner.notification.Failure;

// public class TestSuiteRunner {
public class PetStore_TestSuite {
    public static <Result> void main(String[] args) {
        Result result = JUnitCore.runClasses(Suite.class);

        for (Failure failure : ((Object) result).getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Test suite result: " + (((Object) result).wasSuccessful() ? "SUCCESS" : "FAILURE"));
    }
}
