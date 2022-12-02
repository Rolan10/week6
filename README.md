# week6 Assetment BACKEND, here I'll be writting all the steps and decisions made for creating this project.
CRM APP

In order to start working in this project the first steeps taken where to design all the logic for creating the API with SpringBoot, once I had decided to use a DB, and created the relations, in order to clarify about all the requirements and how to abord them, i design a Use case diagram.

With all the design already created, I start developing following the TDD technique
learned during the bootcamp, starting with the DB and the entities, 
for continue through controller, service, leaving this last one without implementing
for create the test, then commit to repo, and finally implementing the service.

In many cases, I've needed to change some information like params, inside the test once the service was created.

After doing all the Banckend with Java Spring Boot, I started with the frontend in React, for this project I decided to follow a Routes structure and make the calls to the API without Axios, using fecth. In the end i was able to cover all the functionality that i planned to do.

Finally, I created a Selenium project to test all the functionality of the frontend being the biggest test, to create a contact(creating aswell a opportunity) veryfying that has been created, converting that opportunity into a client. veryfying that has been converted, and then deleting this client, veryfying that have been deleted.

Link Backend repo: https://github.com/Rolan10/week6.git
Link Frontend repo: https://github.com/Rolan10/week6_front.git
Link SeleniumTest repo: https://github.com/Rolan10/Week6Selenium.git
