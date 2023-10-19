set foreign_key_checks = 0;

INSERT INTO township (name, division) VALUES ('Bahan', 'Yangon');
INSERT INTO township (name, division) VALUES ('Sanchaung', 'Yangon');
INSERT INTO township (name, division) VALUES ('Dagon', 'Yangon');
INSERT INTO township (name, division) VALUES ('Tamwe', 'Yangon');
INSERT INTO township (name, division) VALUES ('Pazundaung', 'Yangon');
INSERT INTO township (name, division) VALUES ('Hlaing', 'Yangon');
INSERT INTO township (name, division) VALUES ('Kamayut', 'Yangon');
INSERT INTO township (name, division) VALUES ('Lanmadaw', 'Yangon');
INSERT INTO township (name, division) VALUES ('Kyauktada', 'Yangon');
INSERT INTO township (name, division) VALUES ('Dagon Seikkan', 'Yangon');


INSERT INTO address (building, street, township_id) VALUES ('123', 'Saya San Road', 1);
INSERT INTO address (building, street, township_id) VALUES ('456', 'U Wisara Road', 2);
INSERT INTO address (building, street, township_id) VALUES ('789', 'Dagon Centre Street', 3);
INSERT INTO address (building, street, township_id) VALUES ('101', 'Tamwe Road', 4);
INSERT INTO address (building, street, township_id) VALUES ('222', 'Thein Phyu Road', 5);
INSERT INTO address (building, street, township_id) VALUES ('333', 'Hlaing Tharyar Road', 6);
INSERT INTO address (building, street, township_id) VALUES ('444', 'Kamayut Road', 7);
INSERT INTO address (building, street, township_id) VALUES ('555', 'Lanmadaw Street', 8);
INSERT INTO address (building, street, township_id) VALUES ('666', 'Bo Aung Kyaw Street', 9);
INSERT INTO address (building, street, township_id) VALUES ('777', 'Dagon Seikkan Road', 10);

INSERT INTO customer (name, phone, email) VALUES ('Alice Smith', '555-123-4567', 'alice@email.com');
INSERT INTO customer (name, phone, email) VALUES ('Bob Johnson', '555-987-6543', 'bob@email.com');
INSERT INTO customer (name, phone, email) VALUES ('Charlie Brown', '555-555-5555', 'charlie@email.com');
INSERT INTO customer (name, phone, email) VALUES ('David Lee', '555-111-2222', 'david@email.com');
INSERT INTO customer (name, phone, email) VALUES ('Eva Wilson', '555-333-4444', 'eva@email.com');
INSERT INTO customer (name, phone, email) VALUES ('Frank Martin', '555-777-8888', 'frank@email.com');
INSERT INTO customer (name, phone, email) VALUES ('Grace Davis', '555-999-0000', 'grace@email.com');
INSERT INTO customer (name, phone, email) VALUES ('Henry Young', '555-444-3333', 'henry@email.com');
INSERT INTO customer (name, phone, email) VALUES ('Ivy Robinson', '555-666-7777', 'ivy@email.com');
INSERT INTO customer (name, phone, email)VALUES ('Jack Harris', '555-222-1', 'jack@email.com');

INSERT INTO sale (sale_date, customer_id) VALUES ('2023-10-01', 1);
INSERT INTO sale (sale_date, customer_id) VALUES ('2023-10-02', 2);
INSERT INTO sale (sale_date, customer_id) VALUES ('2023-10-03', 3);
INSERT INTO sale (sale_date, customer_id) VALUES ('2023-10-04', 4);
INSERT INTO sale (sale_date, customer_id) VALUES ('2023-10-05', 5);
INSERT INTO sale (sale_date, customer_id) VALUES ('2023-10-06', 6);
INSERT INTO sale (sale_date, customer_id) VALUES ('2023-10-07', 7);
INSERT INTO sale (sale_date, customer_id) VALUES ('2023-10-08', 8);
INSERT INTO sale (sale_date, customer_id) VALUES ('2023-10-09', 9);
INSERT INTO sale (sale_date, customer_id) VALUES ('2023-10-10', 10);

INSERT INTO category (name) VALUES ('Electronics');
INSERT INTO category (name) VALUES ('Clothing');
INSERT INTO category (name) VALUES ('Furniture');
INSERT INTO category (name) VALUES ('Books');
INSERT INTO category (name) VALUES ('Toys');
INSERT INTO category (name) VALUES ('Appliances');
INSERT INTO category (name) VALUES ('Sports Equipment');
INSERT INTO category (name) VALUES ('Jewelry');
INSERT INTO category (name) VALUES ('Automotive');
INSERT INTO category (name) VALUES ('Home Decor');

INSERT INTO product (name, price, category_id) VALUES ('Smartphone', 599.99, 1);
INSERT INTO product (name, price, category_id) VALUES ('T-shirt', 19.99, 2);
INSERT INTO product (name, price, category_id) VALUES ('Sofa', 499.99, 3);
INSERT INTO product (name, price, category_id) VALUES ('Novel', 9.99, 4);
INSERT INTO product (name, price, category_id) VALUES ('Action Figure', 12.99, 5);
INSERT INTO product (name, price, category_id) VALUES ('Refrigerator', 799.99, 6);
INSERT INTO product (name, price, category_id) VALUES ('Basketball', 24.99, 7);
INSERT INTO product (name, price, category_id) VALUES ('Necklace', 49.99, 8);
INSERT INTO product (name, price, category_id) VALUES ('Car Battery', 89.99, 9);
INSERT INTO product (name, price, category_id) VALUES ('Wall Art', 29.99, 10);

INSERT INTO product_sale (product_id, sale_id, quantity) VALUES (1, 1, 5);
INSERT INTO product_sale (product_id, sale_id, quantity) VALUES (2, 2, 3);
INSERT INTO product_sale (product_id, sale_id, quantity) VALUES (3, 3, 2);
INSERT INTO product_sale (product_id, sale_id, quantity) VALUES (4, 4, 1);
INSERT INTO product_sale (product_id, sale_id, quantity) VALUES (5, 5, 4);
INSERT INTO product_sale (product_id, sale_id, quantity) VALUES (6, 6, 2);
INSERT INTO product_sale (product_id, sale_id, quantity) VALUES (7, 7, 5);
INSERT INTO product_sale (product_id, sale_id, quantity) VALUES (8, 8, 1);
INSERT INTO product_sale (product_id, sale_id, quantity) VALUES (9, 9, 3);
INSERT INTO product_sale (product_id, sale_id, quantity) VALUES (10, 10, 2);


