package chelapsAutomation;

import chelapsAutomation.PetStore_Testcases.TC00002_createUser;
import chelapsAutomation.PetStore_Testcases.TC00003_updateUser;

public class Suite {

    public @interface SuiteClasses {

        Class<TC00002_createUser>[] value();

        Class<TC00003_updateUser>[] value();
    }
}
