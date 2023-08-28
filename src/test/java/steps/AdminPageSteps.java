package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AdminPage;

public class AdminPageSteps {
    AdminPage adminPage = new AdminPage(DriverFactory.getDriver());

    @When("User clicks on administration icon on left tool bar")
    public void user_clicks_on_administration_icon_on_left_tool_bar() {
        adminPage.clickAdminIcon();

    }

    @When("User clicks on letter template icon on administration page")
    public void user_clicks_on_letter_template_icon_on_administration_page() {
        adminPage.clickOnLetterIcon();
    }

    @Then("User will able to see list of existing letters")
    public void user_will_able_to_see_list_of_existing_letters() {
        String data = adminPage.fetchData();
        System.out.println(data);
    }

    @When("User clicks on edit icon against letter letter template name in list")
    public void user_clicks_on_edit_icon_against_letter_letter_template_name_in_list() {
        adminPage.clickOnAddLetterTemplateIcon();

    }

    @Then("User will redirects to edit letter template page")
    public void user_will_redirects_to_edit_letter_template_page() {
        String Message = adminPage.displayedMessage();
        Assert.assertEquals(Message, "Edit Letter Template");
    }

    @Then("User will able to edit available fields on page")
    public void user_will_able_to_edit_available_fields_on_page() {
        adminPage.editData();

    }

    @Then("Account page displays with icons and corresponding page displays by clicking on icon.")
    public void account_page_displays_with_icons_and_corresponding_page_displays_by_clicking_on_icon() {
        adminPage.traversingThroughPages();

    }



//    @When("User clicks on search button on manage agent page")
//    public void user_clicks_on_search_button_on_manage_agent_page() {
//        adminPage.clickOnButtonOnManageAgentPage();
//    }
//
//    @Then("Appropriate agent details displays on manage agent page")
//    public void appropriate_agent_details_displays_on_manage_agent_page() {
//        String agentDetails = adminPage.verifyDetailsOfAgentList();
//        if (agentDetails.length() > 0) {
//            System.out.println(agentDetails);
//        } else {
//            System.out.println("No Record Found Through Filtering on Manage Agent Page ");
//        }
//    }
//
//    //Add agent page displays with all details by clicking on add agent button on manage agent page
//    @When("User clicks on add agent button on manage agent page")
//    public void user_clicks_on_add_agent_button_on_manage_agent_page() {
//        adminPage.clickOnAddAgentButton();
//    }
//
//    @Then("Add agent page displays with all details")
//    public void add_agent_page_displays_with_all_details() {
//        String addAgentPage = adminPage.verifyAddAgentPage();
//        Assert.assertEquals(addAgentPage, "Add Agent");
//    }
//
//    //Manage Company page displays with list of companies by clicking on company icon on administration page
//
//    @When("User clicks on company icon")
//    public void user_clicks_on_company_icon() {
//        adminPage.clickOnCompanyIcon();
//
//    }
//
//    @Then("Manage company page displays with list of available companies")
//    public void manage_company_page_displays_with_list_of_available_companies() {
//        String companyDetail = adminPage.fetchAndDisplaysManageCompanyDetails();
//        if (companyDetail.length() > 0) {
//            System.out.println(companyDetail);
//        } else {
//            System.out.println("Company detail page does not displays");
//        }
//    }
//
//    //Filter details on manage company page upon option of state and country drop down
//    @When("User selects options from state and country drop down")
//    public void user_selects_options_from_state_and_country_drop_down() {
//        adminPage.selectOptionsFromDropDownOnManageCompany();
//    }
//
//    @Then("Appropriate list of company displays on manage company page")
//    public void appropriate_list_of_company_displays_on_manage_company_page() {
//        String companyList = adminPage.verifyDetailsOfCompany();
//        if (companyList.length() > 0) {
//            System.out.println(companyList);
//        } else {
//            System.out.println("List of company do not fount as per option of drop down on manage company page");
//        }
//    }
//
//    //Add company page displays with all details by clicking on add company button on manage company page
//
//    @When("User clicks on add company button on manage company page")
//    public void user_clicks_on_add_company_button_on_manage_company_page() {
//        adminPage.clickOnAddCompanyButton();
//    }
//
//    @Then("Add company page displays with all details")
//    public void add_company_page_displays_with_all_details() {
//        String addCompanyPage = adminPage.verifyAddCompanyPage();
//        Assert.assertEquals(addCompanyPage, "Add Company");
//    }

}
