-- Table User
CREATE TABLE Users (
    id INT IDENTITY(1,1) PRIMARY KEY,
    userName VARCHAR(50),
    password VARCHAR(100),
    email VARCHAR(100),
    fullName NVARCHAR(100),
    role VARCHAR(50),
    createdAt DATETIME,
    createdBy VARCHAR(50),
    updatedAt DATETIME,    
    updatedBy VARCHAR(50),
    isDeleted BIT DEFAULT 0
);

-- Table Subject
CREATE TABLE Subjects (
    id INT IDENTITY(1,1) PRIMARY KEY,
    subjectName NVARCHAR(100),
    description NVARCHAR(200),
    createdAt DATETIME,
    createdBy VARCHAR(50),
    updatedAt DATETIME,
    updatedBy VARCHAR(50),
    isDeleted BIT DEFAULT 0
);

-- Table UserSubject
CREATE TABLE UserSubject (
    userId INT,
    subjectId INT,
    createdAt DATETIME,
    createdBy VARCHAR(50),
    updatedAt DATETIME,
    updatedBy VARCHAR(50),
    isDeleted BIT DEFAULT 0,
    PRIMARY KEY (userId, subjectId),
    FOREIGN KEY (userId) REFERENCES Users(id),
    FOREIGN KEY (subjectId) REFERENCES Subjects(id)
);

-- Table Quiz
CREATE TABLE Quizzes (
    quizId INT IDENTITY(1,1) PRIMARY KEY,
    title NVARCHAR(100),
    subjectId INT,
    level VARCHAR(50),
    createdAt DATETIME,
    createdBy VARCHAR(50),
    updatedAt DATETIME,
    updatedBy VARCHAR(50),
    isDeleted BIT DEFAULT 0,
    FOREIGN KEY (subjectId) REFERENCES Subjects(id)
);

-- Table Result
CREATE TABLE Results (
    resultId INT IDENTITY(1,1) PRIMARY KEY,
    score FLOAT,
    completedAt DATETIME,
    userId INT,
    quizId INT,
    createdBy VARCHAR(50),
    isDeleted BIT DEFAULT 0,
    FOREIGN KEY (userId) REFERENCES Users(id),
    FOREIGN KEY (quizId) REFERENCES Quizzes(quizId)
);


-- Table Question
CREATE TABLE Questions (
    questionId INT IDENTITY(1,1) PRIMARY KEY,
    title NVARCHAR(255),
    questionType VARCHAR(50),
    quizId INT,
    createdAt DATETIME,
    createdBy VARCHAR(50),
    updatedAt DATETIME,
    updatedBy VARCHAR(50),
    isDeleted BIT DEFAULT 0,
    FOREIGN KEY (quizId) REFERENCES Quizzes(quizId)
);

-- Table Option
CREATE TABLE Options (
    optionId INT IDENTITY(1,1) PRIMARY KEY,
    questionId INT,
    content NVARCHAR(100),
    isCorrect BIT,
    createdAt DATETIME,
    createdBy VARCHAR(50),
    updatedAt DATETIME,
    updatedBy VARCHAR(50),
    isDeleted BIT DEFAULT 0,
    FOREIGN KEY (questionId) REFERENCES Questions(questionId)
);
