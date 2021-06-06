$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PlacingOrder.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Prerana N"
    },
    {
      "line": 2,
      "value": "#Completion Date: 05 June 2021"
    },
    {
      "line": 3,
      "value": "#Status: Completed"
    },
    {
      "line": 4,
      "value": "#Last Edited By: Prerana N"
    },
    {
      "line": 5,
      "value": "#Last Edited Date: 05 June 2021"
    }
  ],
  "line": 8,
  "name": "Placing Order through My store - online",
  "description": "",
  "id": "placing-order-through-my-store---online",
  "keyword": "Feature",
  "tags": [
    {
      "line": 7,
      "name": "@PlacingOrder_Feature"
    }
  ]
});
formatter.scenario({
  "line": 11,
  "name": "To place order for T-Shirt successfully",
  "description": "",
  "id": "placing-order-through-my-store---online;to-place-order-for-t-shirt-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Order_Tshirt"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I launch shopping site URL",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "login to site successfully",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I place order for Tshirt",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "complete shopping checkout details",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should be displayed message for successful checkout",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I should be able to verify the placed order",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.launch_shopping_site()"
});
formatter.result({
  "duration": 86909909008,
  "status": "passed"
});
formatter.match({
  "location": "Steps.login_to_site()"
});
formatter.result({
  "duration": 8235399121,
  "status": "passed"
});
formatter.match({
  "location": "Steps.place_order()"
});
formatter.result({
  "duration": 11586172770,
  "status": "passed"
});
formatter.match({
  "location": "Steps.complete_shopping_checkout_details()"
});
formatter.result({
  "duration": 8420197147,
  "status": "passed"
});
formatter.match({
  "location": "Steps.display_success_msg()"
});
formatter.result({
  "duration": 274066667,
  "status": "passed"
});
formatter.match({
  "location": "Steps.verify_the_placed_order()"
});
formatter.result({
  "duration": 3842666159,
  "status": "passed"
});
formatter.uri("UpdatingPersonalInformation.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Prerana N"
    },
    {
      "line": 2,
      "value": "#Completion Date: 05 June 2021"
    },
    {
      "line": 3,
      "value": "#Status: Completed"
    },
    {
      "line": 4,
      "value": "#Last Edited By: Prerana N"
    },
    {
      "line": 5,
      "value": "#Last Edited Date: 05 June 2021"
    }
  ],
  "line": 8,
  "name": "To update Personal information in My Store site",
  "description": "",
  "id": "to-update-personal-information-in-my-store-site",
  "keyword": "Feature",
  "tags": [
    {
      "line": 7,
      "name": "@Updating_Personal_Information_Feature"
    }
  ]
});
formatter.scenario({
  "line": 11,
  "name": "To update First Name of the customer",
  "description": "",
  "id": "to-update-personal-information-in-my-store-site;to-update-first-name-of-the-customer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Update_First_Name"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I launch shopping site URL",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "login to site successfully",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I update first name",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "save the changes",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should be displayed successful update message on screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.launch_shopping_site()"
});
formatter.result({
  "duration": 48080676957,
  "status": "passed"
});
formatter.match({
  "location": "Steps.login_to_site()"
});
formatter.result({
  "duration": 7793384606,
  "status": "passed"
});
formatter.match({
  "location": "Steps.update_fname()"
});
formatter.result({
  "duration": 7953929872,
  "status": "passed"
});
formatter.match({
  "location": "Steps.save_info_change()"
});
formatter.result({
  "duration": 5054072933,
  "status": "passed"
});
formatter.match({
  "location": "Steps.verify_success_msg()"
});
formatter.result({
  "duration": 57796674,
  "status": "passed"
});
});