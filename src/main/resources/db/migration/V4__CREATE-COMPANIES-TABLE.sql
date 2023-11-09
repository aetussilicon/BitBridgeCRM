CREATE TABLE companies (
    gsid VARCHAR(10) PRIMARY KEY UNIQUE,
    razao_social VARCHAR(255) NOT NULL,
    cnpj VARCHAR(14) NOT NULL,
    industry VARCHAR(255),
    address VARCHAR(255) NOT NULL,
    city VARCHAR(255) NOT NULL,
    postal_code VARCHAR(8) NOT NULL,
    country VARCHAR(255) NOT NULL,
    website VARCHAR(255),
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    channel VARCHAR(50) NOT NULL
);