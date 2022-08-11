package net.splendid.elmosoft.tests;

import bo.ScenarioData;
import net.elmosoft.splendid.test.BaseSplendidTest;
import net.elmosoft.splendid.utils.JsonUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class AxelgateTest extends BaseSplendidTest {
    private static final String DATA_PATH = "src/test/resources/data/payment/";
    public static final Logger LOGGER = LogManager.getLogger(BaseSplendidTest.class);

    protected String jsonPath;

    @Parameters({ "missionType", "jsonFile", })
    @BeforeClass(description = "SetUp Client App", dependsOnMethods = "classSetUp")
    public void setUpClientApp(@Optional("") String missionType, @Optional("") String jsonFile) {
        if(!jsonFile.isEmpty()) {
            jsonPath = DATA_PATH.concat(jsonFile);
            ScenarioData obj = JsonUtils.getObjectFromJson(jsonPath, ScenarioData[].class)[0];
            LOGGER.info("Example JSON object:"+ obj);
        }
    }
}
