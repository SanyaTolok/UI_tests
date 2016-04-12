import MainSettings.Settings;
import Pages.*;
import org.testng.annotations.Test;

public class TestCases_ddi extends Settings
{
    @Test(priority = 0)
    public void company_links_verify_present()
    {
        Company.company_links_present();
    }
    @Test(priority = 0)
    public void get_more_info_portfolio()
    {
        Portfolio.get_more_info();}
    @Test(priority = 0)
    public void send_request()
    {
        HomePage.send_request();
    }
    @Test(priority = 0)
    public void verify_subscription()
    {HomePage.subscribe_email();}
    @Test(priority = 0)
    public void test_blog_tabs()
    {
        Blog.all_tabs_exsist();
    }
    @Test(priority = 0)
    public void share_blog_facebook()
    {
        Blog.share_facebook();
    }
    @Test(priority = 0)
    public void share_blog_tweet()
    {
        Blog.share_tweet();
    }
    @Test(priority = 0)
    public void send_request_contact_us()
    {Contact_US.send_request();}
    @Test(priority = 1)
    public void services_link_present()
    {
        HomePage.services_link_present();
    }
    @Test(priority = 1)
    public void blog_link_present()
    {
        HomePage.blog_link_present();
    }
    @Test(priority = 1)
    public void company_link_present()
    {        HomePage.company_link_present();    }
    @Test(priority = 1)
    public void contuct_us_link_present()
    {
        HomePage.contuct_us_link_present();
    }
    @Test(priority = 1)
    public void portfolio_link_present()
    {
        HomePage.portfolio_link_present();
    }
    @Test(priority = 1)
    public void technology_link_present()
    {
        HomePage.technology_link_present();
    }
    @Test(priority = 1)
    public void get_subscription_cookie()
    {
        HomePage.get_coockie();
    }
}
