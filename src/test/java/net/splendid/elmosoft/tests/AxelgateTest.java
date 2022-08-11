package net.splendid.elmosoft.tests;

import bo.ScenarioData;
import com.google.inject.Inject;
import net.elmosoft.splendid.test.BaseSplendidTest;
import net.elmosoft.splendid.utils.JsonUtils;
import net.splendid.elmosoft.steps.MobileSteps;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.*;

@Guice
public class AxelgateTest extends BaseSplendidTest {
    private static final String DATA_PATH = "src/test/resources/data/payment/";
    public static final Logger LOGGER = LogManager.getLogger(BaseSplendidTest.class);

    protected String jsonPath;

    @Inject
    private MobileSteps mobileSteps;
    private ScenarioData data;

    @Parameters({ "missionType", "jsonFile"})
    @BeforeClass(description = "SetUp Client App", dependsOnMethods = "classSetUp")
    public void setUpClientApp(@Optional("") String missionType, @Optional("") String jsonFile) {
        if(!jsonFile.isEmpty()) {
            jsonPath = DATA_PATH.concat(jsonFile);
            ScenarioData obj = JsonUtils.getObjectFromJson(jsonPath, ScenarioData[].class)[0];
            data = obj;
            LOGGER.info("Example JSON object:"+ obj);
        }
    }

    @Test
    public void demoTest(){
        mobileSteps.doLoginWithParams(data.getEmail(), data.getPassword());
    }
}
