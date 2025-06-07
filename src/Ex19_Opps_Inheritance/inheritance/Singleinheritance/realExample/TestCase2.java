package Ex19_Opps_Inheritance.inheritance.Singleinheritance.realExample;

public class TestCase2 extends CommonTOALLTest {
    void runningTC2(){
        startBrowser();
        readExcelFile();
        readDataBaseFile();
        System.out.println("Running TC2");
        closeBrowser();
    }
}
