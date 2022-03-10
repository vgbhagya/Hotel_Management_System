
# TEST PLAN:

## Table 1: High Level Test Plan

| Test ID | Description               | Objective                   | Test Conditions         | Status    | Type Of Test |
|-------------|-------------------------------|------------------------------------|-------------------------------|---------------|----------------|
|  HLR01      | Admin Login                   | Verify that Admin login            |  1. Admin Login button is displayed in the main menu | PASS          | Requirement Based  |
|  HLR01      | Admin Login                   | Verify that Admin login            |  2. Admin can login upon clicking the Admin login button.   | PASS          | Requirement Based  |
|  HLR02      | Registration                  | Verify that Registration           |  1. Registration button is displayed to the Admin.  | PASS          | Requirement Based |
|  HLR02      | Registration                  | Verify that Registration           |  2. Admin can Register upon clicking the Registration button.  | PASS          | Requirement Based |
|  HLR03      | Adding Hotel                  | Verify the System Adding Hotels    |  Adding hotels can be done by the Admin  | PASS     | Scenario Based      |
|  HLR04      | User Registration             | Verify that User Registration      | 1. User registration button is displayed to the User | PASS  | Requirement Based   |
|  HLR04      | User Registration             | Verify that User Registration      | 2.User can register upon clicking the User registration button.  | PASS  | Requirement Based   |
|  HLR05      | List Of Hotels                | Verify the System display the List of Hotels | 1.List of hotels can be displayed to the User     | PASS | Scenario Based  |
|  HLR06      | Check in & Check out Dates    | Verify the System display the Check in and Check out Dates | 1.Arrival Date is entered by the user. | PASS   | Scenario Based  | 
|  HLR06      | Check in & Check out Dates    | Verify the System display the Check in and Check out Dates | 2.Number of nights are entered by the user.  | PASS   | Scenario Based  |
|  HLR07      | Feedback Form to Users        | Verify the System display the feedback form | 1. Feedback form is displayed to users.  | PASS     | Scenarion Based           |


## Table 2: Low Level Test Plan

| Test ID | Description               | Objective                   | Test Conditions         | Status    | Type Of Test |
|-------------|-------------------------------|------------------------------------|-------------------------------|---------------|----------------|
|  LLR01      | Admin Login/Registration                   | Verify that Admin login            | Admin must able to login with his credentials | PASS          | Requirement Based  |
|  LLR02      | Hotel Registration                  | Verify that Registration           | Registration must be done by any registered users.  | PASS          | Requirement Based |
|  LLR03      | Adding number of rooms in the hotels                | Verify the System Adding Hotel Rooms    |  Admin must be able Add rooms available in hotels  | PASS     | Scenario Based      |
|  LLR04      | Updating type of rooms and cost of per room           | Verify that Admin update room details      | Admin must be able to update room details  | PASS  | Requirement Based   |
|  LLR05      | User Registration               | users registration | users must be able to register them selves    | PASS | Scenario Based  |
|  LLR06      | User Login/Logout   | user login and logout | user must be able login and logout | PASS   | Scenario Based  | 
|  LLR07      | View the hotels based on location  | view hotel and location| user must be able to view the hotel based on location | PASS     | Scenarion Based           |
|  LLR08      | Check the availability of the rooms | room availability | user must be able see availablity of rooms  | PASS     | Scenarion Based           |
|  LLR09      | Booking confirmation | hotel and room booking info | user must be able to see the booking information  | PASS     | Scenarion Based           |
|  LLR10      | Feedback Form to Users | Hotel service feedback form | user must be able to fill the feedback form  | PASS     | Scenarion Based           |
