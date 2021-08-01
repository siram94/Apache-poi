import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonddt {
   /* @BeforeTest
    public void test() {


    }

    @Test
    public void test1() {

    }*/

    public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver", "c:/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();



         String path = "C:/Users/Siram/Documents/AmazonWorkBook.xlsx";
        ExcelUtils.openExcelFile(path, "sheet1");
        //System.out.println(ExcelUtils.getCellData(3,1));

        //ExcelUtils.setCellData("test",2,2);

       /* int row = ExcelUtils.getUsedRowsCount();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 5; j++) {
                String getcells = ExcelUtils.getCellData(i, j);
                System.out.println(getcells);*/

     int rows = ExcelUtils.getUsedRowsCount();
        for(int i=0; i<rows;i++) {
            String rowcell = ExcelUtils.getCellData(i, 0);
            System.out.println(ExcelUtils.getCellData(i, 0));
            System.out.println("");
            System.out.println(ExcelUtils.getCellData(i, 1  ));
            if (rowcell.equalsIgnoreCase("N")) {
                ExcelUtils.setCellData("", 1, 2);
                ExcelUtils.setCellData("skipped", 1, 3);
                ExcelUtils.setCellData("", 3, 2);
                ExcelUtils.setCellData("skipped", 3, 3);

            }else {
                if (rowcell.equalsIgnoreCase("Y")) {
                    ExcelUtils.setCellData("3,000", 2, 2);
                    ExcelUtils.setCellData("pass", 2, 3);
                    ExcelUtils.setCellData(" 2,000", 4, 2);
                    ExcelUtils.setCellData("pass", 4, 3);

                }
            }}
    }
//    WebDriver search = driver.findElement(By.id("twotabsearchtextbox"));
    }
