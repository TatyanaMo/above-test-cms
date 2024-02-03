package pageobject.pagesForAbove.Locators;

import org.openqa.selenium.By;

public class BlogPageLocators {

    public static final By HEADER_LOGO = By.xpath(".//div[@class='-mr-28 md:-mr-33 absolute right-full inset-y-0 my-auto']");
    public static final By REVIEW_HEADER_LINK = By.id("profile-link");
    public static final By DROP_DOWN_BUTTONS = By.xpath(".//button[contains(@class, 'h-full flex items-center space-x-2 px-2 py-1')]");
    public static final By LOG_IN_BUTTON = By.xpath(".//button[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full text-center lg:')]");
    public static final By CREATE_PROFILE_BUTTON = By.xpath(".//li[@class='px-3 pb-1']");
    public static final By DROP_DOWN_ELEMENTS = By.xpath(".//a[contains(@class, 'block py-3 lg:py-2 px-5 lg:pr-10 w-full')]");
    public static final By LOG_IN_MODAL_WINDOW = By.id("login-title");
    public static final By MODAL_INPUT_FIELDS = By.xpath(".//input[@class='appearance-none block h-10 leading-8 px-0" +
            " py-1 w-full text-sm rounded-none transition-colors bg-transparent border-b border-gray-300 disabled:border-gray-300" +
            " text-black group-invalid:text-red-500 placeholder-gray-500 disabled:text-gray-500 hover:border-orange-400 focus:border-orange-400" +
            " placeholder-opacity-75 focus:outline-none']");
    public static final By SUBMIT_BUTTONS = By.xpath(".//button[@type='submit']");
    public static final By MODAL_WINDOW_BUTTONS = By.xpath(".//button[@class='text-orange-400 underline hover:no-underline']");
    public static final By CLOSE_BUTTONS = By.xpath(".//span[@class='absolute right-4 top-4 lg:right-0 lg:top-0']/button");
    public static final By SIGN_UP_MODAL_WINDOW = By.id("register-title");
    public static final By TITTLE = By.xpath(".//h1[@class='text-3xl lg:text-4xl font-medium']");
    public static final By BLOG_CONTAINER = By.xpath(".//div[contains(@class, 'overflow-x-auto gap')]");
    public static final By BLOG_CONTAINER_ITEMS = By.xpath(".//div[@class='rounded']");
    public static final By BLOG_MAIN_POST = By.xpath(".//a[@class='flex col-span-1 xl:col-span-3 relative justify-center items-end']");
    public static final By BLOG_TEXT_FOR_ALL_CARDS = By.xpath(".//span[contains(@class, 'self-center')]");
    public static final By BLOG_IMAGES = By.xpath(".//img[@class='h-52 w-full md:h-72 xl:h-100 object-cover rounded-lg']");
    public static final By ALL_POST_BLOG_CARDS = By.xpath(".//div[@class='col-span-1 justify-center gap-x-7 gap-y-8']/a");
    public static final By BLOG_CARD_IMAGES = By.xpath(".//img[@class='absolute h-52 w-full md:h-72 rounded-lg object-cover']");
    public static final By BLOG_BUTTONS = By.xpath(".//button[@data-blog-tag='data-blog-tag']");
    public static final By POST_TITTLE = By.xpath(".//span[contains(@class, 'text-center text-lg md:text-3xl lg:pr-12')]");
    public static final By POST_SUBTITLE = By.xpath(".//div[@class='flex justify-center text-base font-normal mb-8']");
    public static final By POST_TEXT = By.xpath(".//div[@class='text-base rich-content leading-normal mb-16']");
    public static final By POST_MAIN_IMAGE = By.xpath(".//img[@class='max-h-100 w-full object-cover rounded-lg']");
    public static final By POST_IMAGES_IN_TEXT = By.xpath(".//img[contains(@alt, 'Photo by')]");
    public static final By SOCIAL_MEDIA_LINKS = By.xpath(".//div[@class='flex flex-row gap-x-2 m-auto']/a");
    public static final By SUBMIT_REQUEST_BUTTON = By.id("submit-request");
    public static final By BACK_LINK = By.xpath(".//div[@class='flex flex-col lg:flex-row lg:items-center mb-6']/a");
    public static final By LOAD_MORE_BTN = By.id("load-more");
    public static final By FOOTER_LINKS = By.xpath(".//a[@class='text-white hover:underline']");
    public static final By PAYMENTS = By.xpath(".//span[@class='text-sm leading-9']");
    public static final By PAYMENTS_METHODS = By.xpath(".//img[@class='max-w-full select-none']");
    public static final By AIRLINES_PARTNERS = By.xpath(".//img[@src='https://staging.above9.travel/img/airlines-sm.png']");
    public static final By ALL_RIGHTS_TEXT = By.xpath(".//p[@class='text-xs text-center lg:text-sm lg:text-left']");
}
