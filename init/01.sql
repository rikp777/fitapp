# create databases
CREATE DATABASE IF NOT EXISTS article; GRANT ALL PRIVILEGES ON fitapp.* TO 'user'@'%';

# create root user and grant rights
GRANT ALL PRIVILEGES ON *.* TO 'root'@'%';
GRANT CREATE, ALTER, INDEX, LOCK TABLES, REFERENCES, UPDATE, DELETE, DROP, SELECT, INSERT ON *.* TO 'user'@'%';