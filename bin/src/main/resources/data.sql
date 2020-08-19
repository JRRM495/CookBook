
 
INSERT INTO USER(FIRST_NAME, LAST_NAME, PASSWORD,PROFILE_URL, USERNAME) VALUES
  ('Aliko', 'Dangote', 'password', 'profile_url', 'user1'),
  ('Bill', 'Gates', 'password', 'profile_url', 'user2'),
  ('Folrunsho','Pert', 'password', 'profile_url', 'user3');

INSERT INTO COOKBOOK(DESCRIPTION,PIC,TITLE, USER_ID) VALUES
('This is a description', 'food_porn_pic','Best cookbook of all time', 1),
('This is a description', 'food_porn_pic','Second Best cookbook of all time', 1),
('This is a description', 'food_porn_pic','Third cookbook of all time', 1),
('This is a description', 'food_porn_pic','Forth cookbook of all time', 1),
('This is the third', 'food_porn_pic','Third Best cookbook of all time', 2);


INSERT INTO RECIPE(INSTRUCTIONS,NAME,PIC, COOKBOOK_ID) VALUES
  ('instructions for taco recipe', 'Tacos','food_pic', 1),
('instructions for burger recipe', 'Burger','food_pic', 1);

INSERT INTO INGREDIENT(AMOUNT,NAME,RECIPE_ID) VALUES
  ('1lb', 'Beef', 1),
('1 Cup', 'Flour', 1);

INSERT INTO LIKED_RECIPE(RECIPE_ID, USER_ID) VALUES
  (1,  1),
(1, 2);

INSERT INTO RATE_RECIPE (RATING, RECIPE_ID, USER_ID) VALUES
  (4, 1,  1),
(3, 1, 2);
