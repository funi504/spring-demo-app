CREATE TABLE IF NOT EXISTS Content (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(50), -- Assuming status is a string, you can also use ENUM if you have fixed values
    contentType VARCHAR(50), -- Assuming contentType is a string, you can also use ENUM if you have fixed values
    dateCreated TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    dateUpdated TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    url VARCHAR(2083) -- Assuming the URL length is sufficient for 2083 characters
);

INSERT INTO Content (title, description, status, contentType)
VALUES ('my first blog', 'my first blog in the database', 'IDEA', 'ARTICLE');
