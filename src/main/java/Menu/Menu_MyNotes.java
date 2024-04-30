package Menu;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import static org.openqa.selenium.By.*;

public class Menu_MyNotes {
    WebDriver driver;

    public Menu_MyNotes(WebDriver driver) {
        this.driver = driver;
    }

    public void MyNotes() throws InterruptedException {

        //Then click the MyNote

        Thread.sleep (7000);
        WebElement MyNotes = driver.findElement (xpath ("//*[@id=\"1\"]"));
        MyNotes.click ();

        // Click the three dots in the My notes

        Thread.sleep (3000);
        WebElement Threedots = driver.findElement (xpath ("//*[@class=\"ant-dropdown-trigger\"]"));
        Threedots.click ();

        //Clicking the remove My notes icon in dropdown

        Thread.sleep (3000);
        WebElement Remove_My_Notes = driver.findElement (xpath ("//span[text()='Remove My  Notes']"));
        Remove_My_Notes.click ();

        // Again Click the three dots in the My notes

        Thread.sleep (3000);
        WebElement Three_dots = driver.findElement (xpath ("//*[@class=\"ant-dropdown-trigger\"]"));
        Three_dots.click ();

        /* Clicking the share icon in My Notes */

        Thread.sleep (3000);
        WebElement Share_icon = driver.findElement (xpath ("//span[text()='Share']"));
        Share_icon.click ();

        //click the copy link in the share popup

        Thread.sleep (3000);
        WebElement Copy_link = driver.findElement (xpath ("//span[text()='COPY LINK']"));
        Copy_link.click ();

        //Clicking the cancel button in the in share popup

        WebDriverWait waitforCancelButtonclick = new WebDriverWait (driver, Duration.ofSeconds (30));
        WebElement Cancel_button = driver.findElement (xpath ("//span[text()='Cancel']"));
        Cancel_button.click ();

        // Again Click the three dots in the My notes

        Thread.sleep (3000);
        Three_dots = driver.findElement (xpath ("//*[@class=\"ant-dropdown-trigger\"]"));
        Three_dots.click ();

        //clicking the report icon

        Thread.sleep (1000);
        WebElement Report_icon = driver.findElement (xpath ("//span[text()='Report']"));
        Report_icon.click ();

        //Click the wrong information radio button

        Thread.sleep (1000);
        WebElement Wrong_information_radio_button = driver.findElement (xpath ("//span[text()='Wrong Information']"));
        Wrong_information_radio_button.click ();

        //Entering the text inside the report text field

        WebElement Enter_the_report = driver.findElement (name ("reportDescription"));
        Enter_the_report.sendKeys ("Checking The text was Entering In The Report Text Field");

        // Click the report button

        Thread.sleep (3000);
        /*WebElement Report_button = driver.findElement (xpath ("//span[text()='REPORT']"));
        Report_button.click ();*/

        // Clicking The Cancel Button

        Cancel_button = driver.findElement (xpath ("//span[text()='CANCEL']"));
        Cancel_button.click ();

//        //Clicking the Course name in My Notes Card

        Thread.sleep (3000);
        WebElement Clicking_Course_Name = driver.findElement (xpath ("//*[@class=\"anticon anticon-right right-arrow-icon\"]"));
        Clicking_Course_Name.click ();

        //Clicking the breadcrums to navigate backward to My notes page

        Thread.sleep (3000);
        WebElement Clicking_Course_breadcrums = driver.findElement (xpath ("//span[text()='Course']"));
        Clicking_Course_breadcrums.click ();

        // Clicking the like button

        Thread.sleep (1000);
        WebElement Like_button = driver.findElement (xpath ("//*[@class=\"feed-card-footer-like-icon\"]"));
        Like_button.click ();

        // Clicking the start button

        Thread.sleep (3000);
        WebElement Clicking_start_button = driver.findElement (xpath ("//span[text()='Start']"));
        Clicking_start_button.click ();

        //Clicking the Resume Quiz

        WebElement clickingTheResumequiz = driver.findElement (xpath ("//span[text()='Resume']"));
        clickingTheResumequiz.click ();

        //Windows Handeling


        Set<String> windows = driver.getWindowHandles ();
        Iterator<String> it = windows.iterator ();
        String parent = it.next ();
        String child = it.next ();
        driver.switchTo ().window (child);

        //Clicking the close icon in the quiz instruction
        Thread.sleep (3000);
        WebElement Close_icon = driver.findElement (xpath ("//*[@class=\"ant-modal-close-x\"]"));
        Close_icon.click ();

        //Windows mazimize

        WebDriverWait waitForWindowsMaximize = new WebDriverWait (driver, Duration.ofSeconds (30));
        driver.manage ().window ().maximize ();

        //Clicking the Instruction Button


        WebElement clickingTheInstructionIcon = driver.findElement (xpath ("//*[@alt=\"quiz_info\"]"));
        clickingTheInstructionIcon.click ();

        // Again Clicking the close icon in the quiz instruction

        Thread.sleep (3000);
        WebElement againClose_icon = driver.findElement (xpath ("//*[@class=\"ant-modal-close-x\"]"));
        againClose_icon.click ();

        // Clicking The FullScreen Button

        WebElement clickingTheFullScreenButton = driver.findElement (className ("anticon-expand"));
        clickingTheFullScreenButton.click ();

        // Clicking the BookMark-icon

        /*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement bookMarkicon = driver.findElement(className ("bookmark-icon"));
        bookMarkicon.click ();*/

        // Clicking the First Option

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        WebElement clickingTheOption_A = driver.findElement (xpath ("//div[text()='A']"));
        clickingTheOption_A.click ();

        //Clicking The Save & Next Button

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        WebElement clickingTheSaveAndNextbutton = driver.findElement (xpath ("//div[text()='Save & Next']"));
        clickingTheSaveAndNextbutton.click ();

        // Clicking the Second Option

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        WebElement clickingTheOption_B = driver.findElement (xpath ("//div[text()='B']"));
        clickingTheOption_B.click ();

        //Again Clicking The Save & Next Button

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        clickingTheSaveAndNextbutton = driver.findElement (xpath ("//div[text()='Save & Next']"));
        clickingTheSaveAndNextbutton.click ();

        // Clicking the Third Option

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        WebElement clickingTheOption_C = driver.findElement (xpath ("//div[text()='C']"));
        clickingTheOption_C.click ();

        //Again Clicking The Save & Next Button

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        clickingTheSaveAndNextbutton = driver.findElement (xpath ("//div[text()='Save & Next']"));
        clickingTheSaveAndNextbutton.click ();

        // Clicking the Fourth Option

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        WebElement clickingTheOption_D = driver.findElement (xpath ("//div[text()='D']"));
        clickingTheOption_D.click ();

        //Again Clicking The Save & Next Button

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        clickingTheSaveAndNextbutton = driver.findElement (xpath ("//div[text()='Save & Next']"));
        clickingTheSaveAndNextbutton.click ();

        // Clicking the Fifth Option

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        WebElement clickingTheOption_E = driver.findElement (xpath ("//div[text()='E']"));
        clickingTheOption_E.click ();

        // Clicking The Number on the right side Count Status

        WebElement clickingTheNumber6OnTheRigntSide = driver.findElement (xpath ("//Span[text()='6']"));
        clickingTheNumber6OnTheRigntSide.click ();

        // Clicking the First Option

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        clickingTheOption_A = driver.findElement (xpath ("//div[text()='A']"));
        clickingTheOption_A.click ();

        // Clicking The Number on the right side Count Status

        WebElement clickingTheNumber7OnTheRightSide = driver.findElement (xpath ("//Span[text()='7']"));
        clickingTheNumber7OnTheRightSide.click ();

        // Clicking the Second Option

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        clickingTheOption_B = driver.findElement (xpath ("//div[text()='B']"));
        clickingTheOption_B.click ();

        // Clicking The Number on the right side Count Status

        WebElement clickingTheNumber8OnTheRightSide = driver.findElement (xpath ("//Span[text()='8']"));
        clickingTheNumber8OnTheRightSide.click ();

        // Clicking the Third Option

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        clickingTheOption_C = driver.findElement (xpath ("//div[text()='C']"));
        clickingTheOption_C.click ();

        // Clicking The Previous Button

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        WebElement clickingThePreviousButton = driver.findElement (xpath ("//div[text()='Previous']"));
        clickingThePreviousButton.click ();

        // Clicking The Pause Button

        Thread.sleep (3000);
        WebElement clickingThePauseButton = driver.findElement (xpath ("//*[@class=\"pause-icon\"]"));
        clickingThePauseButton.click ();

        // Clicking The Cancel Button In The Pause popup

        /*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement clickingCancelButtonInPopup = driver.findElement (xpath ("//span[text()='Cancel']"));
        clickingCancelButtonInPopup.click ();*/

        // Clicking The Leave button In the Pause Popup

        Thread.sleep (3000);
        WebElement clickingLeaveButtonInPopup = driver.findElement (xpath ("//span[text()=\" Leave \"]"));
        clickingLeaveButtonInPopup.click ();

        // Changing The Child Windows To Parent Window

        driver.switchTo ().window (parent);

        //Clicking the Resume Quiz

        Thread.sleep (3000);
        clickingTheResumequiz = driver.findElement (xpath ("//span[text()='Resume']"));
        clickingTheResumequiz.click ();


        // Again Handeling Windows

        windows = driver.getWindowHandles ();
        it = windows.iterator ();
        parent = it.next ();
        child = it.next ();
        driver.switchTo ().window (child);

        // Window Maximize

        driver.manage ().window ().maximize ();

        // Clicking The Quiz BackButton

        WebElement quizBackButton = driver.findElement (xpath ("//*[@class=\"anticon anticon-arrow-left back-icon\"]"));
        quizBackButton.click ();

        // Clicking The Leave button In the BackArrow Popup

        Thread.sleep (3000);
        clickingLeaveButtonInPopup = driver.findElement (xpath ("//span[text()=\" Leave \"]"));
        clickingLeaveButtonInPopup.click ();

        // Again Changing The Child Windows To Parent Window

        driver.switchTo ().window (parent);

        //Clicking the Resume Quiz

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (30));
        clickingTheResumequiz = driver.findElement (xpath ("//span[text()='Resume']"));
        clickingTheResumequiz.click ();

        // Again Handeling Windows

        windows = driver.getWindowHandles ();
        it = windows.iterator ();
        parent = it.next ();
        child = it.next ();
        driver.switchTo ().window (child);

        // Window Maximize

        driver.manage ().window ().maximize ();

        // Clicking The Submit Button

        Thread.sleep (1000);
        WebElement clickingSubmitButton = driver.findElement (xpath ("//span[text()=' Submit ']"));
        clickingSubmitButton.click ();

        // Clicking the Cancel Button In the submit Popup

        /*Thread.sleep (1000);
        WebElement clickingCancelButtonInThePopup = driver.findElement (xpath ("//span[text()=\"Cancel\"]"));
        clickingCancelButtonInThePopup.click ();*/

        // Clicking The Submit Button In The Submit Popup

        Thread.sleep (1000);
        clickingSubmitButton = driver.findElement (xpath ("//span[text()=\"Submit\"]"));
        clickingSubmitButton.click ();

        // Again Changing The Child Windows To Parent Window

        driver.switchTo ().window (parent);

        // Clicking The solution button

        Thread.sleep (2000);
        WebElement clickingSolutionButton = driver.findElement (xpath ("//span[text()='Solution']"));
        clickingSolutionButton.click ();

        // Clicking The Next Button In The Solution Page

        Thread.sleep (1000);
        WebElement clickingTheNextButton = driver.findElement (xpath ("//div[text()='Next']"));
        clickingTheNextButton.click ();

        /*// Clicking The BookMark Button For UnBookMark

        Thread.sleep (3000);
        WebElement clickingTheBookMarkedButton = driver.findElement(className ("bookmark-icon"));
        clickingTheBookMarkedButton.click ();*/

        // Clicking The Share Icon In The Solution Page

        Thread.sleep (3000);
        WebElement clickingTheShareIcon = driver.findElement (xpath ("//*[@alt=\"share\"]"));
        clickingTheShareIcon.click ();

        //click the copy link in the share popup

        Thread.sleep (3000);
        Copy_link = driver.findElement (xpath ("//span[text()='COPY LINK']"));
        Copy_link.click ();

        //Clicking the cancel button in the in share popup

        waitforCancelButtonclick = new WebDriverWait (driver, Duration.ofSeconds (30));
        Cancel_button = driver.findElement (xpath ("//span[text()='Cancel']"));
        Cancel_button.click ();

        // Scrolling The Solution Page

        Thread.sleep (1000);
        WebElement scrollToReportIcon = driver.findElement (xpath ("//*[@class=\"report-image\"]"));
        Actions actions = new Actions (driver);
        actions.scrollToElement (scrollToReportIcon).perform ();
        scrollToReportIcon.click ();

        // Click The Translation Error In The Report Popup

        Thread.sleep (3000);
        WebElement clickingTranslationErrorRadioButton = driver.findElement (xpath ("//span[text()='Translations Error']"));
        clickingTranslationErrorRadioButton.click ();

        //Entering the text inside the report text field In Solution Page

        Enter_the_report = driver.findElement (name ("reportDescription"));
        Enter_the_report.sendKeys ("Checking The text was Entering In The Report Text Field");

        // Click the report button

        Thread.sleep (3000);
        WebElement Report_button = driver.findElement (xpath ("//span[text()='REPORT']"));
        Report_button.click ();

        /* // Clicking The Cancel Button

        Cancel_button = driver.findElement (xpath ("//span[text()='CANCEL']"));
        Cancel_button.click ();*/

        // Clicking The ReattempButton

        Thread.sleep (5000);
        WebElement reattempIcon = waitForWindowsMaximize.until (ExpectedConditions.elementToBeClickable (xpath ("//div[@class=\"ant-switch-handle\"]")));
        waitForWindowsMaximize.until (ExpectedConditions.visibilityOf (reattempIcon));
        reattempIcon.click ();

        // Clicking the First Option

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        clickingTheOption_A = driver.findElement (xpath ("//div[text()='A']"));
        clickingTheOption_A.click ();

        //Clicking The Save & Next Button

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        clickingTheSaveAndNextbutton = driver.findElement (xpath ("//div[text()='Save & Next']"));
        clickingTheSaveAndNextbutton.click ();

        // Clicking the Second Option

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        clickingTheOption_B = driver.findElement (xpath ("//div[text()='B']"));
        clickingTheOption_B.click ();

        //Again Clicking The Save & Next Button

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        clickingTheSaveAndNextbutton = driver.findElement (xpath ("//div[text()='Save & Next']"));
        clickingTheSaveAndNextbutton.click ();

        // Clicking the Third Option

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        clickingTheOption_C = driver.findElement (xpath ("//div[text()='C']"));
        clickingTheOption_C.click ();

        //Again Clicking The Save & Next Button

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        clickingTheSaveAndNextbutton = driver.findElement (xpath ("//div[text()='Save & Next']"));
        clickingTheSaveAndNextbutton.click ();

        // Clicking the Fourth Option

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        clickingTheOption_D = driver.findElement (xpath ("//div[text()='D']"));
        clickingTheOption_D.click ();

        //Again Clicking The Save & Next Button

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        clickingTheSaveAndNextbutton = driver.findElement (xpath ("//div[text()='Save & Next']"));
        clickingTheSaveAndNextbutton.click ();

        // Clicking the Fifth Option

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        clickingTheOption_E = driver.findElement (xpath ("//div[text()='E']"));
        clickingTheOption_E.click ();

        // Clicking The Number on the right side Count Status

        clickingTheNumber6OnTheRigntSide = driver.findElement (xpath ("//Span[text()='6']"));
        clickingTheNumber6OnTheRigntSide.click ();

        // Clicking the First Option

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        clickingTheOption_A = driver.findElement (xpath ("//div[text()='A']"));
        clickingTheOption_A.click ();

        // Clicking The Number on the right side Count Status

        clickingTheNumber7OnTheRightSide = driver.findElement (xpath ("//Span[text()='7']"));
        clickingTheNumber7OnTheRightSide.click ();

        // Clicking the Second Option

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        clickingTheOption_B = driver.findElement (xpath ("//div[text()='B']"));
        clickingTheOption_B.click ();

        // Clicking The Number on the right side Count Status

        clickingTheNumber8OnTheRightSide = driver.findElement (xpath ("//Span[text()='8']"));
        clickingTheNumber8OnTheRightSide.click ();

        // Clicking the Third Option

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        clickingTheOption_C = driver.findElement (xpath ("//div[text()='C']"));
        clickingTheOption_C.click ();

        // Clicking The Previous Button

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (5));
        clickingThePreviousButton = driver.findElement (xpath ("//div[text()='Previous']"));
        clickingThePreviousButton.click ();

        // Scrolling The Solution Page

        Thread.sleep (1000);
        scrollToReportIcon = driver.findElement (xpath ("//*[@class=\"report-image\"]"));
        actions = new Actions (driver);
        actions.scrollToElement (scrollToReportIcon).perform ();
        scrollToReportIcon.click ();

        // Click The Translation Error In The Report Popup

        Thread.sleep (3000);
        clickingTranslationErrorRadioButton = driver.findElement (xpath ("//span[text()='Translations Error']"));
        clickingTranslationErrorRadioButton.click ();

        //Entering the text inside the report text field In Solution Page

        Enter_the_report = driver.findElement (name ("reportDescription"));
        Enter_the_report.sendKeys ("Checking The text was Entering In The Report Text Field");

        // Click the report button

        Thread.sleep (3000);
        Report_button = driver.findElement (xpath ("//span[text()='REPORT']"));
        Report_button.click ();

        /* // Clicking The Cancel Button

        Cancel_button = driver.findElement (xpath ("//span[text()='CANCEL']"));
        Cancel_button.click ();*/

        // Clicking The Share Icon In The Solution Page

        Thread.sleep (3000);
        clickingTheShareIcon = driver.findElement (xpath ("//*[@alt=\"share\"]"));
        clickingTheShareIcon.click ();

        //click the copy link in the share popup

        Thread.sleep (3000);
        Copy_link = driver.findElement (xpath ("//span[text()='COPY LINK']"));
        Copy_link.click ();

        //Clicking the cancel button in the in share popup

        waitforCancelButtonclick = new WebDriverWait (driver, Duration.ofSeconds (30));
        Cancel_button = driver.findElement (xpath ("//span[text()='Cancel']"));
        Cancel_button.click ();

        String src = "/static/media/quiz-bookmark.2ee759e3701295a6112f7b214e743556.svg";

//        WebElement clickingBookmark;
//
//        if (src.equals("/static/media/quiz-bookmark.2ee759e3701295a6112f7b214e743556.svg"))
//        {
//            clickingBookmark = driver.findElement(xpath("//*[@class='bookmark-icon']"));
//        }
//        else
//        {
//            clickingBookmark = driver.findElement(xpath("//*[@class='bookmarked-icon']"));
//        }
//
//        // Clicking the bookmark or bookmarked icon
//        clickingBookmark.click();

        // Clicking The ReattemptButton

        Thread.sleep (5000);

        WebElement clickingReattemptButton = driver.findElement (xpath ("//div[@class=\"ant-switch-handle\"]"));
        clickingReattemptButton.click ();

//        reattempIcon = wait.until (ExpectedConditions.elementToBeClickable (xpath ("//div[@class=\"ant-switch-handle\"]")));
//        wait.until (ExpectedConditions.visibilityOf (reattempIcon));
//        reattempIcon.click ();

        //  Click the back arrow in the solution screen

        WebElement clickingBackArrow = driver.findElement (xpath ("//*[@class=\"anticon anticon-arrow-left back-icon\"]"));
        clickingBackArrow.click ();

        // Clicking The solution button

        Thread.sleep (2000);
        clickingSolutionButton = driver.findElement (xpath ("//span[text()='Solution']"));
        clickingSolutionButton.click ();

        // Analysis was not working in site

        // Clicking The Analysis Icon

        WebElement clickingAnalysisIcon = driver.findElement (xpath ("//*[@class=\"image-analysis\"]"));
        clickingAnalysisIcon.click ();

        // Clicking The FullScreen Button

        clickingTheFullScreenButton = driver.findElement (className ("anticon-expand"));
        clickingTheFullScreenButton.click ();

        // Exiting The FullScreen Button

        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        WebElement exitingTheFullScreenButton = driver.findElement (className ("anticon-compress"));
        exitingTheFullScreenButton.click ();

        //  Again Click the back arrow in the solution screen

        WebElement againclickingBackArrow = driver.findElement (xpath ("//*[@class=\"anticon anticon-arrow-left back-icon\"]"));
        againclickingBackArrow.click ();

        // Clicking The Analysis Button

        WebElement clickingAnalysisButton = driver.findElement (xpath ("//span[text()='Analysis']"));
        clickingAnalysisButton.click ();

        // Clicking The Share Icon In The Analysis Page

        Thread.sleep (3000);
        clickingTheShareIcon = driver.findElement (xpath ("//*[@alt=\"share\"]"));
        clickingTheShareIcon.click ();

        //click the copy link in the share popup

        Thread.sleep (3000);
        Copy_link = driver.findElement (xpath ("//span[text()='COPY LINK']"));
        Copy_link.click ();

        //Clicking the cancel button in the in share popup

        waitforCancelButtonclick = new WebDriverWait (driver, Duration.ofSeconds (30));
        Cancel_button = driver.findElement (xpath ("//span[text()='Cancel']"));
        Cancel_button.click ();

        // Clicking The comment icon in the analysis page

        WebElement clickingCommentIconInAnalysisPage = driver.findElement (xpath ("//*[@id=\"comments-icon\"]"));
        clickingCommentIconInAnalysisPage.click ();

        // Clicking The Like Button

        WebElement clickingunLikeButton = driver.findElement (xpath ("//*[@class=\"like\"]"));
        clickingunLikeButton.click ();

        // Clicking The unlike Button

        WebElement clickingLikeButton = driver.findElement (xpath ("//*[@class=\"unlike\"]"));
        clickingLikeButton.click ();

        //  Entering Comment In The TextField

        Thread.sleep (5000);
        WebElement enteringTheCommentInTextField = driver.findElement (xpath ("//*[@name=\"comments1\"]"));
        enteringTheCommentInTextField.sendKeys ("Checking The Comment Text Field");

        // Clicking The Send Button In The Comment Text Field

        Thread.sleep (2000);
        WebElement clickingSendButton = driver.findElement (className ("anticon-send"));
        clickingSendButton.click ();

        // Clicking The Reattempt Button Inside The analysis page

        Thread.sleep (2000);
        WebElement clickingReattempButton = driver.findElement (xpath ("//span[text()=' Reattempt ']"));
        clickingReattempButton.click ();

        //  Again Click the back arrow in the solution screen

        Thread.sleep (2000);
        againclickingBackArrow = driver.findElement (xpath ("//*[@class=\"anticon anticon-arrow-left back-icon\"]"));
        againclickingBackArrow.click ();

        // Clicking The Solution Button Inside The analysis page

        Thread.sleep (2000);
        WebElement clickingSolutionButtonInAnalysis = driver.findElement (xpath ("//span[text()=' View Solution ']"));
        clickingSolutionButtonInAnalysis.click ();

        //  Again Click the back arrow in the solution screen

        Thread.sleep (2000);
        againclickingBackArrow = driver.findElement (xpath ("//*[@class=\"anticon anticon-arrow-left back-icon\"]"));
        againclickingBackArrow.click ();

        // Scrolling The analysis page Forward

        Thread.sleep (3000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript ("window.scrollTo(0, document.body.scrollHeight)");

        // Scrolling The analysis page Backward

        Thread.sleep (3000);
        jse = (JavascriptExecutor) driver;
        jse.executeScript ("window.scrollTo(document.body.scrollHeight,0)");

        // Clicking The Back To Quiz Breadcrumbs In The Analysis Page

        WebElement clickingBackToQuizBreadCrumbs = driver.findElement (xpath ("//span[text()='Back to Quiz']"));
        clickingBackToQuizBreadCrumbs.click ();

        // Scrolling The analysis page Forward

        Thread.sleep (3000);
        jse = (JavascriptExecutor) driver;
        jse.executeScript ("window.scrollTo(0, document.body.scrollHeight)");

        // Scrolling The analysis page Backward

        Thread.sleep (3000);
        jse = (JavascriptExecutor) driver;
        jse.executeScript ("window.scrollTo(document.body.scrollHeight,0)");

        // Clicking The Article

        WebElement clickingArticle = driver.findElement (xpath ("//*[@class=\"my-notest article-feed-image\"]"));
        clickingArticle.click ();

        // Scrolling The analysis page Forward

        Thread.sleep (3000);
        jse = (JavascriptExecutor) driver;
        jse.executeScript ("window.scrollTo(0, document.body.scrollHeight)");

        // Scrolling The analysis page Backward

        Thread.sleep (3000);
        jse = (JavascriptExecutor) driver;
        jse.executeScript ("window.scrollTo(document.body.scrollHeight,0)");

        // Clicking The comment icon in the Article page

        clickingCommentIconInAnalysisPage = driver.findElement (xpath ("//*[@id=\"comments-icon\"]"));
        clickingCommentIconInAnalysisPage.click ();

        //  Entering Comment In The TextField

        Thread.sleep (5000);
        enteringTheCommentInTextField = driver.findElement (xpath ("//*[@name=\"comments1\"]"));
        enteringTheCommentInTextField.sendKeys ("Easy To UnderStand, Thank You ");

        // Clicking The Send Button In The Comment Text Field

        Thread.sleep (2000);
        clickingSendButton = driver.findElement (className ("anticon-send"));
        clickingSendButton.click ();

        // Scrolling The analysis page Backward

        Thread.sleep (3000);
        jse = (JavascriptExecutor) driver;
        jse.executeScript ("window.scrollTo(document.body.scrollHeight,0)");

        // Clicking The Share Icon In The Article Page

        Thread.sleep (3000);
        clickingTheShareIcon = driver.findElement (xpath ("//*[@alt=\"share\"]"));
        clickingTheShareIcon.click ();

        //click the copy link in the share popup

        Thread.sleep (3000);
        Copy_link = driver.findElement (xpath ("//span[text()='COPY LINK']"));
        Copy_link.click ();

        //Clicking the cancel button in the in share popup

        waitforCancelButtonclick = new WebDriverWait (driver, Duration.ofSeconds (30));
        Cancel_button = driver.findElement (xpath ("//span[text()='Cancel']"));
        Cancel_button.click ();

        // Clicking The Recent Article


        WebElement clickingRecentArticle = driver.findElement (xpath ("//div[text()='Current Affairs 17 February 2024']"));
        clickingRecentArticle.click ();

        // Clicking Back Button In The article page

        Thread.sleep (2000);
        WebElement clickingBackButton = driver.findElement (xpath ("//span[text()='Back']"));
        clickingBackButton.click ();

        // Again Clicking Back Button In The article page

        Thread.sleep (2000);
        clickingBackButton = driver.findElement (xpath ("//span[text()='Back']"));
        clickingBackButton.click ();
    }

}
