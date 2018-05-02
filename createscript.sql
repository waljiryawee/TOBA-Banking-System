CREATE TABLE user
(
  userid bigint,
  username varchar(100),
  password varchar(100),
  firstname varchar(100),
  lastname varchar(100),
  phone varchar(15),
  address varchar(100),
  city varchar(100),
  state varchar(100),
  zipcode varchar(100),
  email varchar(100),
  PRIMARY KEY (userid)
);


CREATE TABLE userrole
(
 username varchar(100),
role varchar(100)
);


INSERT INTO userrole(username, role) VALUES ('jsmith', 'admin');
INSERT INTO user(username, password, firstname, lastname, phone, address, city, state, zipcode, email) VALUES('jsmith', 'letmein', '', '', '', '', '', '', '', '');