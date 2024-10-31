SET IDENTITY_INSERT [dbo].[Options] ON 
GO
INSERT [dbo].[Options] ([optionId], [questionId], [content], [isCorrect], [createdAt], [createdBy], [updatedAt], [updatedBy], [isDeleted]) VALUES (3, 1, N'1', 0, CAST(N'2024-10-31T12:23:00.700' AS DateTime), NULL, NULL, NULL, 0)
GO
INSERT [dbo].[Options] ([optionId], [questionId], [content], [isCorrect], [createdAt], [createdBy], [updatedAt], [updatedBy], [isDeleted]) VALUES (4, 1, N'2', 1, CAST(N'2024-10-31T12:25:55.267' AS DateTime), NULL, CAST(N'2024-10-31T12:43:55.750' AS DateTime), NULL, 0)
GO
INSERT [dbo].[Options] ([optionId], [questionId], [content], [isCorrect], [createdAt], [createdBy], [updatedAt], [updatedBy], [isDeleted]) VALUES (5, 1, N'3', 0, CAST(N'2024-10-31T12:25:59.447' AS DateTime), NULL, NULL, NULL, 0)
GO
INSERT [dbo].[Options] ([optionId], [questionId], [content], [isCorrect], [createdAt], [createdBy], [updatedAt], [updatedBy], [isDeleted]) VALUES (6, 1, N'4', 0, CAST(N'2024-10-31T12:26:05.947' AS DateTime), NULL, NULL, NULL, 0)
GO
SET IDENTITY_INSERT [dbo].[Options] OFF
GO

SET IDENTITY_INSERT [dbo].[Questions] ON 
GO
INSERT [dbo].[Questions] ([questionId], [title], [questionType], [quizId], [createdAt], [createdBy], [updatedAt], [updatedBy], [isDeleted]) VALUES (1, N'1 + 1 = ?', N'Trac', 1, CAST(N'2024-10-31T11:34:44.803' AS DateTime), NULL, CAST(N'2024-10-31T11:55:37.863' AS DateTime), NULL, 0)
GO
INSERT [dbo].[Questions] ([questionId], [title], [questionType], [quizId], [createdAt], [createdBy], [updatedAt], [updatedBy], [isDeleted]) VALUES (2, N'2 * 2 = ?', N'TracNghiem', 1, CAST(N'2024-10-31T11:35:11.477' AS DateTime), NULL, NULL, NULL, 0)
GO
INSERT [dbo].[Questions] ([questionId], [title], [questionType], [quizId], [createdAt], [createdBy], [updatedAt], [updatedBy], [isDeleted]) VALUES (3, N'5 + 6 = ?', N'TracNghiem', 1, CAST(N'2024-10-31T11:35:23.990' AS DateTime), NULL, NULL, NULL, 0)
GO
INSERT [dbo].[Questions] ([questionId], [title], [questionType], [quizId], [createdAt], [createdBy], [updatedAt], [updatedBy], [isDeleted]) VALUES (4, N'4 - 1 = ?', N'TracNghiem', 1, CAST(N'2024-10-31T11:35:39.797' AS DateTime), NULL, NULL, NULL, 0)
GO
SET IDENTITY_INSERT [dbo].[Questions] OFF
GO

SET IDENTITY_INSERT [dbo].[Quizzes] ON 
GO
INSERT [dbo].[Quizzes] ([quizId], [title], [subjectId], [level], [createdAt], [createdBy], [updatedAt], [updatedBy], [isDeleted], [Duration]) VALUES (1, N'Toán nhập môn', 1, N'Easy', CAST(N'2024-10-31T10:43:15.180' AS DateTime), NULL, CAST(N'2024-10-31T10:47:44.127' AS DateTime), NULL, 0, 30)
GO
INSERT [dbo].[Quizzes] ([quizId], [title], [subjectId], [level], [createdAt], [createdBy], [updatedAt], [updatedBy], [isDeleted], [Duration]) VALUES (2, N'Toán rời rạc', 1, N'Hard', CAST(N'2024-10-31T10:43:50.013' AS DateTime), NULL, NULL, NULL, 0, 30)
GO
INSERT [dbo].[Quizzes] ([quizId], [title], [subjectId], [level], [createdAt], [createdBy], [updatedAt], [updatedBy], [isDeleted], [Duration]) VALUES (3, N'LS', 2, N'Medium', CAST(N'2024-10-31T10:46:49.223' AS DateTime), NULL, CAST(N'2024-10-31T10:52:48.407' AS DateTime), NULL, 0, 45)
GO
SET IDENTITY_INSERT [dbo].[Quizzes] OFF
GO

SET IDENTITY_INSERT [dbo].[Subjects] ON 
GO
INSERT [dbo].[Subjects] ([id], [subjectName], [description], [createdAt], [createdBy], [updatedAt], [updatedBy], [isDeleted]) VALUES (1, N'Math', N'HahaHuhu', NULL, NULL, NULL, NULL, 0)
GO
INSERT [dbo].[Subjects] ([id], [subjectName], [description], [createdAt], [createdBy], [updatedAt], [updatedBy], [isDeleted]) VALUES (2, N'History', N'Lịch sử Việt Nam', NULL, NULL, NULL, NULL, 0)
GO
SET IDENTITY_INSERT [dbo].[Subjects] OFF
GO

SET IDENTITY_INSERT [dbo].[Users] ON 
GO
INSERT [dbo].[Users] ([id], [userName], [password], [email], [fullName], [role], [createdAt], [createdBy], [updatedAt], [updatedBy], [isDeleted]) VALUES (2, N'hungpl', N'123', N'hung@gmail.com', N'Hùng', N'admin', NULL, NULL, NULL, NULL, 0)
GO
INSERT [dbo].[Users] ([id], [userName], [password], [email], [fullName], [role], [createdAt], [createdBy], [updatedAt], [updatedBy], [isDeleted]) VALUES (4, N'hung1', N'$2a$10$EyqGXgE/vhQt9yi4jjv7CeTIkCzzwbkLWtCGVNB76tYfJpKEfRhRy', N'hung@s.com', N'Hùng Simple', NULL, NULL, NULL, NULL, NULL, 0)
GO
INSERT [dbo].[Users] ([id], [userName], [password], [email], [fullName], [role], [createdAt], [createdBy], [updatedAt], [updatedBy], [isDeleted]) VALUES (6, N'hung123', N'$2a$10$.2DEKThRjpmP/9141.OBPenjC/L5cEEBpXimpK/8w4.GcGYmJqNtm', N'huhu@12', N'Hungf', N'Student', NULL, NULL, NULL, NULL, 0)
GO
INSERT [dbo].[Users] ([id], [userName], [password], [email], [fullName], [role], [createdAt], [createdBy], [updatedAt], [updatedBy], [isDeleted]) VALUES (7, N'haha', N'123', N'H@123', N'Ha', N'Teacher', NULL, NULL, NULL, NULL, 0)
GO
INSERT [dbo].[Users] ([id], [userName], [password], [email], [fullName], [role], [createdAt], [createdBy], [updatedAt], [updatedBy], [isDeleted]) VALUES (10, N'huhu', N'1', N'Hu@456', N'Hu', N'Admin', NULL, NULL, NULL, NULL, 0)
GO
SET IDENTITY_INSERT [dbo].[Users] OFF
GO