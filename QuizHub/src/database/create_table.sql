USE [master]
GO
/****** Object:  Database [QuizHub]    ******/
CREATE DATABASE [QuizHub]
ALTER DATABASE [QuizHub] SET COMPATIBILITY_LEVEL = 150
GO
USE [QuizHub]
GO

/****** Object:  Table [dbo].[Options]    ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Options](
	[optionId] [int] IDENTITY(1,1) NOT NULL,
	[questionId] [int] NULL,
	[content] [nvarchar](100) NULL,
	[isCorrect] [bit] NULL,
	[createdAt] [datetime] NULL,
	[createdBy] [varchar](50) NULL,
	[updatedAt] [datetime] NULL,
	[updatedBy] [varchar](50) NULL,
	[isDeleted] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[optionId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Questions]    ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Questions](
	[questionId] [int] IDENTITY(1,1) NOT NULL,
	[title] [nvarchar](255) NULL,
	[questionType] [varchar](50) NULL,
	[quizId] [int] NULL,
	[createdAt] [datetime] NULL,
	[createdBy] [varchar](50) NULL,
	[updatedAt] [datetime] NULL,
	[updatedBy] [varchar](50) NULL,
	[isDeleted] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[questionId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Quizzes]    ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Quizzes](
	[quizId] [int] IDENTITY(1,1) NOT NULL,
	[title] [nvarchar](100) NULL,
	[subjectId] [int] NULL,
	[level] [varchar](50) NULL,
	[createdAt] [datetime] NULL,
	[createdBy] [varchar](50) NULL,
	[updatedAt] [datetime] NULL,
	[updatedBy] [varchar](50) NULL,
	[isDeleted] [bit] NULL,
        [Duration] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[quizId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Results]    ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Results](
	[resultId] [int] IDENTITY(1,1) NOT NULL,
	[score] [float] NULL,
	[completedAt] [datetime] NULL,
	[userId] [int] NULL,
	[quizId] [int] NULL,
	[createdBy] [varchar](50) NULL,
	[isDeleted] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[resultId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Subjects]    ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Subjects](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[subjectName] [nvarchar](100) NULL,
	[description] [nvarchar](200) NULL,
	[createdAt] [datetime] NULL,
	[createdBy] [varchar](50) NULL,
	[updatedAt] [datetime] NULL,
	[updatedBy] [varchar](50) NULL,
	[isDeleted] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Users]    ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Users](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[userName] [varchar](50) NULL,
	[password] [varchar](100) NULL,
	[email] [varchar](100) NULL,
	[fullName] [nvarchar](100) NULL,
	[role] [varchar](50) NULL,
	[createdAt] [datetime] NULL,
	[createdBy] [varchar](50) NULL,
	[updatedAt] [datetime] NULL,
	[updatedBy] [varchar](50) NULL,
	[isDeleted] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[UserSubject]    ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[UserSubject](
	[userId] [int] NOT NULL,
	[subjectId] [int] NOT NULL,
	[createdAt] [datetime] NULL,
	[createdBy] [varchar](50) NULL,
	[updatedAt] [datetime] NULL,
	[updatedBy] [varchar](50) NULL,
	[isDeleted] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[userId] ASC,
	[subjectId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Options] ADD  DEFAULT ((0)) FOR [isDeleted]
GO
ALTER TABLE [dbo].[Questions] ADD  DEFAULT ((0)) FOR [isDeleted]
GO
ALTER TABLE [dbo].[Quizzes] ADD  DEFAULT ((0)) FOR [isDeleted]
GO
ALTER TABLE [dbo].[Results] ADD  DEFAULT ((0)) FOR [isDeleted]
GO
ALTER TABLE [dbo].[Subjects] ADD  DEFAULT ((0)) FOR [isDeleted]
GO
ALTER TABLE [dbo].[Users] ADD  DEFAULT ((0)) FOR [isDeleted]
GO
ALTER TABLE [dbo].[UserSubject] ADD  DEFAULT ((0)) FOR [isDeleted]
GO
ALTER TABLE [dbo].[Options]  WITH CHECK ADD FOREIGN KEY([questionId])
REFERENCES [dbo].[Questions] ([questionId])
GO
ALTER TABLE [dbo].[Questions]  WITH CHECK ADD FOREIGN KEY([quizId])
REFERENCES [dbo].[Quizzes] ([quizId])
GO
ALTER TABLE [dbo].[Quizzes]  WITH CHECK ADD FOREIGN KEY([subjectId])
REFERENCES [dbo].[Subjects] ([id])
GO
ALTER TABLE [dbo].[Results]  WITH CHECK ADD FOREIGN KEY([quizId])
REFERENCES [dbo].[Quizzes] ([quizId])
GO
ALTER TABLE [dbo].[Results]  WITH CHECK ADD FOREIGN KEY([userId])
REFERENCES [dbo].[Users] ([id])
GO
ALTER TABLE [dbo].[UserSubject]  WITH CHECK ADD FOREIGN KEY([subjectId])
REFERENCES [dbo].[Subjects] ([id])
GO
ALTER TABLE [dbo].[UserSubject]  WITH CHECK ADD FOREIGN KEY([userId])
REFERENCES [dbo].[Users] ([id])
GO
USE [master]
GO
ALTER DATABASE [QuizHub] SET  READ_WRITE 
GO