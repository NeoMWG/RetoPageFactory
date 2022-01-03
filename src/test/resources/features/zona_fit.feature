Feature: purchase of products

  as a user of the Zonafit.co system I wish to enter the platform of products on sale and place an order

  Scenario: Products in offer

    Given the person is on the shopping page of the website
    When this person enters the purchasing section and makes their choice of orders and fills in the transaction fields
    Then the person should be able to see a message of the process completed successfully

