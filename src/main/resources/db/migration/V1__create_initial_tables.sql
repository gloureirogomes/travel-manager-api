CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE users (
  user_id uuid NOT NULL DEFAULT uuid_generate_v4(),
  name VARCHAR(150) NOT NULL,
  email VARCHAR(100) UNIQUE NOT NULL,
  password VARCHAR(300) NOT NULL,
  active BOOLEAN NOT NULL,
  street VARCHAR(100) NOT NULL,
  city VARCHAR(50) NOT NULL,
  neighborhood VARCHAR(50),
  zip_code VARCHAR(50) NOT NULL,
  country VARCHAR(50) NOT NULL,
  updated_at TIMESTAMP NOT NULL DEFAULT now(),
  created_at TIMESTAMP NOT NULL DEFAULT now(),
  PRIMARY KEY(user_id)
);

CREATE TABLE travels (
  travel_id uuid NOT NULL DEFAULT uuid_generate_v4(),
  order_code VARCHAR(30) NOT NULL,
  amount MONEY NOT NULL,
  start_date TIMESTAMP NOT NULL,
  end_date TIMESTAMP NULL,
  type VARCHAR(15) NOT NULL,
  user_id uuid NOT NULL,
  PRIMARY KEY(travel_id),
  CONSTRAINT fk_user FOREIGN KEY(user_id) REFERENCES users(user_id)
);