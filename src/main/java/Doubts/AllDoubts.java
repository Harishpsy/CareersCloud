package Doubts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

import static org.openqa.selenium.By.*;

public class AllDoubts {

    WebDriver driver;

    public AllDoubts(WebDriver driver) {

        this.driver = driver;
    }

    public void allDoubts() throws AWTException, InterruptedException {

        // Clicking The Create Doubt Button

        WebElement clickingCreateButton = driver.findElement (xpath ("//*[@class=\"ant-btn css-xu9wm8 ant-btn-primary add-doubts-btn\"]"));
        clickingCreateButton.click ();


        // Clicking the search textfield and searching the course

        Thread.sleep (5000);
        WebElement clickingSearch = driver.findElement (xpath ("(//*[@name=\"comments2\"])[2]"));
        clickingSearch.sendKeys ("Mock");

        // Pressing The KeyBoard Action

        Robot robot = new Robot ();

        // clicking The Enter Button

        Thread.sleep (3000);
        robot.keyPress (KeyEvent.VK_ENTER);

        // Releasing The Enter Button

        Thread.sleep (5000);
        robot.keyRelease (KeyEvent.VK_ENTER);

        // Pressing Backspace Button In The Keyboard

        // Set the number of times to perform the action

        int numberOfTimes = 4;

        // Creating a Loop to performe this action multiple times

        for (int i = 0; i < numberOfTimes; i++) {
            Thread.sleep (3000);
            robot.keyPress (KeyEvent.VK_BACK_SPACE);

            // Releasing the BackSpace

            robot.keyRelease (KeyEvent.VK_BACK_SPACE);
        }

        // Pressing The Enter Button In The Keyboard

        Thread.sleep (3000);
        robot.keyPress (KeyEvent.VK_ENTER);

        // Releassing The Enter Button In The Keyboard

        robot.keyRelease (KeyEvent.VK_ENTER);
        System.out.println ("SucessFully Released The Enter Button");

//        // Focucing the popup
//
//        WebElement foucsingPopup = driver.findElement (By.xpath (""));
//        foucsingPopup.click ();
//
//       // Scroll The Page Using Java Executer
//
//        System.out.println ("Entering Scroll ");
//        Thread.sleep (3000);
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript ("window.scrollTo(0,document.body.scrollHeight)");
//        System.out.println ("SucessFully Released The Enter Button");

        // Clicking the Course to Create the Doubt

        Thread.sleep (5000);
        WebElement clickingCourse = driver.findElement (xpath ("(//*[@class=\"doubt2\"])[1]"));
        clickingCourse.click ();

        // Clicking the post-Doubts

        Thread.sleep (5000);
        WebElement clickingPostDoubts = driver.findElement (xpath ("//*[text()=\"Post Doubts\"]"));
        clickingPostDoubts.click ();

        // Entering The Text

        Thread.sleep (5000);
        WebElement enteringText = driver.findElement (xpath ("//*[@placeholder=\"Write your Doubts & Just paste(Ctrl+v) your cropped image here\"]"));
        enteringText.sendKeys ("Where Can I Buy The Crack Current Affairs");

//        // Clicking the upload Buttton
//
//        WebElement clickingupload = driver.findElement (xpath ("//*[@alt=\"image_upload\"]"));
//        clickingupload.click ();
//
//        // Uploading Image in the Comment text field
//
//        Thread.sleep (3000);
//        String file = "\"C:\\Users\\Lenovo Desktop 03\\Downloads\\Telegram Desktop\\Blank log.png\"";
//        StringSelection selection = new StringSelection (file);
//        Toolkit.getDefaultToolkit ().getSystemClipboard ().setContents (selection, null);
//        System.out.println (file);
//
//        // Pressing the keyboard button
//
//        robot = new Robot ();
//
//        //Pressing The Key
//
//        Thread.sleep (3000);
//        robot.keyPress (KeyEvent.VK_CONTROL);
//        robot.keyPress (KeyEvent.VK_V);
//
//        // Releasing the Key
//
//        Thread.sleep (3000);
//        robot.keyRelease (KeyEvent.VK_V);
//        robot.keyRelease (KeyEvent.VK_CONTROL);
//
//        // Clicking The Enter Key
//
//        Thread.sleep (3000);
//        robot.keyPress (KeyEvent.VK_ENTER);
//
//        // Releasing The Enter Key
//
//        Thread.sleep (3000);
//        robot.keyRelease (KeyEvent.VK_ENTER);

        // Clicking the close Button

        Thread.sleep (5000);
        WebElement clickingCancelButton = driver.findElement (xpath ("(//*[@alt=\"Close\"])[2]"));
        clickingCancelButton.click ();

//        // Clicking The send-Button
//
//        Thread.sleep (5000);
//        WebElement clickingSendButton= driver.findElement (xpath ("//*[@alt=\"send_doubts\"]"));
//        clickingSendButton.click();

        // Clicking the Follow Icon

        WebElement followIcon = driver.findElement (By.xpath ("//*[@alt=\"followed\"]"));
        WebElement unfollowIcon = driver.findElement (By.xpath ("//*[@alt=\"followed\"]"));

        if (followIcon != null) {
            followIcon.click ();
            System.out.println ("Successfully clicked Follow");
        } else if (unfollowIcon != null) {
            unfollowIcon.click ();
            System.out.println ("Successfully clicked Unfollow");
        } else {
            System.out.println ("Could not find follow or unfollow icon element.");
        }

        // Clicking the Answer Icon

        WebElement clickingAnswericon = driver.findElement (id ("comments-icon"));
        clickingAnswericon.click ();

        // Entering the text

        WebElement Enteringtext = driver.findElement (id ("teatx-area-id"));
        Enteringtext.sendKeys ("Thanks");

//        // Clicking the Send button
//
//        Thread.sleep (3000);
//        WebElement clickingSendbutton = driver.findElement (xpath ("(//*[@alt=\"send_doubts\"])[2]"));
//        clickingSendbutton.click ();
//
//        // Clicking the Reply button
//
//        WebElement clickingReplyButton = driver.findElement (xpath ("//*[text()=' Reply']"));
//        clickingReplyButton.click ();
//
//        // Entering the text in reply text field
//
//        Thread.sleep (5000);
//        enteringText = driver.findElement (id ("reply_text"));
//        enteringText.sendKeys ("Thanks For the answer");
//
//        // Clicking the send button
//
//        Thread.sleep (5000);
//        WebElement clickingSendButton = driver.findElement (xpath ("(//*[@alt=\"send_doubts\"])[2]"));
//        clickingSendButton.click ();
//
//        // Clicking The Like Button
//
//        Thread.sleep (5000);
//        WebElement clickingLikeButton = driver.findElement (xpath ("//*[@alt=\"liked\"]"));
//        clickingLikeButton.click ();

        // Clicking the close Button

        Thread.sleep (5000);
        WebElement clickingCloseButton = driver.findElement (xpath ("(//img[@alt=\"Close\"])[3]"));
        clickingCloseButton.click ();

        // Clicking The share Icon

        Thread.sleep (5000);
        WebElement clickingshareicon = driver.findElement (xpath ("//*[@alt=\"share\"]"));
        clickingshareicon.click ();

        //click the copy link in the share popup

        Thread.sleep (3000);
        WebElement Copy_link = driver.findElement (xpath ("//span[text()='COPY LINK']"));
        Copy_link.click ();

        //Clicking the cancel button in the in share popup

        Thread.sleep (5000);
        WebElement Cancel_button = driver.findElement (xpath ("//span[text()='Cancel']"));
        Cancel_button.click ();

        // Clicking The three Dots in the doubts

        Thread.sleep (5000);
        WebElement clickingThreeDots = driver.findElement (xpath ("//*[@class=\"doubts-Menu\"]"));
        clickingThreeDots.click ();

        // Clicking The report Icon in the dropdown

        Thread.sleep (5000);
        WebElement clickingReport = driver.findElement (xpath ("//*[text()='Report']"));
        clickingReport.click ();

        //Click the wrong information radio button

        Thread.sleep (5000);
        WebElement Wrong_information_radio_button = driver.findElement (xpath ("//span[text()='Wrong Information']"));
        Wrong_information_radio_button.click ();

        //Entering the text inside the report text field

        Thread.sleep (5000);
        WebElement Enter_the_report = driver.findElement (name ("reportDescription"));
        Enter_the_report.sendKeys ("Checking The text was Entering In The Report Text Field");

        // Clicking The Cancel Button

        Thread.sleep (5000);
        Cancel_button = driver.findElement (xpath ("//span[text()='CANCEL']"));
        Cancel_button.click ();

//        // Click the report button
//
//        Thread.sleep (5000);
//        WebElement Report_button = driver.findElement (xpath ("//span[text()='REPORT']"));
//        Report_button.click ();

        // Clicking The Doubt card Publish
//
//        System.out.println ("SucessFully Entered");
//        Thread.sleep (5000);
//        WebElement clickingdoubtname = driver.findElement (xpath ("(//*[@class=\"anticon anticon-right\"])[2]"));
//        clickingdoubtname.click ();
//        System.out.println ("SucessFully clicked");

        int numberoftimeclickingarrow = 2;

        for (int i = 0; i < numberoftimeclickingarrow; i++) {
            try {
                Thread.sleep (5000);
                WebElement clickingdoubtname = driver.findElement (By.xpath ("(//*[@class=\"anticon anticon-right\"])[2]"));
                clickingdoubtname.click ();
                System.out.println ("Successfully clicked on element " + (i + 1) + " time(s).");
            } catch (Exception e) {
                System.out.println ("Failed to find or click element: " + e.getMessage ());
            }
        }

        // Scrolling the doubt page

        int numberoftimesscroll = 20;

        for (int i = 0; i < numberoftimesscroll; i++) {
            try {
                Thread.sleep (3000);
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                jse.executeScript ("window.scrollTo(0,document.body.scrollHeight)");
                System.out.println ("Successfully scroll The page " + (i + 19) + " time(s).");
            } catch (Exception scroll) {
                System.out.println ("Failed to Scroll : " + scroll.getMessage ());
            }
        }

        // clicking the Float button

        Thread.sleep (5000);
        WebElement clickingFloatButton = driver.findElement (xpath ("//*[@class=\"anticon anticon-vertical-align-top\"]"));
        clickingFloatButton.click ();


    }
}

