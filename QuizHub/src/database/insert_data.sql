INSERT INTO Users (userName, password, email, fullName, role, createdAt, createdBy, isDeleted) VALUES
('user1', 'password1', 'user1@example.com', N'Nguyễn Văn A', 'admin', GETDATE(), 'system', 0),
('user2', 'password2', 'user2@example.com', N'Lê Thị B', 'user', GETDATE(), 'system', 0);

INSERT INTO Subjects (subjectName, description, createdAt, createdBy, isDeleted) VALUES
(N'Toán', N'Môn Toán học', GETDATE(), 'system', 0),
(N'Văn', N'Môn Ngữ văn', GETDATE(), 'system', 0);

INSERT INTO UserSubject (userId, subjectId, createdAt, createdBy, isDeleted) VALUES
('user1', 1, GETDATE(), 'system', 0),
('user1', 2, GETDATE(), 'system', 0),
('user2', 1, GETDATE(), 'system', 0);

INSERT INTO Quizzes (title, subjectId, level, createdAt, createdBy, isDeleted) VALUES
(N'Đề thi Toán học', 1, N'Khó', GETDATE(), 'system', 0),
(N'Đề thi Ngữ văn', 2, N'Trung bình', GETDATE(), 'system', 0);

INSERT INTO Results (score, completedAt, userId, quizId, createdBy, isDeleted) VALUES
(8.5, GETDATE(), 1, 1, GETDATE(), 'system', 0),
(7.0, GETDATE(), 2, 2, GETDATE(), 'system', 0);

INSERT INTO Questions (title, questionType, quizId, createdAt, createdBy, isDeleted) VALUES
(N'Trắc nghiệm', N'Câu hỏi 1', 1, GETDATE(), 'system', 0),
(N'Tự luận', N'Câu hỏi 2', 2, GETDATE(), 'system', 0);

INSERT INTO Options (questionId, content, isCorrect, createdAt, createdBy, isDeleted) VALUES
(1, N'Đáp án A', 1, GETDATE(), 'system', 0),
(1, N'Đáp án B', 0, GETDATE(), 'system', 0),
(1, N'Đáp án C', 0, GETDATE(), 'system', 0),
(1, N'Đáp án D', 0, GETDATE(), 'system', 0);



